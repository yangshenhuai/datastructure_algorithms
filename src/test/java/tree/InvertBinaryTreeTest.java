package tree;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class InvertBinaryTreeTest {

    @Test
    public void testInvertTree(){
        TreeNode root = new TreeNode(2);
        TreeNode left = new TreeNode(1);
        TreeNode right = new TreeNode(3);

        root.left = left;
        root.right = right;

        new InvertBinaryTree().invertTree(root);

        assertEquals(2,root.val);
        assertEquals(3,root.left.val);
        assertEquals(1,root.right.val);





    }
}
