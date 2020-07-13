package 面试.算法.leetcode.Q226翻转二叉树;

import 面试.算法.TreeNode;

public class Solution1 {
    public TreeNode invertTree(TreeNode root) {
        if (root ==null){
            return null;
        }
        swapTree(root);
        invertTree(root.left);
        invertTree(root.right);
        return root;
    }

    private void swapTree(TreeNode root) {
        TreeNode temp = root.left;
        root.left=root.right;
        root.right= temp;
    }
}
