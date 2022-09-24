package tree;

import java.util.Stack;

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


    public TreeNode invertTree2(TreeNode root) {
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);
        while (!stack.isEmpty()){
            TreeNode node = stack.pop();
            TreeNode left = node.left;
            node.left = node.right;
            node.right = left;
            if (node.left != null){
                stack.push(node.left);
            }
            if (node.right != null){
                stack.push(node.right);
            }
        }
        return root;
    }

}

