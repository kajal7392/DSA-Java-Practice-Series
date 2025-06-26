# Two Sum Problem using- Brute Force Approach

## Problem Statement
Given an array of integers, find two numbers in the array that add up to a target sum.

---

## Approach
This is the **brute force** approach to solve this problem. This approach uses **two nested loops** to check every pair of numbers in the array to see if they add up to the target.

---

## Logic
- Loop through every element 'i' in the array.
- Inside that loop, loop through every element 'j' starting from 'i+1'.
  - Check if the sum of 'i' and 'j' is equal to the target sum i.e. `arr[i] + arr[j] == targetSum`.
   - If yes, return indices '{i,j}'.
   - If no, continue to the next iteration of the inner loop.
- If no pair is found after checking all pairs, return '{-1,-1}'.


---

## Time and Space Complexity
- Time complexity: O(n^2) where n is the number of elements in the array.
- Space complexity: O(1) as we are not using any extra space that scales with the input size.

---

## Examples

#### Example 1:
-**Input:**
 `arr = [2, 7, 11, 15], targetSum = 9`
-**Output:**
 `[0, 1]`
-**Explanation:**
 `nums[0] + nums[1] = 2 + 7 = 9` → Match found.

---

#### Example 2:
- **Input:**  
  `arr = [1, 2, 3, 4, 5]`, `targetSum = 10`
- **Output (console):**  
  `Such pair not found in array`  
  `[-1, -1]`
- **Explanation:**  
  No combination adds up to 10.

---

## Running the Code
   To test this approach with example inputs:
   1. Make sure both files are in the same folder:
      - BruteForce.java -> contains logic
      - BruteForceMain.java -> contains the main method to run and test
    
    2. Compile both files:
        - `javac BruteForce.java`
        - `javac BruteForceMain.java`

    3. Run the main file:
        - `java BruteForceMain`

    This will execute sample test cases and print the results. The output will be the indices of the pair that sums up to the target sum.