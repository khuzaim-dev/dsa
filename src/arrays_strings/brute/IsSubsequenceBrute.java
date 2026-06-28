package arrays_strings.brute;

/*
Problem: Is Subsequence

Brute Force Approach:
For each character in string s, search through string t
until the character is found.

Time Complexity: O(n × m)
Space Complexity: O(1)
*/

public class IsSubsequenceBrute {

    public static boolean isSubsequence(String s, String t) {

        int start = 0;

        for (int i = 0; i < s.length(); i++) {

            boolean found = false;

            for (int j = start; j < t.length(); j++) {

                if (s.charAt(i) == t.charAt(j)) {
                    found = true;
                    start = j + 1;
                    break;
                }

            }

            if (!found) {
                return false;
            }

        }

        return true;
    }

    public static void main(String[] args) {

        String s = "abc";
        String t = "ahbgdc";

        System.out.println(isSubsequence(s, t));
    }
}
