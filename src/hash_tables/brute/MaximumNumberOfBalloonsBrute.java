package hash_tables.brute;

/*
Problem: Maximum Number of Balloons

Brute Force Approach:
Repeatedly try to form the word "balloon"
by decreasing character frequencies.

Time Complexity: O(n²)
Space Complexity: O(1)
*/

public class MaximumNumberOfBalloonsBrute {

    public static int maxNumberOfBalloons(String text) {

        int[] count = new int[26];

        for (char c : text.toCharArray()) {
            count[c - 'a']++;
        }

        int balloons = 0;

        while (true) {

            if (count['b' - 'a'] > 0 &&
                count['a' - 'a'] > 0 &&
                count['l' - 'a'] >= 2 &&
                count['o' - 'a'] >= 2 &&
                count['n' - 'a'] > 0) {

                count['b' - 'a']--;
                count['a' - 'a']--;
                count['l' - 'a'] -= 2;
                count['o' - 'a'] -= 2;
                count['n' - 'a']--;

                balloons++;

            } else {
                break;
            }
        }

        return balloons;
    }

    public static void main(String[] args) {

        String text = "loonbalxballpoon";

        System.out.println(maxNumberOfBalloons(text));
    }
}