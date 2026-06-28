# Hash Tables

## Overview

This folder contains Java implementations of common **Hash Table** problems. Hash tables provide fast lookup, insertion, and deletion, making them ideal for frequency counting, duplicate detection, grouping, and key-value mapping.

Each problem includes:

* **Brute Force** implementation
* **Optimal** implementation

---

## Problem List

| Problem                    | Difficulty |
| -------------------------- | ---------- |
| Contains Duplicate         | Easy       |
| Two Sum                    | Easy       |
| Maximum Number of Balloons | Easy       |
| Valid Anagram              | Easy       |
| Group Anagrams             | Medium     |

---

## Approach

### Contains Duplicate

* **Brute:** Sort the array and compare adjacent elements.
* **Optimal:** Store elements in a HashSet.

### Two Sum

* **Brute:** Check every possible pair.
* **Optimal:** Use a HashMap to store previously seen numbers.

### Maximum Number of Balloons

* **Brute:** Count characters manually.
* **Optimal:** Use character frequency counting.

### Valid Anagram

* **Brute:** Sort both strings and compare.
* **Optimal:** Compare character frequencies.

### Group Anagrams

* **Brute:** Compare every string with every other string.
* **Optimal:** Use sorted strings as HashMap keys.

---

## Complexity Table

| Problem                    | Brute Force | Optimal        |
| -------------------------- | ----------- | -------------- |
| Contains Duplicate         | O(n log n)  | O(n)           |
| Two Sum                    | O(n²)       | O(n)           |
| Maximum Number of Balloons | O(n)        | O(n)           |
| Valid Anagram              | O(n log n)  | O(n)           |
| Group Anagrams             | O(n² × k)   | O(n × k log k) |

---

## How to Run

Compile

```bash
javac src/hash_tables/brute/FileName.java
```

Run

```bash
java -cp src hash_tables.brute.FileName
```

Replace **brute** with **optimal** when running optimal solutions.
