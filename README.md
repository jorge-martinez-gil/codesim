# CodeSim: Source Code Clone Detection Using Unsupervised Similarity Measures

<div align="center">

[![Python](https://img.shields.io/badge/python-3.8+-blue.svg)](https://www.python.org/downloads/)
[![Java](https://img.shields.io/badge/java-8+-orange.svg)](https://www.oracle.com/java/)
[![License: MIT](https://img.shields.io/badge/License-MIT-yellow.svg)](https://opensource.org/licenses/MIT)
[![arXiv](https://img.shields.io/badge/arXiv-2401.09885-b31b1b.svg)](https://arxiv.org/abs/2401.09885)
[![Springer](https://img.shields.io/badge/Springer-Link-blue)](https://link.springer.com/chapter/10.1007/978-3-031-56281-5_2)
[![GitHub stars](https://img.shields.io/github/stars/jorge-martinez-gil/codesim.svg)](https://github.com/jorge-martinez-gil/codesim/stargazers)
[![GitHub forks](https://img.shields.io/github/forks/jorge-martinez-gil/codesim.svg)](https://github.com/jorge-martinez-gil/codesim/forks)

**A comprehensive benchmark of 23 unsupervised similarity measures for detecting code clones in Java**

[📖 Paper](https://link.springer.com/chapter/10.1007/978-3-031-56281-5_2) • [📊 Dataset](https://github.com/oscarkarnalim/sourcecodeplagiarismdataset) • [🔬 Results](#-performance-results) • [🚀 Quick Start](#-quick-start)

</div>

---

## 📖 Overview

**CodeSim** is a research toolkit that implements and benchmarks 23 different unsupervised similarity measures for detecting code clones in Java source code. This work addresses the critical challenge of identifying duplicated or similar code segments, which is essential for:

- 🔍 **Software Maintenance**: Identifying redundant code for refactoring
- 🎓 **Plagiarism Detection**: Academic integrity in programming courses
- 🐛 **Bug Detection**: Finding similar code patterns that may contain similar bugs
- 📊 **Code Quality**: Measuring code reusability and maintainability

### Why CodeSim?

Unlike supervised machine learning approaches that require labeled training data, CodeSim explores **unsupervised methods** that can detect clones without prior training. This makes them particularly useful for:

- New programming languages or frameworks
- Organizations without labeled clone datasets
- Real-time clone detection scenarios
- Resource-constrained environments

### Key Features

- 🎯 **23 Different Approaches**: From simple text-based to advanced semantic methods
- 📊 **Comprehensive Benchmark**: Detailed performance metrics on IR-Plag dataset
- ⚡ **Performance Metrics**: Accuracy, precision, recall, F-measure, and execution time
- 🔧 **Ready-to-Use Scripts**: Each method in a standalone Python script
- 📈 **Automatic Threshold Detection**: Optimizes similarity thresholds for each method

## 🔬 Research Context

This work is based on the research paper:

**Martinez-Gil, J. (2024). Source Code Clone Detection Using Unsupervised Similarity Measures.** 
In: Bludau, P., Ramler, R., Winkler, D., Bergsmann, J. (eds) *Software Quality as a Foundation for Security*. 
SWQD 2024. Lecture Notes in Business Information Processing, vol 505. Springer, Cham.

[📄 Read the full paper](https://link.springer.com/chapter/10.1007/978-3-031-56281-5_2) | [📑 arXiv preprint](https://arxiv.org/abs/2401.09885)

## 📊 Performance Results

### Summary Table

| Approach | Script | Accuracy | Precision | Recall | F-Measure | Time (ms) |
|----------|--------|----------|-----------|--------|-----------|-----------|
| **🥇 Output Analysis** | `java-sim-exec-opt.py` | **0.94** | 0.85 | 0.97 | **0.90** | 1,381,335 |
| **🥈 Jaccard** | `java-sim-jaccard-opt.py` | 0.86 | 0.81 | 0.94 | 0.87 | **2,066** ⚡ |
| **🥉 Winnow** | `java-sim-winn-opt.py` | 0.86 | 0.81 | 0.98 | 0.88 | 77,161 |
| N-Grams | `java-sim-ngrams-opt.py` | 0.85 | 0.84 | 0.29 | 0.43 | 66,635 |
| Winnow II | `java-sim-winn2-opt.py` | 0.83 | 0.80 | 0.94 | 0.87 | 104,033 |
| Rabin-Karp | `java-sim-rk-opt.py` | 0.81 | 0.79 | 0.99 | 0.88 | 225,219 |
| AST | `java-sim-ast-opt.py` | 0.77 | 0.77 | 0.78 | 0.78 | 80,907 |
| Function Calls | `java-sim-fcall-opt.py` | 0.78 | 0.78 | 0.91 | 0.84 | 30,304 |
| Graph Matching | `java-sim-graph-opt.py` | 0.78 | 0.80 | 0.52 | 0.63 | 65,077 |

<details>
<summary>📋 <b>View All 23 Methods (Click to expand)</b></summary>

| Approach | Script | Accuracy | Precision | Recall | F-Measure | Time (ms) |
|----------|--------|----------|-----------|--------|-----------|-----------|
| Output Analysis | `java-sim-exec-opt.py` | 0.94 | 0.85 | 0.97 | 0.90 | 1,381,335 |
| Jaccard | `java-sim-jaccard-opt.py` | 0.86 | 0.81 | 0.94 | 0.87 | 2,066 |
| Winnow | `java-sim-winn-opt.py` | 0.86 | 0.81 | 0.98 | 0.88 | 77,161 |
| N-Grams | `java-sim-ngrams-opt.py` | 0.85 | 0.84 | 0.29 | 0.43 | 66,635 |
| Winnow II | `java-sim-winn2-opt.py` | 0.83 | 0.80 | 0.94 | 0.87 | 104,033 |
| Rabin-Karp | `java-sim-rk-opt.py` | 0.81 | 0.79 | 0.99 | 0.88 | 225,219 |
| Function Calls | `java-sim-fcall-opt.py` | 0.78 | 0.78 | 0.91 | 0.84 | 30,304 |
| Graph Matching | `java-sim-graph-opt.py` | 0.78 | 0.80 | 0.52 | 0.63 | 65,077 |
| AST | `java-sim-ast-opt.py` | 0.77 | 0.77 | 0.78 | 0.78 | 80,907 |
| Bag-of-Words | `java-sim-bow-opt.py` | 0.77 | 0.79 | 0.66 | 0.72 | 57,445 |
| Bag-of-Words II | `java-sim-bow2-opt.py` | 0.77 | 0.77 | 1.00 | 0.87 | 59,962 |
| Comment Similarity | `java-sim-comments-opt.py` | 0.77 | 0.77 | 1.00 | 0.87 | 983,231 |
| Fuzzy Matching | `java-sim-fuzz-opt.py` | 0.77 | 0.77 | 1.00 | 0.87 | 12,779 |
| Perceptual Hash | `java-sim-image-opt.py` | 0.77 | 0.77 | 0.85 | 0.81 | 38,153 |
| Levenshtein | `java-sim-lev-opt.py` | 0.77 | 0.80 | 0.66 | 0.72 | 10,280 |
| Metrics Comparison | `java-sim-metrics-opt.py` | 0.77 | 0.77 | 1.00 | 0.87 | 60,509 |
| TDF-IDF | `java-sim-tdf-opt.py` | 0.77 | 0.77 | 0.99 | 0.87 | 68,587 |
| Semantic Clone | `java-sim-semclone-opt.py` | 0.77 | 0.79 | 0.68 | 0.73 | 41,544 |
| Semdiff | `java-sim-semdiff-opt.py` | 0.77 | 0.79 | 0.38 | 0.51 | 26,351 |
| PDG | `java-sim-pdg-opt.py` | 0.65 | 0.85 | 0.39 | 0.53 | 40,519 |
| Rolling Hash | `java-sim-hash-opt.py` | 0.59 | 0.93 | 0.18 | 0.30 | 959,158 |
| CodeBERT* | `java-sim-codebert-opt.py` | 0.54 | 0.75 | 0.34 | 0.47 | 868,756 |
| LCS | `java-sim-lcs-opt.py` | 0.48 | 0.74 | 0.06 | 0.11 | 7,269 |

*CodeBERT is used without recalibration

</details>

### 🎯 Key Findings

1. **🏆 Best Overall**: Output Analysis achieves 94% accuracy with 0.90 F-measure
2. **⚡ Fastest & Effective**: Jaccard with only 2ms execution time and 0.87 F-measure
3. **🎯 High Precision**: Rolling Hash achieves 93% precision (but low recall)
4. **⚖️ Best Balance**: Winnow provides excellent speed-accuracy tradeoff

### Performance Visualization

```
Accuracy vs Execution Time (Best performers in top-left)
│
│  Output Analysis ●
│                   
0.9┤                   Winnow ●
│                   Jaccard ● (BEST)
│  
0.8┤        
│  
0.7┤
└────────────────────────────────────
   Fast (< 100ms)      Slow (> 1s)
```

## 🚀 Quick Start

### Prerequisites

- **Python 3.8+**
- **Java 8+** (for processing Java source files)
- **pip** package manager

### Installation

```bash
# Clone the repository
git clone https://github.com/jorge-martinez-gil/codesim.git
cd codesim

# Install Python dependencies
pip install -r requirements.txt
```

### Dataset Setup

The repository uses the IR-Plag dataset, which is already included in the `IR-Plag-Dataset/` directory.

**Dataset Credits**: Created by Oscar Karnalim  
**Source**: https://github.com/oscarkarnalim/sourcecodeplagiarismdataset

### Running Individual Methods

Each similarity measure has its own script. Run any method:

```bash
# Example 1: Run Jaccard similarity (fastest method)
python java-sim-jaccard-opt.py

# Example 2: Run Output Analysis (best accuracy)
python java-sim-exec-opt.py

# Example 3: Run AST-based comparison
python java-sim-ast-opt.py
```

### Running All Methods (Benchmark)

```bash
# Run comprehensive benchmark
python main.py

# The script will:
# 1. Process all Java files in IR-Plag-Dataset
# 2. Apply each similarity measure
# 3. Find optimal thresholds
# 4. Generate performance report
```

### Using as a Library

```python
from java_sim_jaccard_opt import compute_jaccard_similarity

# Compare two Java code snippets
code1 = """
public class Example {
    public int add(int a, int b) {
        return a + b;
    }
}
"""

code2 = """
public class Sample {
    public int sum(int x, int y) {
        return x + y;
    }
}
"""

similarity_score = compute_jaccard_similarity(code1, code2)
print(f"Similarity: {similarity_score:.2f}")

# Determine if it's a clone (using optimal threshold)
is_clone = similarity_score > 0.75  # Threshold from optimization
print(f"Is clone: {is_clone}")
```

## 🔍 Similarity Measures Explained

### 1. Text-Based Methods

These methods treat code as text and compare character/token sequences.

#### Levenshtein Distance (`java-sim-lev-opt.py`)
- **What it does**: Counts minimum edits to transform one code into another
- **Best for**: Detecting minor code modifications
- **Speed**: ⚡⚡⚡ Very fast
- **Accuracy**: Moderate

#### Longest Common Subsequence (`java-sim-lcs-opt.py`)
- **What it does**: Finds longest matching sequence of characters
- **Best for**: Identifying core similarities despite reordering
- **Speed**: ⚡⚡ Fast
- **Accuracy**: Low (not recommended)

#### Fuzzy Matching (`java-sim-fuzz-opt.py`)
- **What it does**: Uses fuzzy string matching algorithms
- **Best for**: Handling typos and minor variations
- **Speed**: ⚡⚡⚡ Very fast
- **Accuracy**: Good

### 2. Token-Based Methods

These methods analyze code at the token/word level.

#### Bag-of-Words (`java-sim-bow-opt.py`, `java-sim-bow2-opt.py`)
- **What it does**: Treats code as collection of tokens
- **Best for**: Comparing overall code vocabulary
- **Speed**: ⚡⚡⚡ Very fast
- **Accuracy**: Good

#### Jaccard Similarity (`java-sim-jaccard-opt.py`) ⭐
- **What it does**: Compares token set overlap
- **Best for**: Fast, accurate clone detection
- **Speed**: ⚡⚡⚡⚡ Extremely fast (2ms!)
- **Accuracy**: Excellent (0.87 F-measure)

#### TF-IDF (`java-sim-tdf-opt.py`)
- **What it does**: Weights tokens by frequency
- **Best for**: Identifying important code patterns
- **Speed**: ⚡⚡⚡ Very fast
- **Accuracy**: Good

#### N-Grams (`java-sim-ngrams-opt.py`)
- **What it does**: Compares sequences of N consecutive tokens
- **Best for**: Detecting code structure similarity
- **Speed**: ⚡⚡⚡ Very fast
- **Accuracy**: Good with low recall

### 3. Fingerprint-Based Methods

These use hashing to create compact code representations.

#### Winnowing (`java-sim-winn-opt.py`) ⭐
- **What it does**: Selects representative hash values
- **Best for**: Scalable clone detection
- **Speed**: ⚡⚡⚡ Very fast
- **Accuracy**: Excellent (0.88 F-measure)

#### Rabin-Karp (`java-sim-rk-opt.py`)
- **What it does**: Rolling hash for substring matching
- **Best for**: Finding exact substring clones
- **Speed**: ⚡⚡ Moderate
- **Accuracy**: Good (0.88 F-measure)

#### Rolling Hash (`java-sim-hash-opt.py`)
- **What it does**: Efficient hash-based comparison
- **Best for**: High precision requirements
- **Speed**: ⚡ Slow
- **Accuracy**: High precision, low recall

#### Perceptual Hash (`java-sim-image-opt.py`)
- **What it does**: Converts code to image, then compares
- **Best for**: Novel structural comparison
- **Speed**: ⚡⚡⚡ Very fast
- **Accuracy**: Good

### 4. Structural Methods

These analyze code structure using ASTs or graphs.

#### Abstract Syntax Tree (`java-sim-ast-opt.py`)
- **What it does**: Compares code syntax trees
- **Best for**: Language-aware comparison
- **Speed**: ⚡⚡ Moderate
- **Accuracy**: Good (0.78 F-measure)

#### Program Dependence Graph (`java-sim-pdg-opt.py`)
- **What it does**: Analyzes data and control dependencies
- **Best for**: Semantic clone detection
- **Speed**: ⚡⚡⚡ Very fast
- **Accuracy**: Moderate

#### Graph Matching (`java-sim-graph-opt.py`)
- **What it does**: Compares code as graphs
- **Best for**: Structural pattern matching
- **Speed**: ⚡⚡⚡ Very fast
- **Accuracy**: Moderate with low recall

### 5. Semantic Methods

These understand code meaning and behavior.

#### Output Analysis (`java-sim-exec-opt.py`) 🏆
- **What it does**: Compares program execution outputs
- **Best for**: Detecting semantic clones
- **Speed**: ⚡ Slow (requires execution)
- **Accuracy**: Excellent (0.94 accuracy, 0.90 F-measure)

#### Function Calls (`java-sim-fcall-opt.py`)
- **What it does**: Compares API usage patterns
- **Best for**: Detecting similar functionality
- **Speed**: ⚡⚡⚡⚡ Extremely fast
- **Accuracy**: Good (0.84 F-measure)

#### Comment Similarity (`java-sim-comments-opt.py`)
- **What it does**: Analyzes code comments
- **Best for**: Understanding developer intent
- **Speed**: ⚡ Slow
- **Accuracy**: Good (perfect recall)

#### Semantic Clone (`java-sim-semclone-opt.py`)
- **What it does**: Combines multiple semantic features
- **Best for**: Multi-aspect clone detection
- **Speed**: ⚡⚡⚡ Very fast
- **Accuracy**: Good

#### Semdiff (`java-sim-semdiff-opt.py`)
- **What it does**: Semantic differencing
- **Best for**: Finding functional differences
- **Speed**: ⚡⚡⚡ Very fast
- **Accuracy**: Moderate

#### Metrics Comparison (`java-sim-metrics-opt.py`)
- **What it does**: Compares code complexity metrics
- **Best for**: Quality-based similarity
- **Speed**: ⚡⚡⚡ Very fast
- **Accuracy**: Good (perfect recall)

### 6. Deep Learning Methods

#### CodeBERT (`java-sim-codebert-opt.py`)
- **What it does**: Uses pre-trained transformer model
- **Best for**: Research experiments
- **Speed**: ⚡ Very slow
- **Accuracy**: Moderate (needs fine-tuning)
- **Note**: Used without recalibration in this study

## 📁 Repository Structure

```
codesim/
├── README.md                           # This file
├── LICENSE                             # MIT License
├── citation.cff                        # Citation metadata
├── requirements.txt                    # Python dependencies
├── main.py                             # Run all benchmarks
│
├── IR-Plag-Dataset/                    # Dataset directory
│   ├── original/                       # Original source files
│   ├── plagiarized/                    # Plagiarized versions
│   └── metadata.csv                    # Ground truth labels
│
├── java-sim-jaccard-opt.py            # Jaccard similarity ⚡ FASTEST
├── java-sim-exec-opt.py               # Output analysis 🏆 BEST ACCURACY
├── java-sim-winn-opt.py               # Winnowing algorithm
├── java-sim-ast-opt.py                # AST comparison
├── java-sim-bow-opt.py                # Bag-of-words
├── java-sim-bow2-opt.py               # Bag-of-words variant
├── java-sim-codebert-opt.py           # CodeBERT embeddings
├── java-sim-comments-opt.py           # Comment similarity
├── java-sim-fcall-opt.py              # Function call patterns
├── java-sim-fuzz-opt.py               # Fuzzy string matching
├── java-sim-graph-opt.py              # Graph-based comparison
├── java-sim-hash-opt.py               # Rolling hash
├── java-sim-image-opt.py              # Perceptual hashing
├── java-sim-lcs-opt.py                # Longest common subsequence
├── java-sim-lev-opt.py                # Levenshtein distance
├── java-sim-metrics-opt.py            # Metrics comparison
├── java-sim-ngrams-opt.py             # N-gram analysis
├── java-sim-pdg-opt.py                # Program dependence graph
├── java-sim-rk-opt.py                 # Rabin-Karp algorithm
├── java-sim-semclone-opt.py           # Semantic clone detection
├── java-sim-semdiff-opt.py            # Semantic differencing
├── java-sim-tdf-opt.py                # TF-IDF
├── java-sim-winn2-opt.py              # Winnowing variant

```

## 🔧 Advanced Usage

### Custom Dataset

To use your own Java dataset:

```python
import os
from java_sim_jaccard_opt import process_files

# Prepare your dataset
original_dir = "path/to/original/code"
clone_dir = "path/to/cloned/code"

# Process files
results = process_files(original_dir, clone_dir)

# Analyze results
for pair, similarity in results.items():
    print(f"{pair}: {similarity:.3f}")
```

### Adjusting Thresholds

Each script automatically finds optimal thresholds, but you can customize:

```python
# In any java-sim-*-opt.py script, modify:
CUSTOM_THRESHOLD = 0.80  # Your preferred threshold

# Then compare:
if similarity > CUSTOM_THRESHOLD:
    print("Clone detected!")
else:
    print("Not a clone")
```

### Combining Multiple Methods

For best results, combine multiple approaches:

```python
from java_sim_jaccard_opt import compute_jaccard_similarity
from java_sim_ast_opt import compute_ast_similarity
from java_sim_fcall_opt import compute_fcall_similarity

def ensemble_detection(code1, code2):
    """Combine multiple methods for robust detection"""
    
    jaccard_sim = compute_jaccard_similarity(code1, code2)
    ast_sim = compute_ast_similarity(code1, code2)
    fcall_sim = compute_fcall_similarity(code1, code2)
    
    # Weighted average
    ensemble_score = (
        0.4 * jaccard_sim +   # Fast, accurate
        0.3 * ast_sim +       # Structure-aware
        0.3 * fcall_sim       # Semantic
    )
    
    return ensemble_score > 0.75

# Usage
is_clone = ensemble_detection(code1, code2)
```

## 📈 Performance Optimization Tips

1. **For Speed**: Use Jaccard or Function Calls methods (< 3ms)
2. **For Accuracy**: Use Output Analysis (94% accuracy)
3. **For Balance**: Use Winnow (88% F-measure, ~77ms)
4. **For Scale**: Use fingerprinting methods (Winnow, Rabin-Karp)
5. **For Precision**: Use Rolling Hash (93% precision)

### Scaling to Large Codebases

```python
# For millions of files, use:
# 1. Jaccard for initial filtering
# 2. AST or Output Analysis for verification

def scalable_clone_detection(files):
    # Step 1: Fast filtering with Jaccard
    candidates = []
    for f1, f2 in file_pairs(files):
        if compute_jaccard_similarity(f1, f2) > 0.70:
            candidates.append((f1, f2))
    
    # Step 2: Verify candidates with AST
    clones = []
    for f1, f2 in candidates:
        if compute_ast_similarity(f1, f2) > 0.75:
            clones.append((f1, f2))
    
    return clones
```


## 📚 Additional Resources

### Related Work

- [BigCloneBench](https://github.com/clonebench/BigCloneBench) - Large-scale clone benchmark
- [SourcererCC](https://github.com/Mondego/SourcererCC) - Token-based clone detection
- [CCFinderX](https://github.com/YoshikiHigo/CCFinderX) - Token-based clone detector

## 📝 Citation

If you use CodeSim in your research, please cite:

```bibtex
@InProceedings{martinez2024codesim,
    author    = {Martinez-Gil, Jorge},
    editor    = {Bludau, Peter and Ramler, Rudolf and Winkler, Dietmar and Bergsmann, Johannes},
    title     = {Source Code Clone Detection Using Unsupervised Similarity Measures},
    booktitle = {Software Quality as a Foundation for Security},
    year      = {2024},
    publisher = {Springer Nature Switzerland},
    address   = {Cham},
    pages     = {21--37},
    isbn      = {978-3-031-56281-5},
    doi       = {10.1007/978-3-031-56281-5_2}
}
```

### Citation File

This repository includes a `citation.cff` file for easy citation. On GitHub, click "Cite this repository" button for formatted citations.

## 📄 License

This project is licensed under the MIT License.


## 🙏 Acknowledgments

- **Dataset**: Oscar Karnalim for creating the IR-Plag dataset
- **Institution**: Software Competence Center Hagenberg (SCCH)
- **Conference**: SWQD 2024 organizers and reviewers
- **Community**: All contributors and users of this project

## 📧 Contact

**Jorge Martinez-Gil, PhD**

- 🌐 Website: [jorgemar.com](https://www.jorgemar.com)
- 📧 Email: jorgemarcc@gmail.com
- 💼 LinkedIn: [Jorge Martinez-Gil](https://www.linkedin.com/in/jorgemartinezgil/)
- 🎓 ORCID: [0000-0002-5730-7965](https://orcid.org/0000-0002-5730-7965)
- 🔬 ResearchGate: [Jorge Martinez-Gil](https://www.researchgate.net/profile/Jorge-Martinez-Gil-3)
