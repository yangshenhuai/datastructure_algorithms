package tree;

/**
 * https://leetcode.com/problems/invert-binary-tree/
 *
 * Given the root of a binary tree, invert the tree, and return its root.
 *
 *
 *
 */
public class InvertBinaryTree   {


    public TreeNode invertTree(TreeNode root) {
        if (root == null || (root.left == null && root.right == null)){
            return root;
        }
        TreeNode revertLeft = invertTree(root.left);
        TreeNode revertRight = invertTree(root.right);
        root.right = revertLeft;
        root.left = revertRight;
        return root;
    }

}

