package 面试.算法.实习.字节.交换树的左右节点;

import 面试.算法.TreeNode;

public class Solution {
    public  static void Mirror(TreeNode root){
        if (root == null) {
            return;
        }
        swapTreeNode(root);
        swapTreeNode(root.left);
        swapTreeNode(root.right);
    }
    public  static void swapTreeNode(TreeNode root){
        TreeNode tmp = root.left;
        root.left = root.right;
        root.right = tmp;
    }
}
