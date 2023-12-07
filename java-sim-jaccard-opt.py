# -*- coding: utf-8 -*-
"""
Jaccard Similarity Detection for Java Code

[Martinez-Gil2024] J. Martinez-Gil, "Source Code Clone Detection Using Unsupervised Similarity Measures", pp. 1-15 (Under review)

@author: Jorge Martinez-Gil
"""

import os
import re
from collections import Counter

# Define a function to tokenize a code snippet
def tokenize(code):
    # Remove comments and whitespace
    code = re.sub(r'//.*?\n|/\*.*?\*/', '', code, flags=re.S)
    code = re.sub(r'\s+', ' ', code)
    # Tokenize the code
    tokens = re.findall(r'\b\w+\b', code)
    # Count the frequency of each token
    token_counts = Counter(tokens)
    return token_counts

# Define the path to the IR-Plag-Dataset folder
dataset_path = os.path.join(os.getcwd(), "IR-Plag-Dataset")

# Define a list of similarity thresholds to iterate over
similarity_thresholds = [0.3, 0.454, 0.5]

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
                original_tokens = tokenize(code1)
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
                                    tokens2 = tokenize(code2)
                                    # print(f"Found {java_file} in {root} for {folder_name}")
                                    intersection = sum((original_tokens & tokens2).values())
                                    union = sum((original_tokens | tokens2).values())
                                    similarity_ratio = intersection / union
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
print(f"{os.path.basename(__file__)} - The best threshold is {best_threshold} with an accuracy of {best_accuracy:.4f}")