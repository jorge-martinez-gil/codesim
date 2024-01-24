# -*- coding: utf-8 -*-
"""
Main

Martinez-Gil, J. (2024). Source Code Clone Detection Using Unsupervised Similarity Measures. arXiv preprint arXiv:2401.09885.

@author: Jorge Martinez-Gil
"""

import os
import subprocess
import time
import threading

# Get the current directory path
directory_path = os.getcwd()

# Function to execute and monitor a single subprocess
def execute_and_monitor(script_name):
    # Record the start time
    start_time = time.perf_counter()

    # Create and start the subprocess
    process = subprocess.Popen(["python", os.path.join(directory_path, script_name)])

    # Wait for the subprocess to finish
    while process.poll() is None:
        time.sleep(0.1)  # Sleep briefly to avoid overloading the CPU

    # Calculate and print the execution time in milliseconds
    end_time = time.perf_counter()
    execution_time_ms = (end_time - start_time) * 1000
    print(f"Execution time of {script_name}: {execution_time_ms:.2f} ms")

# Create threads for each Python script in the directory
threads = []
for filename in os.listdir(directory_path):
    if filename.endswith(".py") and filename != os.path.basename(__file__):
        thread = threading.Thread(target=execute_and_monitor, args=(filename,))
        threads.append(thread)
        thread.start()

# Wait for all threads to complete
for thread in threads:
    thread.join()



