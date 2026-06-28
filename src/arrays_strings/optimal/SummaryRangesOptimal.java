package arrays_strings.optimal;

import java.util.ArrayList;
import java.util.List;

/*
Problem: Summary Ranges

Optimal Approach:
Single pass using start and end pointers.

Time Complexity: O(n)
Space Complexity: O(n)
*/

public class SummaryRangesOptimal {

    public static List<String> summaryRanges(int[] nums) {

        List<String> result = new ArrayList<>();

        if (nums.length == 0) {
            return result;
        }

        int start = nums[0];

        for (int i = 1; i <= nums.length; i++) {

            if (i == nums.length || nums[i] != nums[i - 1] + 1) {

                int end = nums[i - 1];

                if (start == end) {
                    result.add(String.valueOf(start));
                } else {
                    result.add(start + "->" + end);
                }

                if (i < nums.length) {
                    start = nums[i];
                }
            }
        }

        return result;
    }

    public static void main(String[] args) {

        int[] nums = {0, 1, 2, 4, 5, 7};

        System.out.println(summaryRanges(nums));
    }
}