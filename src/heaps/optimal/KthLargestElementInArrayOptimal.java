package heaps.optimal;

import java.util.PriorityQueue;

/*
Problem: Kth Largest Element in an Array

Optimal Approach:
Maintain a min-heap of size k.
The heap root is always the kth largest element.

Time Complexity: O(n log k)
Space Complexity: O(k)
*/

public class KthLargestElementInArrayOptimal {

    public static int findKthLargest(int[] nums, int k) {

        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        for (int num : nums) {

            minHeap.offer(num);

            if (minHeap.size() > k) {
                minHeap.poll();
            }
        }

        return minHeap.peek();
    }

    public static void main(String[] args) {

        int[] nums = {3, 2, 1, 5, 6, 4};
        int k = 2;

        System.out.println(findKthLargest(nums, k));
    }
}
