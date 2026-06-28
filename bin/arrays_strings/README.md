# Arrays & Strings

## Overview

This folder contains Java solutions for common **Arrays & Strings** problems. Each problem has two implementations:

* **Brute Force** — focuses on correctness.
* **Optimal** — improves time and/or space complexity.

---

## Problem List

| Problem                       | Difficulty |
| ----------------------------- | ---------- |
| Find Closest Number to Zero   | Easy       |
| Is Subsequence                | Easy       |
| Summary Ranges                | Easy       |
| Longest Common Prefix         | Easy       |
| Best Time to Buy & Sell Stock | Easy       |

---

## Approach

### Find Closest Number to Zero

* **Brute:** Scan the array while tracking the closest value.
* **Optimal:** One-pass solution with proper tie handling (positive number preferred).

### Is Subsequence

* **Brute:** Compare characters using nested loops.
* **Optimal:** Two-pointer traversal.

### Summary Ranges

* **Brute:** Compare every possible range.
* **Optimal:** Single pass through the array.

### Longest Common Prefix

* **Brute:** Compare every string character by character.
* **Optimal:** Sort strings and compare the first and last.

### Best Time to Buy & Sell Stock

* **Brute:** Check every buy/sell pair.
* **Optimal:** Track the minimum price while traversing once.

---

## Complexity Table

| Problem                       | Brute Force | Optimal    |
| ----------------------------- | ----------- | ---------- |
| Find Closest Number to Zero   | O(n)        | O(n)       |
| Is Subsequence                | O(n × m)    | O(n + m)   |
| Summary Ranges                | O(n²)       | O(n)       |
| Longest Common Prefix         | O(n × m)    | O(n log n) |
| Best Time to Buy & Sell Stock | O(n²)       | O(n)       |

---

## How to Run

Compile

```bash
javac src/arrays_strings/brute/FileName.java
```

Run

```bash
java -cp src arrays_strings.brute.FileName
```

Replace **brute** with **optimal** when running optimal solutions.
