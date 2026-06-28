package arrays_strings.optimal;

/*
Problem: Is Subsequence

Optimal Approach:
Use two pointers.
One pointer moves through s.
Another pointer moves through t.

Time Complexity: O(n + m)
Space Complexity: O(1)
*/

public class IsSubsequenceOptimal {

    public static boolean isSubsequence(String s, String t) {

        int i = 0;
        int j = 0;

        while (i < s.length() && j < t.length()) {

            if (s.charAt(i) == t.charAt(j)) {
                i++;
            }

            j++;

        }

        return i == s.length();
    }

    public static void main(String[] args) {

        String s = "abc";
        String t = "ahbgdc";

        System.out.println(isSubsequence(s, t));
    }
}

