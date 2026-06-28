package binary_trees.optimal;

import java.util.Stack;

/*
Problem: Kth Smallest Element in a BST

Optimal Approach:
Perform iterative inorder traversal
and stop when the kth smallest element
is reached.

Time Complexity: O(k)
Space Complexity: O(h)
*/

public class KthSmallestElementInABSTOptimal {

    public static int kthSmallest(TreeNode root, int k) {

        Stack<TreeNode> stack = new Stack<>();

        while (root != null || !stack.isEmpty()) {

            while (root != null) {
                stack.push(root);
                root = root.left;
            }

            root = stack.pop();
            k--;

            if (k == 0) {
                return root.val;
            }

            root = root.right;
        }

        return -1;
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
