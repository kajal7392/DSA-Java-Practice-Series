# 🧪 Container With Most Water

## 📝 Problem Statement

Given an integer array `height` of length `n`, where each element represents the height of a vertical line at position `i`, you must find two lines that, along with the x-axis, form a container such that the container stores the **maximum amount of water**.

> You **cannot slant the container** — the sides must remain vertical.

---

## 📌 Examples

### ✅ Example 1:
**Input:**  
`height = [1,8,6,2,5,4,8,3,7]`  
**Output:**  
`49`  
**Explanation:**  
Choosing the lines at index 1 and 8 gives area `min(8,7) * (8 - 1) = 7 * 7 = 49`.

### ✅ Example 2:
**Input:**  
`height = [1,1]`  
**Output:**  
`1`

---

## ✅ Constraints

- `n == height.length`  
- `2 <= n <= 10^5`  
- `0 <= height[i] <= 10^4`

---

## 🚀 Approaches Implemented

### 1. 💡 Brute Force Approach

#### 🔸 Logic:
- Compare **every pair of lines** using two nested loops.
- For each pair, calculate the **area**:
  ```java
  area = min(height[i], height[j]) * (j - i);
  ```
- Track and return the **maximum area**.

#### 🔸 Time Complexity: `O(n^2)`  
#### 🔸 Space Complexity: `O(1)`

#### 🔸 File:
- `BruteforceApproach.java`

---

### 2. ⚡ Optimal Approach (Two Pointer)

#### 🔸 Logic:
- Start with two pointers: one at the **start**, one at the **end** of the array.
- At each step:
  - Calculate area between the two lines.
  - Move the **pointer pointing to the shorter line**, hoping to find a taller one and potentially a larger area.

#### 🔸 Why it works:
- Since area depends on the **minimum of the two heights**, moving the taller one won't help.
- So we move the shorter one, trying to find a better pair.

#### 🔸 Time Complexity: `O(n)`  
#### 🔸 Space Complexity: `O(1)`

#### 🔸 File:
- `OptimalApproach.java`

---

## ▶️ How to Run

```bash
# Navigate to the folder
cd Container_With_Most_Water

# Compile and run Brute Force
javac BruteforceApproach.java
java BruteforceApproach

# Compile and run Optimal
javac OptimalApproach.java
java OptimalApproach
```

---

## ✍️ Author

**Kajal Sharma**  
[GitHub Profile »](https://github.com/kajal7392)

_This problem is part of my DSA Java Practice Series._
