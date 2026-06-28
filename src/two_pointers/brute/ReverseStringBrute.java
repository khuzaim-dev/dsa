package two_pointers.brute;

/*
Problem: Reverse String

Brute Force Approach:
Create a new array and copy characters
from the end to the beginning.

Time Complexity: O(n)
Space Complexity: O(n)
*/

public class ReverseStringBrute {

    public static char[] reverseString(char[] s) {

        char[] result = new char[s.length];

        for (int i = 0; i < s.length; i++) {
            result[i] = s[s.length - 1 - i];
        }

        return result;
    }

    public static void main(String[] args) {

        char[] s = {'h', 'e', 'l', 'l', 'o'};

        char[] reversed = reverseString(s);

        System.out.println(reversed);
    }
}