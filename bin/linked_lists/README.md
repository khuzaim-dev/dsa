# Linked Lists

## Overview

This folder contains Java solutions for common **Linked List** problems. These problems focus on node manipulation, pointer operations, cycle detection, and merging sorted lists.

Each problem includes:

* **Brute Force** implementation
* **Optimal** implementation

---

## Problem List

| Problem                            | Difficulty |
| ---------------------------------- | ---------- |
| Remove Duplicates from Sorted List | Easy       |
| Linked List Cycle                  | Easy       |
| Merge Two Sorted Lists             | Easy       |

---

## Approach

### Remove Duplicates from Sorted List

* **Brute:** Copy unique values into a list and rebuild the linked list.
* **Optimal:** Traverse the list once and skip duplicate nodes in-place.

### Linked List Cycle

* **Brute:** Store visited nodes in a HashSet to detect repeated nodes.
* **Optimal:** Use Floyd's Cycle Detection Algorithm (Fast & Slow Pointers).

### Merge Two Sorted Lists

* **Brute:** Store all values, sort them, and rebuild the linked list.
* **Optimal:** Merge both sorted lists using two pointers without extra sorting.

---

## Complexity Table

| Problem                            | Brute Force | Optimal |
| ---------------------------------- | ----------- | ------- |
| Remove Duplicates from Sorted List | O(n)        | O(n)    |
| Linked List Cycle                  | O(n)        | O(n)    |
| Merge Two Sorted Lists             | O(n log n)  | O(n)    |

**Note:** The optimal solutions reduce extra space usage wherever possible.

---

## How to Run

Compile

```bash
javac src/linked_lists/brute/FileName.java
```

Run

```bash
java -cp src linked_lists.brute.FileName
```

Replace **brute** with **optimal** when running optimal solutions.
