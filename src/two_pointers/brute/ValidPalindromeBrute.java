package two_pointers.brute;

/*
Problem: Valid Palindrome

Brute Force Approach:
Remove all non-alphanumeric characters,
convert to lowercase, reverse the string,
and compare.

Time Complexity: O(n)
Space Complexity: O(n)
*/

public class ValidPalindromeBrute {

    public static boolean isPalindrome(String s) {

        String cleaned = "";

        for (int i = 0; i < s.length(); i++) {

            char ch = Character.toLowerCase(s.charAt(i));

            if (Character.isLetterOrDigit(ch)) {
                cleaned += ch;
            }
        }

        String reversed = "";

        for (int i = cleaned.length() - 1; i >= 0; i--) {
            reversed += cleaned.charAt(i);
        }

        return cleaned.equals(reversed);
    }

    public static void main(String[] args) {

        String s = "A man, a plan, a canal: Panama";

        System.out.println(isPalindrome(s));
    }
}
