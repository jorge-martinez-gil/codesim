# -*- coding: utf-8 -*-
"""
Rolling Hash Similarity Detection for Java Code

[Martinez-Gil2024] J. Martinez-Gil, "Source Code Clone Detection Using Unsupervised Similarity Measures", pp. 1-15 (Under review)

@author: Jorge Martinez-Gil
"""

import os
import re

class RollingHash:
    def __init__(self, s, base=256, mod=1000000007):
        self.s = s
        self.base = base
        self.mod = mod
        self.hash_value = 0
        self.power = 1

        for c in s:
            self.hash_value = (self.hash_value * self.base + ord(c)) % self.mod
            self.power = (self.power * self.base) % self.mod

    def update(self, old_char, new_char):
        old_value = ord(old_char)
        new_value = ord(new_char)

        self.hash_value = (self.hash_value * self.base - old_value * self.power + new_value) % self.mod

        if self.hash_value < 0:
            self.hash_value += self.mod

def find_common_substrings(text1, text2, min_length=10):
    common_substrings = []

    for length in range(min_length, min(len(text1), len(text2)) + 1):
        hash_set = set()
        rolling_hash_text1 = RollingHash(text1[:length])
        rolling_hash_text2 = RollingHash(text2[:length])

        for i in range(len(text1) - length + 1):
            rolling_hash_text1.update(text1[i], text1[i + length - 1])
            hash_set.add(rolling_hash_text1.hash_value)

        for i in range(len(text2) - length + 1):
            rolling_hash_text2.update(text2[i], text2[i + length - 1])
            if rolling_hash_text2.hash_value in hash_set:
                common_substrings.append(text2[i:i + length])

    return common_substrings

def calculate_similarity_ratio(java_code1, java_code2):
    tokens1 = tokenize_code(java_code1)
    tokens2 = tokenize_code(java_code2)

    common_substrings = find_common_substrings(java_code1, java_code2)
    similarity_ratio = len(common_substrings) / (len(tokens1) + len(tokens2))

    return similarity_ratio

def tokenize_code(code):
    tokens = re.findall(r'\w+', code)
    return set(tokens)

def normalize_similarity_ratio(similarity_ratio):
    # Define the minimum and maximum possible similarity ratios
    min_similarity = 0
    max_similarity = 1
    
    # Normalize using min-max formula
    normalized_ratio = (similarity_ratio - min_similarity) / (max_similarity - min_similarity)
    return normalized_ratio

# Define the path to the IR-Plag-Dataset folder
dataset_path = os.path.join(os.getcwd(), "IR-Plag-Dataset")

# Define a list of similarity thresholds to iterate over
similarity_thresholds = [0.1, 0.2, 0.4]

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
                                    similarity = calculate_similarity_ratio(code1, code2)
                                    similarity_ratio = normalize_similarity_ratio(similarity)
                                    #print(f"{subfolder_name},{similarity_ratio:.2f}")

                                    # Update the counters based on the similarity ratio
                                    if subfolder_name == 'plagiarized':
                                        #print(f"Similarity ratio between {subfolder_path} and {original_path} is {similarity_ratio}")
                                        cases_plag += 1
                                        if similarity_ratio >= SIMILARITY_THRESHOLD:
                                            over_threshold_cases_plagiarized += 1
                                    elif subfolder_name == 'non-plagiarized':
                                        #print(f"Similarity ratio between {subfolder_path} and {original_path} is {similarity_ratio}")
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