
# Source Code Clone Detection Using Unsupervised Similarity Measures
This repository contains the source code for reproducing the paper Jorge Martinez-Gil: Source Code Clone Detection Using Unsupervised Similarity Measures. (Currently under review)

The dataset has been created by Oscar Karnalim: [https://github.com/oscarkarnalim/sourcecodeplagiarismdataset](https://github.com/oscarkarnalim/sourcecodeplagiarismdataset)

## Overview

This project implements a collection of established methods for measuring similarity. In this context, the goal is to detect similarity (and subsequently identify code clones) in Java source code using unsupervised similarity measures. It aims to check the most promising unsupervised similarity measures to identify duplicates (a.k.a. clones) in source code efficiently, offering a valuable tool for software maintenance and plagiarism detection.

## Reference

If you use this work, please cite:

```
@unpublished{MartinezGilUnpublished,
    author = {Martinez-Gil, Jorge},
    title = {Source Code Clone Detection Using Unsupervised Similarity Measures},
    note = {Manuscript under review},
    year = {2024},
	url = {https://github.com/jorge-martinez-gil/codesim}
}
```

## How it Works

Each script `java-sim-*-opt.py` processes the Java code snippets from the IR-Plag dataset. There are 21 different methods implemented. Please note that each script tries to find a threshold value for semantic similarity capable of separating clones from non-clones.


## License

This script is provided as-is under the MIT License. 
