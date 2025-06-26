/* Given two sorted arrays nums1 and nums2 of size m and n respectively, return the median of the two sorted arrays.

The overall run time complexity should be O(log (m+n)).  */


class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n1 = nums1.length;
        int n2 = nums2.length;
        int total = n1 + n2;
        int count = 0;
        int i = 0, j = 0;
        int last1 = 0, last2 = 0;

        while (count <= total / 2) {
            last1 = last2; // Store the last element
            if (i < n1 && (j >= n2 || nums1[i] < nums2[j])) {
                last2 = nums1[i++];
            } else {
                last2 = nums2[j++];
            }
            count++;
        }

        if (total % 2 == 0) {
            return (last1 + last2) / 2.0;
        } else {
            return last2;
        }
    }
}



/* Explanation:
   Better Approach
  Description:
             The better approach avoids merging the arrays but still uses a linear scan to find the median. 
             It uses two pointers to traverse both arrays simultaneously.

  Steps:
  - Use Two Pointers: Traverse both arrays with two pointers, counting the total number of elements processed.
  - Find the Median:
    1. Keep track of the last two elements processed.
    2. When the total count reaches half of the combined length, calculate the median based on whether the total length is odd or even.
  Time Complexity: O(n + m), but without the overhead of creating a new array.
 */