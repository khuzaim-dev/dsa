package binary_trees.brute;

import java.util.ArrayList;
import java.util.List;

/*
Problem: Kth Smallest Element in a BST

Brute Force Approach:
Store the inorder traversal in a list,
then return the (k-1)th element.

Time Complexity: O(n)
Space Complexity: O(n)
*/

public class KthSmallestElementInABSTBrute {

    public static void inorder(TreeNode root, List<Integer> list) {

        if (root == null) {
            return;
        }

        inorder(root.left, list);
        list.add(root.val);
        inorder(root.right, list);
    }

    public static int kthSmallest(TreeNode root, int k) {

        List<Integer> list = new ArrayList<>();

        inorder(root, list);

        return list.get(k - 1);
    }

    public static void main(String[] args) {

        TreeNode root = new TreeNode(5);
        root.left = new TreeNode(3);
        root.right = new TreeNode(6);
        root.left.left = new TreeNode(2);
        root.left.right = new TreeNode(4);
        root.left.left.left = new TreeNode(1);

        int k = 3;

        System.out.println(kthSmallest(root, k));
    }
}