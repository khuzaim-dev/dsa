package arrays_strings.optimal;

/*
Problem: Find Closest Number to Zero

Optimal Approach:
Single-pass traversal with proper tie handling.
If two numbers are equally close to zero,
the positive number is returned.

Time Complexity: O(n)
Space Complexity: O(1)
*/

public class FindClosestNumberToZeroOptimal {

    public static void main(String[] args) {

        int[] nums = {-4, -2, 1, 4, 8};

        int closest = nums[0];

        for (int i = 1; i < nums.length; i++) {

            if (Math.abs(nums[i]) < Math.abs(closest)
                    || (Math.abs(nums[i]) == Math.abs(closest) && nums[i] > closest)) {

                closest = nums[i];
            }
        }

        System.out.println("Closest Number to Zero: " + closest);
    }
}