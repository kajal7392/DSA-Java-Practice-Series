/* Given two sorted arrays nums1 and nums2 of size m and n respectively, return the median of the two sorted arrays.

The overall run time complexity should be O(log (m+n)).  */


class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        // Always apply binary search on the smaller array
        if (nums1.length > nums2.length) {
            return findMedianSortedArrays(nums2, nums1);
        }

        int n1 = nums1.length;
        int n2 = nums2.length;
        int low = 0, high = n1;

        while (low <= high) {
            int cut1 = (low + high) / 2;
            int cut2 = (n1 + n2 + 1) / 2 - cut1;

            int left1 = (cut1 == 0) ? Integer.MIN_VALUE : nums1[cut1 - 1];
            int left2 = (cut2 == 0) ? Integer.MIN_VALUE : nums2[cut2 - 1];

            int right1 = (cut1 == n1) ? Integer.MAX_VALUE : nums1[cut1];
            int right2 = (cut2 == n2) ? Integer.MAX_VALUE : nums2[cut2];

            if (left1 <= right2 && left2 <= right1) {
                if ((n1 + n2) % 2 == 0) {
                    return (Math.max(left1, left2) + Math.min(right1, right2)) / 2.0;
                } else {
                    return Math.max(left1, left2);
                }
            } else if (left1 > right2) {
                high = cut1 - 1;
            } else {
                low = cut1 + 1;
            }
        }

        return 0.0; // In case no valid partition is found (shouldn't happen for valid input)
    }
}



/*
 Optimal Approach (Binary Search)
 Description:
            The optimal approach uses binary search to find the median in O(log(min(n, m))) 
            time complexity. It partitions the two arrays and ensures that all elements on the left are 
            less than or equal to those on the right.

 Steps:
 - Ensure the First Array is Smaller: Always perform binary search on the smaller array.
 - Binary Search Loop:
   - Calculate the cut positions for both arrays.
   - Determine the left and right elements around the cuts.
 - Check Valid Partition:
   - If the left elements are less than or equal to the right elements, calculate the median.
   - Adjust the search range based on the comparison of the left and right elements.
 Time Complexity: O(log(min(n, m)))
 */