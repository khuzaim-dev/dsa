package heaps.brute;

import java.util.Arrays;

/*
Problem: Kth Largest Element in an Array

Brute Force Approach:
Sort the array and return the kth largest element.

Time Complexity: O(n log n)
Space Complexity: O(1)
*/

public class KthLargestElementInArrayBrute {

    public static int findKthLargest(int[] nums, int k) {

        Arrays.sort(nums);

        return nums[nums.length - k];
    }

    public static void main(String[] args) {

        int[] nums = {3, 2, 1, 5, 6, 4};
        int k = 2;

        System.out.println(findKthLargest(nums, k));
    }
}
