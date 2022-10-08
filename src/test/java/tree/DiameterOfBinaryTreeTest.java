package tree;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DiameterOfBinaryTreeTest {

    @Test
    public void testDiameterOfBinaryTree(){
        TreeNode root = new TreeNode(1);
        TreeNode left = new TreeNode(2);
        TreeNode right = new TreeNode(3);
        TreeNode left_l = new TreeNode(4);
        TreeNode left_r = new TreeNode(5);
        root.left = left;
        root.right = right;
        left.left = left_l;
        left.right = left_r;

        int result = new DiameterOfBinaryTree().diameterOfBinaryTree(root);
        assertEquals(3,result);

        TreeNode r2 = new TreeNode(4);
        TreeNode node1 = new TreeNode(-7);
        TreeNode node2 = new TreeNode(-3);
        r2.left = node1;
        r2.right = node2;

        TreeNode node3 = new TreeNode(-9);
        TreeNode node4 = new TreeNode(-3);
        node2.left = node3;
        node2.right = node4;




    }
}
