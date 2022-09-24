package tree;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MaxDepthTest {

    @Test
    public void testMaxDepth(){
        TreeNode root = new TreeNode(3);
        TreeNode left = new TreeNode(9);
        TreeNode right = new TreeNode(20);
        TreeNode right_l2_left = new TreeNode(15);
        TreeNode right_l2_right = new TreeNode(7);

        root.left = left;
        root.right = right;
        right.left = right_l2_left;
        right.right = right_l2_right;


        assertEquals(3, new MaxDepth().maxDepth(root));

    }

}
