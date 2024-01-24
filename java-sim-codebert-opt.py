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
        else:
            print(f"Error: Found {len(java_files)} Java files in {original_path} for {folder_name}")

# Calculate the proportion of cases over the threshold for plagiarized and non-plagiarized cases separately
if total_cases > 0:
    proportion_plagiarized = over_threshold_cases_plagiarized / cases_plag
    proportion_non_plagiarized = over_threshold_cases_non_plagiarized / cases_non_plag
    total = (over_threshold_cases_non_plagiarized + over_threshold_cases_plagiarized) / total_cases
    #print(f"The success when assessing plagiarism cases is {proportion_plagiarized:.2f} of a total of {cases_plag} cases")
    #print(f"The success when assessing non-plagiarism cases is {proportion_non_plagiarized:.2f} of a total of {cases_non_plag} cases")
    print(f"{os.path.basename(__file__)} - The accuracy is {total:.2f}")
else:
    print("Error: No cases found")