package binary_trees.brute;

import java.util.ArrayList;
import java.util.List;

/*
Problem: Minimum Absolute Difference in BST

Brute Force Approach:
Store inorder traversal in a list,
then compare every pair to find
the minimum difference.

Time Complexity: O(n²)
Space Complexity: O(n)
*/

public class MinimumAbsoluteDifferenceInBSTBrute {

    public static void inorder(TreeNode root, List<Integer> list) {

        if (root == null) {
            return;
        }

        inorder(root.left, list);
        list.add(root.val);
        inorder(root.right, list);
    }

    public static int getMinimumDifference(TreeNode root) {

        List<Integer> list = new ArrayList<>();
        inorder(root, list);

        int min = Integer.MAX_VALUE;

        for (int i = 0; i < list.size(); i++) {

            for (int j = i + 1; j < list.size(); j++) {

                int diff = Math.abs(list.get(i) - list.get(j));

                if (diff < min) {
                    min = diff;
                }
            }
        }

        return min;
    }

    public static void main(String[] args) {

        TreeNode root = new TreeNode(4);
        root.left = new TreeNode(2);
        root.right = new TreeNode(6);
        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(3);

        System.out.println(getMinimumDifference(root));
    }
}