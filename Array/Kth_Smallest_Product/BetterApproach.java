/* Problem Statement:
You're given two sorted arrays nums1 and nums2, and an integer k.
Find the k-th smallest product from all possible products formed by picking one element from each array. */



// Solution:
import java.util.PriorityQueue;

public class BetterApproach {
    public int kthSmallestProduct(int[] nums1, int[] nums2, int k) {
        // Max heap to keep the k smallest products
        PriorityQueue<Long> maxHeap = new PriorityQueue<>((a, b) -> Long.compare(b, a));

        // Multiply all pairs and keep top k smallest using max heap
        for (int num1 : nums1) {
            for (int num2 : nums2) {
                long product = (long) num1 * num2;

                maxHeap.offer(product); // Add to heap

                if (maxHeap.size() > k) {
                    maxHeap.poll(); // Remove largest element
                }
            }
        }

        // Top of max heap is the kth smallest
        return (int) (long) maxHeap.peek();
    }

    // Main method to test
    public static void main(String[] args) {
        BetterApproach obj = new BetterApproach();
        int[] nums1 = {1, 3, 5};
        int[] nums2 = {2, 4, 6};
        int k = 4;

        int result = obj.kthSmallestProduct(nums1, nums2, k);
        System.out.println("The " + k + "th smallest product is: " + result);
    }
}
