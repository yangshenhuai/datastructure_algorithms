package tree;

/**
 * https://leetcode.com/problems/subtree-of-another-tree/
 *
 *
 * Given the roots of two binary trees root and subRoot, return true if there is a subtree of root with the same structure and node values of subRoot and false otherwise.
 *
 * A subtree of a binary tree tree is a tree that consists of a node in tree and all of this node's descendants. The tree tree could also be considered as a subtree of itself.
 */
public class SubTreeOfAnotherTree {

    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        if (root == null){
            return false;
        }
        if (isSame(root,subRoot)){
            return true;
        }

        return isSubtree(root.left,subRoot) || isSubtree(root.right,subRoot);
    }

    private boolean isSame(TreeNode root1,TreeNode root2){
        if (root1 == null && root2 == null){
            return true;
        }
        if (root1 == null || root2 == null){
            return false;
        }
        if (root1.val != root2.val){
            return false;
        }
        else {
            return isSame(root1.left,root2.left) && isSame(root1.right,root2.right);
        }
    }


}
