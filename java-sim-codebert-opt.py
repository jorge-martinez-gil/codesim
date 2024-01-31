# -*- coding: utf-8 -*-
"""
CODEBERT Similarity Detection for Java Code

Martinez-Gil, J. (2024). Source Code Clone Detection Using Unsupervised Similarity Measures. arXiv preprint arXiv:2401.09885.

@author: Jorge Martinez-Gil
"""

import os
import torch
from torch.nn.utils.rnn import pad_sequence
from transformers import AutoTokenizer, AutoModel

# Load the CodeBERT model and tokenizer
model_name = "microsoft/codebert-base"
tokenizer = AutoTokenizer.from_pretrained(model_name)
model = AutoModel.from_pretrained(model_name)

# Define a function to generate embeddings for a given code snippet
def generate_embedding(code):
    # Tokenize the code
    inputs = tokenizer(code, return_tensors="pt", padding=True, truncation=True)
    # Generate the model's output
    with torch.no_grad():
        outputs = model(**inputs)
    # Extract the embedding for the [CLS] token
    embedding = outputs.last_hidden_state[:, 0, :]
    # Normalize the embedding
    embedding = torch.nn.functional.normalize(embedding, p=2, dim=1)
    return embedding

# Define the path to the IR-Plag-Dataset folder
dataset_path = os.path.join(os.getcwd(), "IR-Plag-Dataset")

# Define the similarity threshold
SIMILARITY_THRESHOLD = 0.9906

# Initialize variables to keep track of the best result
best_threshold = 0
best_accuracy = 0

# Initialize the counters
total_cases = 0
over_threshold_cases_plagiarized = 0
over_threshold_cases_non_plagiarized = 0

cases_plag = 0
cases_non_plag = 0

# Initialize counters
TP = 0
FP = 0
FN = 0

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
            for subfolder_name in ['plagiarized','non-plagiarized']:
                subfolder_path = os.path.join(folder_path, subfolder_name)
                if os.path.isdir(subfolder_path):
                    # Loop through each Java file in the subfolder
                    for root, dirs, files in os.walk(subfolder_path):
                        for java_file in files:
                            if java_file.endswith('.java'):
                                with open(os.path.join(root, java_file), 'r') as f:
                                    code2 = f.read()

                                embedding1 = generate_embedding(code1)
                                embedding2 = generate_embedding(code2)

                                # Calculate the cosine similarity between the embeddings
                                similarity = torch.nn.functional.cosine_similarity(embedding1, embedding2)
                                similarity_ratio = similarity.item()
                                #print(f"{subfolder_name},{similarity_ratio:.3f}")

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
                                # Update the counters based on the similarity ratio
                                if subfolder_name == 'plagiarized':
                                    cases_plag += 1
                                    if similarity_ratio >= SIMILARITY_THRESHOLD:
                                        TP += 1  # True positive: plagiarized and identified as plagiarized
                                    else:
                                        FN += 1  # False negative: plagiarized but identified as non-plagiarized
                                elif subfolder_name == 'non-plagiarized':
                                    cases_non_plag += 1
                                    if similarity_ratio <= SIMILARITY_THRESHOLD:
                                        over_threshold_cases_non_plagiarized += 1
                                    else:
                                        FP += 1  # False positive: non-plagiarized but identified as plagiarized

        else:
            print(f"Error: Found {len(java_files)} Java files in {original_path} for {folder_name}")

# Calculate accuracy for the current threshold
if total_cases > 0:
    accuracy = (over_threshold_cases_non_plagiarized + over_threshold_cases_plagiarized) / total_cases
    if accuracy > best_accuracy:
        best_accuracy = accuracy
        best_threshold = SIMILARITY_THRESHOLD

# Calculate precision and recall
if TP + FP > 0:
    precision = TP / (TP + FP)
else:
    precision = 0

if TP + FN > 0:
    recall = TP / (TP + FN)
else:
    recall = 0

# Calculate F-measure
if precision + recall > 0:
    f_measure = 2 * (precision * recall) / (precision + recall)
else:
    f_measure = 0

# Print the best threshold and accuracy
print(f"{os.path.basename(__file__)} - The best threshold is {best_threshold} with an accuracy of {best_accuracy:.2f}, Precision: {precision:.2f}, Recall: {recall:.2f}, F-measure: {f_measure:.2f}")