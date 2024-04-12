# Source Code Clone Detection Using Unsupervised Similarity Measures
This repository contains the source code for reproducing the paper *Martinez-Gil, J. (2024). Source Code Clone Detection Using Unsupervised Similarity Measures. In: Bludau, P., Ramler, R., Winkler, D., Bergsmann, J. (eds) Software Quality as a Foundation for Security. SWQD 2024. Lecture Notes in Business Information Processing, vol 505. Springer, Cham. https://doi.org/10.1007/978-3-031-56281-5_2*.

[![arXiv](https://img.shields.io/badge/arXiv-2401.09885-b31b1b.svg)](https://arxiv.org/abs/2401.09885)
[![Springer Link](https://img.shields.io/badge/Springer-Link-blue)](https://link.springer.com/chapter/10.1007/978-3-031-56281-5_2)



The dataset has been created by Oscar Karnalim: [https://github.com/oscarkarnalim/sourcecodeplagiarismdataset](https://github.com/oscarkarnalim/sourcecodeplagiarismdataset)

## 🌍 Overview

This project implements a collection of established methods for measuring similarity. In this context, the goal is to detect similarity (and subsequently identify code clones) in Java source code using unsupervised similarity measures. It aims to check the most promising unsupervised similarity measures to identify duplicates (a.k.a. clones) in source code efficiently, offering a valuable tool for software maintenance and plagiarism detection.

## 📚 Reference

If you use this work, please cite:

```
@InProceedings{10.1007/978-3-031-56281-5_2,
	author="Martinez-Gil, Jorge",
	editor="Bludau, Peter
	and Ramler, Rudolf
	and Winkler, Dietmar
	and Bergsmann, Johannes",
	title="Source Code Clone Detection Using Unsupervised Similarity Measures",
	booktitle="Software Quality as a Foundation for Security",
	year="2024",
	publisher="Springer Nature Switzerland",
	address="Cham",
	pages="21--37",
	isbn="978-3-031-56281-5"
}
```

## 🛠️ How it Works

Each script `java-sim-*-opt.py` processes the Java code snippets from the IR-Plag dataset. There are 21 different methods implemented. Please note that each script tries to find a threshold value for semantic similarity capable of separating clones from non-clones.

## 📈 Performance Results 

| Approach                    | Script                     | Accuracy | Precision | Recall | F-Measure | Execution Time (ms) |
|-----------------------------|---------------------------|----------|-----------|--------|-----------|-----------------------|
| **Abstract Syntax Tree**    | `java-sim-ast-opt.py`     | 0.77     | 0.77      | 0.78   | 0.78      | 80907.37              |
| **Bag-of-Words**            | `java-sim-bow-opt.py`     | 0.77     | 0.79      | 0.66   | 0.72      | 57444.90              |
| **Bag-of-Words II**         | `java-sim-bow2-opt.py`    | 0.77     | 0.77      | **1.00** | 0.87      | 59961.69              |
| **CodeBERT**                | `java-sim-codebert-opt.py*`| 0.54     | 0.75      | 0.34   | 0.47      | 868755.96             |
| **Comment Sim.**            | `java-sim-comments-opt.py` | 0.77     | 0.77      | **1.00** | 0.87      | 983231.42             |
| **Output Analysis**         | `java-sim-exec-opt.py`    | **0.94** | 0.85      | 0.97   | **0.90**  | 1381335.16            |
| **Function Calls**          | `java-sim-fcall-opt.py`   | 0.78     | 0.78      | 0.91   | 0.84      | 30303.88              |
| **Fuzzy Matching**          | `java-sim-fuzz-opt.py`    | 0.77     | 0.77      | **1.00** | 0.87      | 12778.62              |
| **Graph Matching**          | `java-sim-graph-opt.py`   | 0.78     | 0.80      | 0.52   | 0.63      | 65076.91              |
| **Rolling Hash**            | `java-sim-hash-opt.py`    | 0.59     | **0.93**  | 0.18   | 0.30      | 959157.60             |
| **Perceptual Hash**         | `java-sim-image-opt.py`   | 0.77     | 0.77      | 0.85   | 0.81      | 38152.71              |
| **Jaccard**                 | `java-sim-jaccard-opt.py` | 0.86     | 0.81      | 0.94   | 0.87      | **2066.13**           |
| **Longest Common Subsequence** | `java-sim-lcs-opt.py`  | 0.48     | 0.74      | 0.06   | 0.11      | 7268.67               |
| **Levenshtein**             | `java-sim-lev-opt.py`     | 0.77     | 0.80      | 0.66   | 0.72      | 10280.09              |
| **Metrics comparison**      | `java-sim-metrics-opt.py` | 0.77     | 0.77      | **1.00** | 0.87      | 60508.62              |
| **N-Grams**                 | `java-sim-ngrams-opt.py`  | 0.85     | 0.84      | 0.29   | 0.43      | 66635.25              |
| **Program Dependence Graph** | `java-sim-pdg-opt.py`   | 0.65     | 0.85      | 0.39   | 0.53      | 40518.80              |
| **Rabin-Karp**              | `java-sim-rk-opt.py`      | 0.81     | 0.79      | 0.99   | 0.88      | 225218.76             |
| **Semantic Clone**          | `java-sim-semclone-opt.py`| 0.77     | 0.79      | 0.68   | 0.73      | 41543.53              |
| **Semdiff method**          | `java-sim-semdiff-opt.py` | 0.77     | 0.79      | 0.38   | 0.51      | 26351.06              |
| **TDF-IDF**                 | `java-sim-tdf-opt.py`     | 0.77     | 0.77      | 0.99   | 0.87      | 68587.17              |
| **Winnow**                  | `java-sim-winn-opt.py`    | 0.86     | 0.81      | 0.98   | 0.88      | 77160.81              |
| **Winnow II**               | `java-sim-winn2-opt.py`   | 0.83     | 0.80      | 0.94   | 0.87      | 104032.99             |


*CodeBERT is used without recalibration

## 📄 License

These scripts are provided under the MIT License. 
