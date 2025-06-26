/* Given two sorted arrays nums1 and nums2 of size m and n respectively, return the median of the two sorted arrays.

The overall run time complexity should be O(log (m+n)).  */


class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n1 = nums1.length;
        int n2 = nums2.length;
        int[] merged = new int[n1 + n2];
        
        // Merge the two arrays
        int i = 0, j = 0, k = 0;
        while (i < n1 && j < n2) {
            if (nums1[i] < nums2[j]) {
                merged[k++] = nums1[i++];
            } else {
                merged[k++] = nums2[j++];
            }
        }
        while (i < n1) {
            merged[k++] = nums1[i++];
        }
        while (j < n2) {
            merged[k++] = nums2[j++];
        }

        // Find the median
        if ((n1 + n2) % 2 == 0) {
            return (merged[(n1 + n2) / 2 - 1] + merged[(n1 + n2) / 2]) / 2.0;
        } else {
            return merged[(n1 + n2) / 2];
        }
    }
}



/* Explanation:
   Brute Force Approach
  Description:
              The brute force approach involves merging the two sorted arrays into a single sorted array
             and then finding the median from that merged array.

  Steps:
  1. Merge the Arrays: Create a new array that combines both input arrays while maintaining sorted order.
  2. Find the Median:
  - If the total number of elements is odd, the median is the middle element.
  - If even, the median is the average of the two middle elements.
  Time Complexity: O(n + m), where n and m are the lengths of the two arrays.  */