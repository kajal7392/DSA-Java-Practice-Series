# 🧮 Median of Two Sorted Arrays

### 📌 Problem Statement:
Given two **sorted arrays** `nums1` and `nums2` of size `m` and `n` respectively, return the **median** of the two sorted arrays.  
You must solve the problem in **O(log(m+n))** time complexity.

---

### 💡 Examples:

#### Example 1:
```text
Input: nums1 = [1, 3], nums2 = [2]
Output: 2.0
Explanation: Merged array = [1, 2, 3] → median is 2


Example 2:
Input: nums1 = [1, 2], nums2 = [3, 4]
Output: 2.5
Explanation: Merged array = [1, 2, 3, 4] → median = (2 + 3)/2 = 2.5



🧠 Approaches
1️⃣ Brute Force Approach – Merge & Find Median
🔧 Idea:
Merge both arrays into a single sorted array.

If total elements are odd, return the middle one.

If even, return average of two middle elements.

✅ Time Complexity: O(m + n)
✅ Space Complexity: O(m + n)


2️⃣ Better Approach – Two Pointers, No Merge
🔧 Idea:
Use two pointers to simulate merge.

Stop when reaching the middle element.

Track last two elements to calculate median.

✅ Time Complexity: O(m + n)
✅ Space Complexity: O(1)


3️⃣ Optimal Approach – Binary Search (Log Time)
🔧 Idea:
Apply binary search on the smaller array.

Divide both arrays into two halves such that:

All elements on the left ≤ all elements on the right.

Use max from left and min from right to get median.

✅ Time Complexity: O(log(min(m, n)))
✅ Space Complexity: O(1)