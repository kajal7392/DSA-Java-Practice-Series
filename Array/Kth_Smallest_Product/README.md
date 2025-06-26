# 📌 Kth Smallest Product of Two Sorted Arrays

Given two **sorted arrays** `nums1` and `nums2`, and an integer `k`, the task is to **find the k-th smallest product** from all possible products formed by picking one element from each array.

---

## 🧠 Problem Statement

You are given:
- Two sorted arrays: `nums1[]`, `nums2[]`
- A number `k`

Your task is to return the **k-th smallest product** formed by `nums1[i] * nums2[j]` for all valid `i`, `j`.

---

## ✅ Constraints

- `1 <= nums1.length, nums2.length <= 5 * 10^4`
- `-10^5 <= nums1[i], nums2[j] <= 10^5`
- `1 <= k <= nums1.length * nums2.length`

---

## 📂 Folder Structure

```bash
Kth_Smallest_Product/
├── BruteforceApproach.java
├── BetterApproach.java
├── OptimalApproach.java
└── README.md


🧪 Example


Input:
nums1 = [-4, -2, 0, 3]
nums2 = [2, 4]
k = 4

Output:
-8

Explanation:
All products = [-16, -8, -4, -2, 0, 0, 6, 8]
Sorted = [-16, -8, -4, -2, 0, 0, 6, 8]
4th smallest = -2






🔍 Approaches
1️⃣ Brute Force Approach
Logic: Multiply every element of nums1 with every element of nums2, store them in a list, sort the list, return the k-1th index.

Time Complexity: O(m * n + m * n log(m * n))

Space Complexity: O(m * n)

File: BruteforceApproach.java

2️⃣ Better Approach (Max Heap)
Logic: Use a max-heap to keep the smallest k elements.

Iterate all pairs, push into max-heap.

If size > k, remove the largest.

Time Complexity: O(m * n * log(k))

Space Complexity: O(k)

File: BetterApproach.java

3️⃣ Optimal Approach (Binary Search)
Logic: Use binary search over the range of all possible products:

Count how many products are ≤ mid using a custom countLessOrEqual() function.

Based on the count, shift binary search bounds.

Time Complexity: O(log(range) * (m + n))

Space Complexity: O(1)

File: OptimalApproach.java




🚀 How to Run
Compile and run using the command line:


javac BruteforceApproach.java
java BruteforceApproach

javac BetterApproach.java
java BetterApproach

javac OptimalApproach.java
java OptimalApproach




✅ Make sure you are in the correct directory and Java is installed.





👩‍💻 Author

💼 Kajal Sharma

🔗 GitHub: @kajal7392




📘 Notes
Handles edge cases: negatives, zeros, large arrays.

OptimalApproach is the best solution for large-scale inputs.






