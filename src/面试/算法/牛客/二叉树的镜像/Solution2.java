package 面试.算法.牛客.二叉树的镜像;

public class Solution2 {
    public void Mirror(TreeNode root) {
        if (root == null){
            return;
        }
        swap(root);
        Mirror(root.left);
        Mirror(root.right);
    }
    public void swap(TreeNode root){
        TreeNode temp = root.left;
        root.left=root.right;
        root.right= temp;
    }
}
