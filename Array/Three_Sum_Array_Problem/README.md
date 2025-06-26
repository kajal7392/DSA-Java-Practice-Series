# 🧮 Three Sum Problem in Java

This project contains **multiple implementations of the classic "Three Sum" problem** using Java. The goal is to find all unique triplets in an integer array that sum up to zero.

---

## 📌 Problem Statement

Given an integer array `nums`, return all the **unique triplets** `[nums[i], nums[j], nums[k]]` such that:

- `i != j`, `i != k`, and `j != k`
- `nums[i] + nums[j] + nums[k] == 0`

You must ensure that the solution set does not contain duplicate triplets.

---

## 🧪 Example Inputs & Outputs

### Example 1
Input: [-1, 0, 1, 2, -1, -4]
Output: [[-1, -1, 2], [-1, 0, 1]]


### Example 2
Input: [0, 1, 1]
Output: []


### Example 3
Input: [0, 0, 0]
Output: [[0, 0, 0]]
---

## ✅ Constraints

- 3 ≤ `nums.length` ≤ 3000  
- -10⁵ ≤ `nums[i]` ≤ 10⁵

---

## 🧠 Solutions Included

### 1. Brute Force Approach – `BruteforceApproach.java`

- Time Complexity: `O(n³)`
- Checks all combinations of 3 numbers using triple for-loops.
- Does **not handle duplicates**, so triplets may be repeated.

### 2. HashSet-Based Optimized Approach – `ThreeSum.java`

- Time Complexity: `O(n²)`
- Sorts the array, then uses a HashSet to store unique triplets.
- Avoids duplicate triplets by using `Set<List<Integer>>`.

### 3. Two-Pointer Approach – `Solution.java`

- Time Complexity: `O(n²)`
- Most efficient among the three.
- Uses sorting + two pointers (`left` and `right`) to find valid triplets.
- Skips duplicates for all elements to ensure uniqueness.
- **Recommended for production use.**

---

## 🛠️ How to Run

You can compile and run any of the Java classes individually.

### Using Terminal:
```bash
javac BruteforceApproach.java
java BruteforceApproach

javac ThreeSum.java
java ThreeSum

javac Solution.java
java Solution


Make sure you have Java installed (JDK 8 or higher).


📂 File Structure
📁 ThreeSum/
├── BruteforceApproach.java       # Brute-force method (O(n³))
├── ThreeSum.java                 # HashSet based optimized method (O(n²))
├── Solution.java                 # Two-pointer most optimized solution (O(n²))
└── README.md                     # Project documentation


📚 Notes
The triplets may be in any order.

The inner list [a, b, c] in the output should contain numbers in any order but must be unique as a group.

👩‍💻 Author
Kajal Sharma




Feel free to fork, modify, or improve this solution as needed!