package binary_trees.brute;

import java.util.LinkedList;
import java.util.Queue;

/*
Problem: Maximum Depth of Binary Tree

Brute Force Approach:
Use BFS (Level Order Traversal) and count levels.

Time Complexity: O(n)
Space Complexity: O(n)
*/

public class MaximumDepthOfBinaryTreeBrute {

    public static int maxDepth(TreeNode root) {

        if (root == null) {
            return 0;
        }

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        int depth = 0;

        while (!queue.isEmpty()) {

            int size = queue.size();

            for (int i = 0; i < size; i++) {

                TreeNode current = queue.poll();

                if (current.left != null) {
                    queue.offer(current.left);
                }

                if (current.right != null) {
                    queue.offer(current.right);
                }
            }

            depth++;
        }

        return depth;
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