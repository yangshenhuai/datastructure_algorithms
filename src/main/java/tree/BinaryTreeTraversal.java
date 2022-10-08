package tree;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreeTraversal {

    private List<Integer> result = new ArrayList<>();
    public List<Integer> inorderTraversal(TreeNode root) {
        if (root == null){
            return result;
        }
        if (root.left != null) {
            inorderTraversal(root.left);
        }
        result.add(root.val);
        if (root.right != null){
            inorderTraversal(root.right);
        }
        return result;
    }

    public List<Integer> preorderTraversal(TreeNode root) {
        if (root == null){
            return result;
        }
        result.add(root.val);
        if (root.left != null) {
            preorderTraversal(root.left);
        }
        if (root.right != null){
            preorderTraversal(root.right);
        }
        return result;
    }

    public List<Integer> postorderTraversal(TreeNode root) {
        if (root == null){
            return result;
        }
        if (root.left != null) {
            postorderTraversal(root.left);
        }
        if (root.right != null){
            postorderTraversal(root.right);
        }
        result.add(root.val);
        return result;
    }


}
