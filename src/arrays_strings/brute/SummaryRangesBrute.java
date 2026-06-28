package arrays_strings.brute;

import java.util.ArrayList;
import java.util.List;

/*
Problem: Summary Ranges

Brute Force Approach:
For each number, find the end of its consecutive range.

Time Complexity: O(n²)
Space Complexity: O(n)
*/

public class SummaryRangesBrute {

    public static List<String> summaryRanges(int[] nums) {

        List<String> result = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {

            int start = nums[i];
            int end = start;

            int j = i;

            while (j + 1 < nums.length && nums[j + 1] == nums[j] + 1) {
                end = nums[j + 1];
                j++;
            }

            if (start == end) {
                result.add(String.valueOf(start));
            } else {
                result.add(start + "->" + end);
            }

            i = j;
        }

        return result;
    }

    public static void main(String[] args) {

        int[] nums = {0, 1, 2, 4, 5, 7};

        System.out.println(summaryRanges(nums));
    }
}