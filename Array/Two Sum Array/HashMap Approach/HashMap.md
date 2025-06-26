# Two Sum Problem using - HashMAp Approach

## Problem Statement
Given an array of integers, find two numbers in the array that add up to a target sum.

---

## Approach
This is the **HashMap** approach to solve the Two Sum problem. The idea is to store the numbers we have seen so far in a HashMap.

---

## Logic
- Create an empty HashMap to store the elements of array and their corresponding indices.
- Traverse through the array.
- For each element, `nums[i]`, calculate the **complement** as `target - nums[i]`.
- Check if the complement exists in the HashMap:
  - If it does. return the current index and index of the complement.
  - If not, put the current number and its index into the Hashmap.
- If no such pair is found, return `[-1,-1]`.

---

## Time and Space Complexity
## Time and Space Complexity
- **Time complexity:** O(n) — because we traverse the array only once.
- **Space complexity:** O(n) — for storing elements in the HashMap.

---

## Running the Code
To test this approach with example inputs:

  1. Compile both files:
  - javac HashMapSolution.java
  - javac HashMapMain.java

  2. Run the main file:
   - java HashMapMain


   This will execute sample test cases and print the results. The output will be the indices of the pair that sums up to the target sum.