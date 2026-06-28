package binary_trees.brute;

import java.util.ArrayList;
import java.util.List;

/*
Problem: Validate Binary Search Tree

Brute Force Approach:
Store the inorder traversal in a list.
If the list is strictly increasing,
the tree is a valid BST.

Time Complexity: O(n)
Space Complexity: O(n)
*/

public class ValidateBinarySearchTreeBrute {

    public static void inorder(TreeNode root, List<Integer> list) {

        if (root == null) {
            return;
        }

        inorder(root.left, list);
        list.add(root.val);
        inorder(root.right, list);
    }

    public static boolean isValidBST(TreeNode root) {

        List<Integer> list = new ArrayList<>();

        inorder(root, list);

        for (int i = 1; i < list.size(); i++) {

            if (list.get(i) <= list.get(i - 1)) {
                return false;
            }

        }

        return true;
    }

    public static void main(String[] args) {

        TreeNode root = new TreeNode(2);
        root.left = new TreeNode(1);
        root.right = new TreeNode(3);

        System.out.println(isValidBST(root));
    }
}