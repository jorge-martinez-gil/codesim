# Source Code Clone Detection Using Unsupervised Similarity Measures
This repository contains the source code for reproducing the paper *Martinez-Gil, J. (2024). Source Code Clone Detection Using Unsupervised Similarity Measures. arXiv. https://arxiv.org/abs/2401.09885*.

[![arXiv](https://img.shields.io/badge/arXiv-2401.09885-b31b1b.svg)](https://arxiv.org/abs/2401.09885)


The dataset has been created by Oscar Karnalim: [https://github.com/oscarkarnalim/sourcecodeplagiarismdataset](https://github.com/oscarkarnalim/sourcecodeplagiarismdataset)

## 🌍 Overview

This project implements a collection of established methods for measuring similarity. In this context, the goal is to detect similarity (and subsequently identify code clones) in Java source code using unsupervised similarity measures. It aims to check the most promising unsupervised similarity measures to identify duplicates (a.k.a. clones) in source code efficiently, offering a valuable tool for software maintenance and plagiarism detection.

## 📚 Reference

If you use this work, please cite:

```
@misc{martinezgil2024source,
      title={Source Code Clone Detection Using Unsupervised Similarity Measures}, 
      author={Jorge Martinez-Gil},
      year={2024},
      eprint={2401.09885},
      archivePrefix={arXiv},
      primaryClass={cs.SE}
}
```

## 🛠️ How it Works

Each script `java-sim-*-opt.py` processes the Java code snippets from the IR-Plag dataset. There are 21 different methods implemented. Please note that each script tries to find a threshold value for semantic similarity capable of separating clones from non-clones.

## 📈 Performance Results 

| Method                    | Score |
|---------------------------|-------|
| ASTs                      | 0.77  |
| Bag-of-Words              | 0.77  |
| Code Embeddings*          | 0.40  |
| Comments                  | 0.77  |
| Fuzzy Matching            | 0.77  |
| Function Calls            | 0.77  |
| Graph-based               | 0.77  |
| Jaccard                   | 0.81  |
| Levenshtein               | 0.77  |
| LCS                       | 0.34  |
| Metrics                   | 0.77  |
| N-grams                   | 0.75  |
| Output Analysis           | 0.84  |
| Perceptual Hashing        | 0.77  |
| Program Dependence Graph  | 0.44  |
| Rolling Hash              | 0.36  |
| RKR-GST                   | 0.82  |
| Semdiff                   | 0.77  |
| Semantic Clone            | 0.77  |
| TF-IDF                    | 0.77  |
| Winnow                    | 0.83  |

*without recalibration

## 📄 License

These scripts are provided under the MIT License. 
