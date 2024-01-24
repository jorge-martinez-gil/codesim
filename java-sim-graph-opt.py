# -*- coding: utf-8 -*-
"""
Graph Similarity Detection for Java Code

Martinez-Gil, J. (2024). Source Code Clone Detection Using Unsupervised Similarity Measures. arXiv preprint arXiv:2401.09885.

@author: Jorge Martinez-Gil
"""

import os
import networkx as nx
import numpy as np
from sklearn.metrics import jaccard_score

def get_code_graph(code_snippet, num_nodes=None):
    # Create a new directed graph.
    graph = nx.DiGraph()

    # Split the code snippet into tokens.
    tokens = code_snippet.split()

    # Add the tokens as nodes to the graph.
    for token in tokens:
        graph.add_node(token)

    # Add edges between adjacent tokens.
    for i in range(len(tokens) - 1):
        graph.add_edge(tokens[i], tokens[i + 1])

    # Add dummy nodes if necessary.
    if num_nodes is not None and graph.number_of_nodes() < num_nodes:
        while graph.number_of_nodes() < num_nodes:
            dummy_label = f"DUMMY_NODE_LABEL_{graph.number_of_nodes()}"
            graph.add_node(dummy_label)

    # Return the graph.
    return graph

def calculate_similarity(code_snippet_1, code_snippet_2):
    # Get the graphs representing the code snippets.
    code_graph_1 = get_code_graph(code_snippet_1, num_nodes=max(len(code_snippet_1.split()), len(code_snippet_2.split())))
    code_graph_2 = get_code_graph(code_snippet_2, num_nodes=max(len(code_snippet_1.split()), len(code_snippet_2.split())))

    # Calculate the Jaccard similarity between the two sets of nodes.
    jaccard_similarity = jaccard_score(np.array(list(code_graph_1.nodes())), np.array(list(code_graph_2.nodes())), average='macro')

    # Return the similarity.
    return jaccard_similarity

# Define the path to the IR-Plag-Dataset folder
dataset_path = os.path.join(os.getcwd(), "IR-Plag-Dataset")

# Define a list of similarity thresholds to iterate over
similarity_thresholds = [0.1, 0.3, 0.6]

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
                                    similarity_ratio = calculate_similarity(code1, code2)
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