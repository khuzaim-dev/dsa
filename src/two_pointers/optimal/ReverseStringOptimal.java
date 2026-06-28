package two_pointers.optimal;

/*
Problem: Reverse String

Optimal Approach:
Use two pointers and swap characters
from both ends.

Time Complexity: O(n)
Space Complexity: O(1)
*/

public class ReverseStringOptimal {

    public static void reverseString(char[] s) {

        int left = 0;
        int right = s.length - 1;

        while (left < right) {

            char temp = s[left];
            s[left] = s[right];
            s[right] = temp;

            left++;
            right--;
        }
    }

    public static void main(String[] args) {

        char[] s = {'h', 'e', 'l', 'l', 'o'};

        reverseString(s);

        System.out.println(s);
    }
}
