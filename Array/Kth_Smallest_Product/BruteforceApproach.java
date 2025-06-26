/* Problem Statement:
You're given two sorted arrays nums1 and nums2, and an integer k.
Find the k-th smallest product from all possible products formed by picking one element from each array. */

// Solution:

import java.util.Collections;
import java.util.List;
import java.util.ArrayList;


class BruteforceApproach {
    public static int KthSmallestProduct(int[] nums1, int[] nums2, int k) {
        List <Long> products = new ArrayList<>();  // Creating list to store all possible products
        for(int i=0; i<nums1.length; i++) {
            for(int j=0; j<nums2.length; j++) {
                long product = nums1[i]*nums2[j];  // Multiply each pairs and convert into long
                products.add(product);
            }
        }
        Collections.sort(products);
        return (int) (long) products.get(k - 1);  // Get the products in 'Long', convert it in 'long' and
                                                  // then convert again in 'int' and return
    }

    public static void main(String[] args) {
        int[] nums1 = {-4, -2, 0, 3};
        int[] nums2 = {2,4};
        int k = 6;
        int result = KthSmallestProduct(nums1, nums2, k);
        System.out.println(" The " + k + "th Smallest product is: " + result);
    }
}