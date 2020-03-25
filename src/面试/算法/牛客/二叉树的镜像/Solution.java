package 面试.算法.牛客.二叉树的镜像;

public class Solution {
    public void Mirror(TreeNode root) {
        // 先前序遍历这棵树的每个节点，如果遍历到的节点有子节点，就交换这两个子节点，当交换完所有的非叶子节点的左右子节点以后就得到了这个树的镜像
        if (root==null ) return ;
        if( root.left==null && root.right==null) return;
        TreeNode PTemp = root.left;
        root.left=root.right;
        root.right=PTemp;
        if (root.left!=null){
            Mirror(root.left);
        }
        if(root.right!=null){
            Mirror(root.right);
        }
    }
}
