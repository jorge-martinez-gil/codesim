# -*- coding: utf-8 -*-
"""
Rabin-Karp Similarity Detection for Java Code

Martinez-Gil, J. (2024). Source Code Clone Detection Using Unsupervised Similarity Measures. arXiv preprint arXiv:2401.09885.

@author: Jorge Martinez-Gil
"""

import os

def rkr_gst_similarity(code1, code2):
    def tokenize(code):
        # Simplified tokenizer for demonstration; in practice, use a proper tokenizer
        return code.split()

    def rabin_karp_hash(token, prime=101):
        hash_value = 0
        n = len(token)
        for i, char in enumerate(token):
            hash_value += ord(char) * (prime ** (n - i - 1))
        return hash_value

    def match_tiles(tokens1, tokens2):
        hash_to_token = {rabin_karp_hash(token): token for token in set(tokens1 + tokens2)}
        match_matrix = [[0] * (len(tokens2) + 1) for _ in range(len(tokens1) + 1)]

        max_len = 0
        max_pos = (0, 0)
        for i in range(1, len(tokens1) + 1):
            for j in range(1, len(tokens2) + 1):
                if tokens1[i - 1] == tokens2[j - 1]:
                    match_matrix[i][j] = match_matrix[i - 1][j - 1] + 1
                    if match_matrix[i][j] > max_len:
                        max_len = match_matrix[i][j]
                        max_pos = (i, j)

        # Extracting the matched tiles
        total_matched_length = 0
        while max_len > 0:
            i, j = max_pos
            match_length = max_len
            total_matched_length += match_length

            # Zero out the current tile to find next tile
            for di in range(match_length):
                for dj in range(match_length):
                    match_matrix[i - di][j - dj] = 0

            # Find next tile
            max_len = 0
            for i in range(1, len(tokens1) + 1):
                for j in range(1, len(tokens2) + 1):
                    if match_matrix[i][j] > max_len:
                        max_len = match_matrix[i][j]
                        max_pos = (i, j)

        return total_matched_length

    tokens1 = tokenize(code1)
    tokens2 = tokenize(code2)
    total_matched_length = match_tiles(tokens1, tokens2)
    
    total_length = len(tokens1) + len(tokens2)
    similarity_score = (2 * total_matched_length) / total_length if total_length > 0 else 0
    return similarity_score

# Define the path to the IR-Plag-Dataset folder
dataset_path = os.path.join(os.getcwd(), "IR-Plag-Dataset")

# Define a list of similarity thresholds to iterate over
similarity_thresholds = [0.6, 0.601, 0.602, 0.603]

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
                                    similarity_ratio = rkr_gst_similarity(code1, code2)
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