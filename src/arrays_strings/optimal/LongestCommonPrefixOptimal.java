package arrays_strings.optimal;

import java.util.Arrays;

/*
Problem: Longest Common Prefix

Optimal Approach:
Sort the array and compare only
the first and last strings.

Time Complexity: O(n log n)
Space Complexity: O(1)
*/

public class LongestCommonPrefixOptimal {

    public static String longestCommonPrefix(String[] strs) {

        if (strs == null || strs.length == 0) {
            return "";
        }

        Arrays.sort(strs);

        String first = strs[0];
        String last = strs[strs.length - 1];

        int i = 0;

        while (i < first.length()
                && i < last.length()
                && first.charAt(i) == last.charAt(i)) {

            i++;
        }

        return first.substring(0, i);
    }

    public static void main(String[] args) {

        String[] strs = {"flower", "flow", "flight"};

        System.out.println(longestCommonPrefix(strs));
    }
}