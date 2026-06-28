package hash_tables.optimal;

import java.util.HashSet;

/*
Problem: Contains Duplicate

Optimal Approach:
Store each element in a HashSet.
If an element already exists, return true.

Time Complexity: O(n)
Space Complexity: O(n)
*/

public class ContainsDuplicateOptimal {

    public static boolean containsDuplicate(int[] nums) {

        HashSet<Integer> set = new HashSet<>();

        for (int num : nums) {

            if (set.contains(num)) {
                return true;
            }

            set.add(num);

        }

        return false;
    }

    public static void main(String[] args) {

        int[] nums = {1, 2, 3, 1};

        System.out.println(containsDuplicate(nums));
    }
}
