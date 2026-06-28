# Heaps (Priority Queues)

## Overview

This folder contains Java solutions for problems solved using **Heaps (Priority Queues)**. A heap is a complete binary tree that efficiently supports retrieving the minimum or maximum element. Java provides the `PriorityQueue` class to implement heaps.

Each problem includes:

* **Brute Force** implementation
* **Optimal** implementation

---

## Problem List

| Problem                         | Difficulty |
| ------------------------------- | ---------- |
| Last Stone Weight               | Easy       |
| Kth Largest Element in an Array | Medium     |
| Top K Frequent Elements         | Medium     |

---

## Approach

### Last Stone Weight

* **Brute:** Sort the array after every stone smash and repeat until one stone remains.
* **Optimal:** Use a max-heap (PriorityQueue) to always retrieve the two heaviest stones efficiently.

### Kth Largest Element in an Array

* **Brute:** Sort the array and return the k-th largest element.
* **Optimal:** Maintain a min-heap of size `k`. The heap root always represents the k-th largest element.

### Top K Frequent Elements

* **Brute:** Count frequencies, sort all elements by frequency, and return the top `k`.
* **Optimal:** Count frequencies using a HashMap and maintain a min-heap of size `k` containing the most frequent elements.

---

## Complexity Table

| Problem                         | Brute Force | Optimal    |
| ------------------------------- | ----------- | ---------- |
| Last Stone Weight               | O(n² log n) | O(n log n) |
| Kth Largest Element in an Array | O(n log n)  | O(n log k) |
| Top K Frequent Elements         | O(n log n)  | O(n log k) |

**Note:**

* `n` = Number of elements
* `k` = Required number of elements

---

## How to Run

Compile

```bash
javac src/heaps/brute/FileName.java
```

Run

```bash
java -cp src heaps.brute.FileName
```

Replace **brute** with **optimal** when running optimal solutions.
