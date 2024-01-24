# -*- coding: utf-8 -*-
"""
Winnow Similarity Detection for Java Code (alternative implementation)

Martinez-Gil, J. (2024). Source Code Clone Detection Using Unsupervised Similarity Measures. arXiv preprint arXiv:2401.09885.

@author: Jorge Martinez-Gil
"""

import os
import difflib
import javalang
from javalang.tree import CompilationUnit, MethodDeclaration
from collections import Counter

def winnow(text, k, w):
    # Split the text into k-grams
    k_grams = [text[i:i+k] for i in range(len(text)-k+1)]

    # Initialize the window and fingerprint
    window = []
    fingerprint = []

    # Loop through each k-gram
    for i, k_gram in enumerate(k_grams):
        # Add the k-gram to the window
        window.append(k_gram)

        # If the window is full, select the smallest hash value
        if len(window) == w:
            min_hash = float('inf')
            min_index = -1
            for j, k_gram in enumerate(window):
                hash_value = hash(k_gram)
                if hash_value < min_hash:
                    min_hash = hash_value
                    min_index = j
            fingerprint.append(min_hash)

            # Remove the oldest k-gram from the window
            window.pop(min_index)

    return fingerprint

def similarity(code1, code2, k=5, w=10, threshold=0.5):
    # Generate fingerprints for both code snippets
    fingerprint1 = winnow(code1, k, w)
    fingerprint2 = winnow(code2, k, w)

    # Calculate the number of matching fingerprints
    matches = 0
    for fp1 in fingerprint1:
        for fp2 in fingerprint2:
            if fp1 == fp2:
                matches += 1
                break

    # Calculate the similarity score
    similarity_score = matches / min(len(fingerprint1), len(fingerprint2))

    return similarity_score

def extract_method_names(node):
    method_names = []

    if isinstance(node, CompilationUnit):
        for _, method_declaration in node.filter(MethodDeclaration):
            method_names.append(method_declaration.name)

    return method_names

def calculate_similarity_ratio(code1, code2):
    seq_matcher = difflib.SequenceMatcher(None, code1, code2)
    similarity_ratio = seq_matcher.ratio()
    return similarity_ratio

def semantic_clone_detection(code1, code2, threshold=0.8):
    tree1 = javalang.parse.parse(code1)
    tree2 = javalang.parse.parse(code2)

    method_names1 = extract_method_names(tree1)
    method_names2 = extract_method_names(tree2)

    common_method_names = set(method_names1) & set(method_names2)
    similarity_ratio = calculate_similarity_ratio(code1, code2)

    if common_method_names and similarity_ratio >= threshold:
        return True, common_method_names, similarity_ratio
    else:
        return False, None, similarity_ratio

# Define the path to the IR-Plag-Dataset folder
dataset_path = os.path.join(os.getcwd(), "IR-Plag-Dataset")

# Define a list of similarity thresholds to iterate over
similarity_thresholds = [0.48, 0.5, 0.52]

# Initialize variables to keep track of the best result
best_threshold = 0
best_accuracy = 0

# Loop through each similarity threshold and calculate accuracy
for SIMILARITY_THRESHOLD in similarity_thresholds:
    # Initialize the counters
    total_cases = 0
    over_threshold_cases_plagiarized = 0
    over_threshold_cases_non_plagiarized = 0
    cases_plag = 0
    cases_non_plag = 0

    # Loop through each subfolder in the dataset
    for folder_name in os.listdir(dataset_path):
        folder_path = os.path.join(dataset_path, folder_name)
        if os.path.isdir(folder_path):
            # Find the Java file in the original folder
            original_path = os.path.join(folder_path, 'original')
            java_files = [f for f in os.listdir(original_path) if f.endswith('.java')]
            if len(java_files) == 1:
                java_file = java_files[0]
                with open(os.path.join(original_path, java_file), 'r') as f:
                    code1 = f.read()
                # print(f"Found {java_file} in {original_path} for {folder_name}")

                # Loop through each subfolder in the plagiarized and non-plagiarized folders
                for subfolder_name in ['plagiarized', 'non-plagiarized']:
                    subfolder_path = os.path.join(folder_path, subfolder_name)
                    if os.path.isdir(subfolder_path):
                        # Loop through each Java file in the subfolder
                        for root, dirs, files in os.walk(subfolder_path):
                            for java_file in files:
                                if java_file.endswith('.java'):
                                    with open(os.path.join(root, java_file), 'r') as f:
                                        code2 = f.read()
                                    # print(f"Found {java_file} in {root} for {folder_name}")
                                    # Calculate the similarity ratio
                                    is_clone, common_methods, similarity_ratio = semantic_clone_detection(code1, code2)

                                    if is_clone:
                                        similarity_ratio = 0.0
                                    else:
                                        similarity_ratio = similarity(code1, code2)


                                    #print(f"{subfolder_name},{similarity_ratio:.2f}")

                                    # Update the counters based on the similarity ratio
                                    if subfolder_name == 'plagiarized':
                                        cases_plag += 1
                                        if similarity_ratio >= SIMILARITY_THRESHOLD:
                                            over_threshold_cases_plagiarized += 1
                                    elif subfolder_name == 'non-plagiarized':
                                        cases_non_plag += 1
                                        if similarity_ratio <= SIMILARITY_THRESHOLD:
                                            over_threshold_cases_non_plagiarized += 1
                                    total_cases += 1
            else:
                print(f"Error: Found {len(java_files)} Java files in {original_path} for {folder_name}")

    # Calculate accuracy for the current threshold
    if total_cases > 0:
        accuracy = (over_threshold_cases_non_plagiarized + over_threshold_cases_plagiarized) / total_cases
        if accuracy > best_accuracy:
            best_accuracy = accuracy
            best_threshold = SIMILARITY_THRESHOLD

# Print the best threshold and accuracy
print(f"{os.path.basename(__file__)} - The best threshold is {best_threshold} with an accuracy of {best_accuracy:.2f}")