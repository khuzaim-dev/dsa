package binary_trees.optimal;

/*
Problem: Implement Trie (Prefix Tree)

Optimal Approach:
Use TrieNode objects with
26 children.

Insert: O(L)
Search: O(L)
StartsWith: O(L)

Space Complexity: O(total characters)
*/

public class ImplementTrieOptimal {

    static class TrieNode {

        TrieNode[] children = new TrieNode[26];
        boolean isEnd;
    }

    private TrieNode root;

    public ImplementTrieOptimal() {
        root = new TrieNode();
    }

    public void insert(String word) {

        TrieNode current = root;

        for (char c : word.toCharArray()) {

            int index = c - 'a';

            if (current.children[index] == null) {
                current.children[index] = new TrieNode();
            }

            current = current.children[index];
        }

        current.isEnd = true;
    }

    public boolean search(String word) {

        TrieNode current = root;

        for (char c : word.toCharArray()) {

            int index = c - 'a';

            if (current.children[index] == null) {
                return false;
            }

            current = current.children[index];
        }

        return current.isEnd;
    }

    public boolean startsWith(String prefix) {

        TrieNode current = root;

        for (char c : prefix.toCharArray()) {

            int index = c - 'a';

            if (current.children[index] == null) {
                return false;
            }

            current = current.children[index];
        }

        return true;
    }

    public static void main(String[] args) {

        ImplementTrieOptimal trie = new ImplementTrieOptimal();

        trie.insert("apple");

        System.out.println(trie.search("apple"));
        System.out.println(trie.search("app"));
        System.out.println(trie.startsWith("app"));

        trie.insert("app");

        System.out.println(trie.search("app"));
    }
}