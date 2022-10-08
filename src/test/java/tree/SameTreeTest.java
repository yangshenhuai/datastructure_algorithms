package tree;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class SameTreeTest {

    @Test
    public void testSameTree(){
        TreeNode root = new TreeNode(1);
        TreeNode left = new TreeNode(2);
        TreeNode right = new TreeNode(3);
        TreeNode left_l = new TreeNode(4);
        TreeNode left_r = new TreeNode(5);
        root.left = left;
        root.right = right;
        left.left = left_l;
        left.right = left_r;



        TreeNode root1 = new TreeNode(1);
        TreeNode left1 = new TreeNode(2);
        TreeNode right1 = new TreeNode(3);
        TreeNode left_l1 = new TreeNode(4);
        TreeNode left_r1 = new TreeNode(5);
        root1.left = left1;
        root1.right = right1;
        left1.left = left_l1;
        left1.right = left_r1;


        assertTrue(new SameTree().isSameTree(root,root1));
        right1.val = 199;

        assertFalse(new SameTree().isSameTree(root,root1));

    }
}
