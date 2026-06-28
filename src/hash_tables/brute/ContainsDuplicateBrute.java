package hash_tables.brute;

import java.util.Arrays;

/*
Problem: Contains Duplicate

Brute Force Approach:
Sort the array and compare adjacent elements.

Time Complexity: O(n log n)
Space Complexity: O(1)
*/

public class ContainsDuplicateBrute {

    public static boolean containsDuplicate(int[] nums) {

        Arrays.sort(nums);

        for (int i = 0; i < nums.length - 1; i++) {

            if (nums[i] == nums[i + 1]) {
                return true;
            }

        }

        return false;
    }

    public static void main(String[] args) {

        int[] nums = {1, 2, 3, 1};

        System.out.println(containsDuplicate(nums));
    }
}