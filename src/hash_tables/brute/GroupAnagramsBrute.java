package hash_tables.brute;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
Problem: Group Anagrams

Brute Force Approach:
Compare every string with every other string
by sorting and checking if they are anagrams.

Time Complexity: O(n² × k log k)
Space Complexity: O(n)
*/

public class GroupAnagramsBrute {

    public static List<List<String>> groupAnagrams(String[] strs) {

        List<List<String>> result = new ArrayList<>();
        boolean[] visited = new boolean[strs.length];

        for (int i = 0; i < strs.length; i++) {

            if (visited[i]) {
                continue;
            }

            List<String> group = new ArrayList<>();
            group.add(strs[i]);
            visited[i] = true;

            char[] first = strs[i].toCharArray();
            Arrays.sort(first);

            for (int j = i + 1; j < strs.length; j++) {

                if (visited[j]) {
                    continue;
                }

                char[] second = strs[j].toCharArray();
                Arrays.sort(second);

                if (Arrays.equals(first, second)) {
                    group.add(strs[j]);
                    visited[j] = true;
                }
            }

            result.add(group);
        }

        return result;
    }

    public static void main(String[] args) {

        String[] strs = {"eat", "tea", "tan", "ate", "nat", "bat"};

        System.out.println(groupAnagrams(strs));
    }
}