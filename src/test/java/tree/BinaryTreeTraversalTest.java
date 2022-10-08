package tree;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BinaryTreeTraversalTest {


    @Test
    public void testTraversalTree(){

        TreeNode root = new TreeNode(1);
        TreeNode left = new TreeNode(2);
        TreeNode right = new TreeNode(3);
        TreeNode left_l = new TreeNode(4);
        TreeNode left_r = new TreeNode(5);
        root.left = left;
        root.right = right;
        left.left = left_l;
        left.right = left_r;

        assertEquals("[4, 2, 5, 1, 3]",new BinaryTreeTraversal().inorderTraversal(root).toString());
        assertEquals("[1, 2, 4, 5, 3]",new BinaryTreeTraversal().preorderTraversal(root).toString());
        assertEquals("[4, 5, 2, 3, 1]",new BinaryTreeTraversal().postorderTraversal(root).toString());


    }

}
