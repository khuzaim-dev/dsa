package binary_trees.optimal;

/*
Problem: Maximum Depth of Binary Tree

Optimal Approach:
Use recursive DFS.

Time Complexity: O(n)
Space Complexity: O(h)
*/

public class MaximumDepthOfBinaryTreeOptimal {

    public static int maxDepth(TreeNode root) {

        if (root == null) {
            return 0;
        }

        return 1 + Math.max(maxDepth(root.left), maxDepth(root.right));
    }

    public static void main(String[] args) {

        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);

        System.out.println(maxDepth(root));
    }
}