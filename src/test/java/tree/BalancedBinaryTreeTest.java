package tree;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class BalancedBinaryTreeTest {


    @Test
    public void testBalancedTree(){
        TreeNode root = new TreeNode(1);
        TreeNode left = new TreeNode(2);
        TreeNode right = new TreeNode(3);
        TreeNode left_l = new TreeNode(4);
        TreeNode left_r = new TreeNode(5);
        root.left = left;
        root.right = right;
        left.left = left_l;
        left.right = left_r;

        assertTrue(new BalancedBinaryTree().isBalanced(root));

        TreeNode left_l_l = new TreeNode(6);
        left_l.left = left_l_l;

        assertFalse(new BalancedBinaryTree().isBalanced(root));
    }


}
