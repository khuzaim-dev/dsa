package arrays_strings.brute;

/*
Problem: Longest Common Prefix

Brute Force Approach:
Compare every character of the first string with
all other strings.

Time Complexity: O(n × m)
Space Complexity: O(1)
*/

public class LongestCommonPrefixBrute {

    public static String longestCommonPrefix(String[] strs) {

        if (strs == null || strs.length == 0) {
            return "";
        }

        String prefix = "";

        for (int i = 0; i < strs[0].length(); i++) {

            char current = strs[0].charAt(i);

            for (int j = 1; j < strs.length; j++) {

                if (i >= strs[j].length() || strs[j].charAt(i) != current) {
                    return prefix;
                }
            }

            prefix += current;
        }

        return prefix;
    }

    public static void main(String[] args) {

        String[] strs = {"flower", "flow", "flight"};

        System.out.println(longestCommonPrefix(strs));
    }
}