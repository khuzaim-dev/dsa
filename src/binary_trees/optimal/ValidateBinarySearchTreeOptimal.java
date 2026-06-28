package binary_trees.optimal;

/*
Problem: Validate Binary Search Tree

Optimal Approach:
Use DFS with minimum and maximum bounds.

Time Complexity: O(n)
Space Complexity: O(h)
*/

public class ValidateBinarySearchTreeOptimal {

    public static boolean isValid(TreeNode root, long min, long max) {

        if (root == null) {
            return true;
        }

        if (root.val <= min || root.val >= max) {
            return false;
        }

        return isValid(root.left, min, root.val)
                && isValid(root.right, root.val, max);
    }

    public static boolean isValidBST(TreeNode root) {

        return isValid(root, Long.MIN_VALUE, Long.MAX_VALUE);
    }

    public static void main(String[] args) {

        TreeNode root = new TreeNode(2);
        root.left = new TreeNode(1);
        root.right = new TreeNode(3);

        System.out.println(isValidBST(root));
    }
}