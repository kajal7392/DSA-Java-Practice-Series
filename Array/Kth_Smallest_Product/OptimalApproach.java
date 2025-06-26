/* Problem Statement:
You're given two sorted arrays nums1 and nums2, and an integer k.
Find the k-th smallest product from all possible products formed by picking one element from each array. */


// Solution:
public class OptimalApproach {
    public int kthSmallestProduct(int[] nums1, int[] nums2, int k) {
        long low = -1_000_000_000_000L;   // Very small number
        long high = 1_000_000_000_000L;   // Very large number

        while (low < high) {
            long mid = low + (high - low) / 2;

            long count = countProductsLessEqual(nums1, nums2, mid);

            if (count < k) {
                low = mid + 1;
            } else {
                high = mid;
            }
        }
        return (int) low;
    }

    private long countProductsLessEqual(int[] nums1, int[] nums2, long target) {
        long count = 0;
        for (int a : nums1) {
            count += countWith(nums2, a, target);
        }
        return count;
    }

    private long countWith(int[] nums, int a, long target) {
        int left = 0, right = nums.length - 1, res = 0;
        if (a == 0) {
            if (target >= 0) return nums.length;
            else return 0;
        } else if (a > 0) {
            while (left <= right) {
                int mid = (left + right) / 2;
                if ((long) a * nums[mid] <= target) {
                    res = mid + 1;
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            }
        } else {
            // a < 0
            while (left <= right) {
                int mid = (left + right) / 2;
                if ((long) a * nums[mid] <= target) {
                    res = nums.length - mid;
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            }
        }
        return res;
    }

    public static void main(String[] args) {
        OptimalApproach obj = new OptimalApproach();
        int[] nums1 = {-4, -2, 0, 3};
        int[] nums2 = {2, 4};
        int k = 4;

        int result = obj.kthSmallestProduct(nums1, nums2, k);
        System.out.println("The " + k + "th smallest product is: " + result);
    }
}
