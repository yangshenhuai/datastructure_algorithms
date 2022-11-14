package tree;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class SubTreeOfAnotherTreeTest {
    @Test
    public void testSubTree(){

        TreeNode root = new TreeNode(1);
        TreeNode left = new TreeNode(2);
        TreeNode right = new TreeNode(3);
        TreeNode left_l = new TreeNode(4);
        TreeNode left_r = new TreeNode(5);
        root.left = left;
        root.right = right;
        left.left = left_l;
        left.right = left_r;

        TreeNode subRoot = new TreeNode(2);
        TreeNode subRoot_l = new TreeNode(4);
        TreeNode subRoot_r = new TreeNode(5);
        subRoot.left = subRoot_l;
        subRoot.right = subRoot_r;

        assertTrue(new SubTreeOfAnotherTree().isSubtree(root,subRoot));

    }
}
