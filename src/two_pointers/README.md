# Two Pointers

## Overview

This folder contains Java solutions for problems solved using the **Two Pointer** technique. This approach uses two indices that move through a data structure to reduce unnecessary comparisons and improve efficiency.

Each problem includes:

* **Brute Force** implementation
* **Optimal** implementation

---

## Problem List

| Problem                   | Difficulty |
| ------------------------- | ---------- |
| Reverse String            | Easy       |
| Valid Palindrome          | Easy       |
| Container With Most Water | Medium     |

---

## Approach

### Reverse String

* **Brute:** Create a new array and copy characters in reverse order.
* **Optimal:** Swap characters in-place using two pointers.

### Valid Palindrome

* **Brute:** Remove non-alphanumeric characters, reverse the string, and compare.
* **Optimal:** Use two pointers from both ends while skipping non-alphanumeric characters.

### Container With Most Water

* **Brute:** Check every possible pair of lines.
* **Optimal:** Start with two pointers at both ends and always move the pointer with the smaller height.

---

## Complexity Table

| Problem                   | Brute Force | Optimal |
| ------------------------- | ----------- | ------- |
| Reverse String            | O(n)        | O(n)    |
| Valid Palindrome          | O(n)        | O(n)    |
| Container With Most Water | O(n²)       | O(n)    |

---

## How to Run

Compile

```bash
javac src/two_pointers/brute/FileName.java
```

Run

```bash
java -cp src two_pointers.brute.FileName
```

Replace **brute** with **optimal** when running optimal solutions.
