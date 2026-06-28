# Binary Trees

## Overview

This folder contains Java solutions for common **Binary Tree** and **Binary Search Tree (BST)** problems. The implementations cover tree traversals, recursion, breadth-first search (BFS), depth-first search (DFS), BST properties, and Trie (Prefix Tree).

Each problem includes:

* **Brute Force** implementation
* **Optimal** implementation

---

## Problem List

| Problem                            | Difficulty |
| ---------------------------------- | ---------- |
| Invert Binary Tree                 | Easy       |
| Maximum Depth of Binary Tree       | Easy       |
| Kth Smallest Element in a BST      | Medium     |
| Diameter of Binary Tree            | Easy       |
| Validate Binary Search Tree        | Medium     |
| Implement Trie (Prefix Tree)       | Medium     |
| Minimum Absolute Difference in BST | Easy       |

---

## Approach

### Invert Binary Tree

* **Brute:** Use BFS with a queue to swap child nodes.
* **Optimal:** Use recursive DFS to invert the tree.

### Maximum Depth of Binary Tree

* **Brute:** Perform level-order traversal (BFS) and count levels.
* **Optimal:** Use recursive DFS to calculate the maximum depth.

### Kth Smallest Element in a BST

* **Brute:** Store inorder traversal in a list and return the k-th element.
* **Optimal:** Perform iterative inorder traversal and stop at the k-th node.

### Diameter of Binary Tree

* **Brute:** Calculate the height of every subtree repeatedly.
* **Optimal:** Compute height and diameter together in a single DFS traversal.

### Validate Binary Search Tree

* **Brute:** Perform inorder traversal and verify the sequence is strictly increasing.
* **Optimal:** Validate recursively using minimum and maximum value bounds.

### Implement Trie (Prefix Tree)

* **Brute:** Store all words in a list and perform linear searches.
* **Optimal:** Build a Trie using TrieNode objects for efficient insert and search operations.

### Minimum Absolute Difference in BST

* **Brute:** Store inorder traversal and compare every pair of values.
* **Optimal:** Compare each node only with the previous node during inorder traversal.

---

## Complexity Table

| Problem                            | Brute Force  | Optimal |
| ---------------------------------- | ------------ | ------- |
| Invert Binary Tree                 | O(n)         | O(n)    |
| Maximum Depth of Binary Tree       | O(n)         | O(n)    |
| Kth Smallest Element in a BST      | O(n)         | O(k)    |
| Diameter of Binary Tree            | O(n²)        | O(n)    |
| Validate Binary Search Tree        | O(n)         | O(n)    |
| Implement Trie                     | Search: O(n) | O(L)    |
| Minimum Absolute Difference in BST | O(n²)        | O(n)    |

**Note:** `n` = number of nodes, `k` = required position, `L` = length of the word.

---

## How to Run

Compile

```bash
javac src/binary_trees/brute/FileName.java
```

Run

```bash
java -cp src binary_trees.brute.FileName
```

Replace **brute** with **optimal** when running optimal solutions.
