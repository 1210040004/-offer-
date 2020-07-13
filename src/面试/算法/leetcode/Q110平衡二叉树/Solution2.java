package 面试.算法.leetcode.Q110平衡二叉树;

import 面试.算法.TreeNode;

public class Solution2 {
    boolean flag = true;
    public boolean isBalanced(TreeNode root) {
        if (root == null){
            return true;
        }
        // 判断一个二叉树，她的高度是否是平衡二叉树
        helper(root);
        return flag;
    }

    private int helper(TreeNode root) {
        if (root == null){
            return 0;
        }
        int left = helper(root.left);
        int right = helper(root.right);
        if (Math.abs(left-right)>=2){
            flag =false;
        }
        return Math.max(left,right)+1;
    }
}
