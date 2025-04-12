# Two Sum Problem using - Optimal (Two Pointer) Approach

## Problem Statement
Given a **sorted array** of integers, find two numbers such that they add up to a given target sum. Return their indices.

---

## Approach: Two Pointer Technique
This is the **optimal solution** for the Two Sum problem when the input array is **sorted**. It uses the **two-pointer technique** which is efficient both in time and space.

---

## Logic
- Initialize two pointers:
  - `left` at the start of the array (index 0)
  - `right` at the end of the array (last index)
- While `left` is less than `right`:
  - Calculate the sum of elements at `left` and `right`.
  - If the sum equals the target → return the pair of indices.
  - If the sum is greater than the target → move the `right` pointer one step left.
  - If the sum is less than the target → move the `left` pointer one step right.
- If no pair is found after the loop, return an empty array.

---

## Time and Space Complexity
- **Time Complexity:** O(n)  
  (Each element is visited at most once using two pointers.)
    - **Space Complexity:** O(1)  
  (No extra space used, apart from variables.)

---

## Requirements
This approach works **only if the array is sorted** in ascending order. If it's not sorted, consider sorting it or use the HashMap approach.

---

## Running the Code
To test this approach with example inputs:

    1. Make sure both `TwoPointer.java` and `TwoPointerMain.java` are in the same folder.
    2. Open terminal in that folder and compile:
   - javac TwoPointer.java
   - javac TwoPointerMain.java
   - java TwoPointerMain


    This will execute sample test cases and print the results.