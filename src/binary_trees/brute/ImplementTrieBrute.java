package binary_trees.brute;

import java.util.ArrayList;
import java.util.List;

/*
Problem: Implement Trie (Prefix Tree)

Brute Force Approach:
Store all inserted words in a list.
Search and startsWith are performed
by scanning the list.

Time Complexity:
Insert: O(1)
Search: O(n)
StartsWith: O(n)

Space Complexity: O(n)
*/

public class ImplementTrieBrute {

    private List<String> words = new ArrayList<>();

    public void insert(String word) {
        words.add(word);
    }

    public boolean search(String word) {

        for (String w : words) {
            if (w.equals(word)) {
                return true;
            }
        }

        return false;
    }

    public boolean startsWith(String prefix) {

        for (String w : words) {
            if (w.startsWith(prefix)) {
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {

        ImplementTrieBrute trie = new ImplementTrieBrute();

        trie.insert("apple");

        System.out.println(trie.search("apple"));
        System.out.println(trie.search("app"));
        System.out.println(trie.startsWith("app"));

        trie.insert("app");

        System.out.println(trie.search("app"));
    }
}
