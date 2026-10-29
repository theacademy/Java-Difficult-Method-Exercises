# Java Interview Practice Difficult-Methods Lab

## Overview

These practice problems are designed to mirror the types of coding exercises candidates commonly encounter during junior Java developer, backend developer, support engineer, and QA automation interviews.

---

### Check Balanced Parentheses

**Difficulty:** **Difficult**

**Problem:** Verify that all parentheses are properly matched.

**Method signature:**

```java
public static boolean isBalanced(String expr)
```

**Examples:**

```text
Input:  "(())()"
Output: true

Input:  "(()"
Output: false
```

**Skills tested:**
- Stack
- Algorithmic thinking

---

### Two Sum

**Difficulty:** **Difficult**

**Problem:** Find two numbers whose sum equals a target value.

**Method signature:**

```java
public static int[] twoSum(int[] nums, int target)
```

**Example:**

```text
Input:  [2, 7, 11, 15]
Target: 9

Output: [0, 1]
```

**Skills tested:**
- HashMap
- Searching
- Problem solving

---

### Rotate an Array Right by K Positions

**Difficulty:** **Difficult**

**Problem:** Rotate all elements in an array to the right by `k` positions.

**Method signature:**

```java
public static int[] rotateRight(int[] nums, int k)
```

**Example:**

```text
Input:  [1, 2, 3, 4, 5], k = 2
Output: [4, 5, 1, 2, 3]
```

**Skills tested:**
- Arrays
- Modular arithmetic
- Index manipulation

### Merge Two Sorted Arrays

**Difficulty:** **Difficult**

**Problem:** Merge two sorted arrays into a single sorted array.

**Method signature:**

```java
public static int[] mergeSortedArrays(int[] arr1, int[] arr2)
```

**Example:**

```text
Input: [1, 3, 5]
       [2, 4, 6]

Output: [1, 2, 3, 4, 5, 6]
```

**Skills tested:**
- Two-pointer technique
- Array traversal
- Sorting concepts

---

## Recommended Lab Structure

For each method, you should:

### Step 1: Implement the Method

Write a working solution that satisfies the requirements.

### Step 2: Create Test Cases

Check the tests written and add if you need. Write tests that validate:
- Normal input
- Edge cases
- Invalid input (if applicable)
- Empty values
- Boundary conditions

### Step 3: Identify Edge Cases

Examples include:
- Empty strings
- Null values
- Single-element arrays
- Duplicate values
- Large datasets

### Step 4: Analyze Time Complexity

Document:

```text
Time Complexity: O(?)
Space Complexity: O(?)
```

### Step 5: Refactor the Solution

Improve:
- Readability
- Variable naming
- Method organization
- Efficiency

### Step 6: Discuss Alternative Approaches

Examples:
- Loop-based vs. recursive solutions
- Arrays vs. HashMaps
- Brute force vs. optimized algorithms

## Interview Discussion Questions

After solving each problem, ask yourself:

- How does your solution work?
- What is the time complexity?
- What is the space complexity?
- What edge cases did you consider?
- How would you optimize your solution?
- Could this be solved using a different data structure?
- How would your solution perform with one million records?

These follow-up questions closely match what candidates encounter during technical interviews and coding assessments.
