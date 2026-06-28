package arrays_strings.brute;

/*
Problem: Find Closest Number to Zero

Brute Force Approach:
Scan every element and keep track of the number closest to zero.

Time Complexity: O(n)
Space Complexity: O(1)
*/

public class FindClosestNumberToZeroBrute {

    public static void main(String[] args) {

        int[] nums = {-4, -2, 1, 4, 8};

        int closest = nums[0];

        for (int num : nums) {

            if (Math.abs(num) < Math.abs(closest)) {
                closest = num;
            }

            else if (Math.abs(num) == Math.abs(closest) && num > closest) {
                closest = num;
            }

        }

        System.out.println("Closest Number to Zero: " + closest);
    }
}