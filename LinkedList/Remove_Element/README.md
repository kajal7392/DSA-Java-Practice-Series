# Remove Nth Node From End of List

## Problem Description
Given a linked list, the task is to remove the nth node from the end of the list and return the head of the modified list.

## Files Included
- `BruteForceApproach.java`: Implementation of the brute force approach to solve the problem.
- `OptimalApproach.java`: Implementation of the optimal approach using two pointers.

## Approaches

### 1. Brute Force Approach (Two Pass)
- **Time Complexity**: O(2n) = O(n)
- **Space Complexity**: O(1)

#### Steps:
1. **First Pass**: Count the total number of nodes in the linked list (denoted as L).
2. **Calculate Position**: Determine the position of the node to delete using the formula (L - n).
3. **Second Pass**: Traverse to the (L - n - 1)th node and remove the next node.

## 2. Optimal Approach (One Pass - Two Pointers)
- **Time Complexity**: O(n)
- **Space Complexity**: O(1)

### Steps:
1. **Use Fast and Slow Pointers**: Initialize two pointers, `fast` and `slow`, both starting at the dummy node.
2. **Move Fast Pointer**: Advance the `fast` pointer n nodes ahead.
3. **Move Both Pointers**: Move both pointers until the `fast` pointer reaches the end of the list.
4. **Remove Node**: The `slow` pointer will be at the (L - n - 1)th node, allowing you to remove the nth node from the end.

