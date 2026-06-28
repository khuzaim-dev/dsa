package heaps.optimal;

import java.util.Collections;
import java.util.PriorityQueue;

/*
Problem: Last Stone Weight

Optimal Approach:
Use a Max Heap (PriorityQueue).

Time Complexity: O(n log n)
Space Complexity: O(n)
*/

public class LastStoneWeightOptimal {

    public static int lastStoneWeight(int[] stones) {

        PriorityQueue<Integer> maxHeap =
                new PriorityQueue<>(Collections.reverseOrder());

        for (int stone : stones) {
            maxHeap.offer(stone);
        }

        while (maxHeap.size() > 1) {

            int y = maxHeap.poll();
            int x = maxHeap.poll();

            if (y != x) {
                maxHeap.offer(y - x);
            }
        }

        return maxHeap.isEmpty() ? 0 : maxHeap.peek();
    }

    public static void main(String[] args) {

        int[] stones = {2, 7, 4, 1, 8, 1};

        System.out.println(lastStoneWeight(stones));
    }
}
