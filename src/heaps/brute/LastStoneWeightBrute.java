package heaps.brute;

import java.util.Arrays;

/*
Problem: Last Stone Weight

Brute Force Approach:
Sort the array after every smash.

Time Complexity: O(n² log n)
Space Complexity: O(n)
*/

public class LastStoneWeightBrute {

    public static int lastStoneWeight(int[] stones) {

        int size = stones.length;

        while (size > 1) {

            Arrays.sort(stones, 0, size);

            int y = stones[size - 1];
            int x = stones[size - 2];

            size -= 2;

            if (y != x) {
                stones[size] = y - x;
                size++;
            }
        }

        return size == 0 ? 0 : stones[0];
    }

    public static void main(String[] args) {

        int[] stones = {2, 7, 4, 1, 8, 1};

        System.out.println(lastStoneWeight(stones));
    }
}
