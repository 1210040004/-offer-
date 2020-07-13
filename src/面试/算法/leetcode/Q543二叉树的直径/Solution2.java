package 面试.算法.leetcode.Q543二叉树的直径;

import 面试.算法.TreeNode;

public class Solution2 {
    int res = 0;
    public int diameterOfBinaryTree(TreeNode root) {
        if (root == null){
            return 0;
        }
        helper(root);
        return res;
    }

    private int helper(TreeNode root) {
        if (root == null){
            return 0;
        }
        int left = helper(root.left);
        int right = helper(root.right);
        res = Math.max(left+right,res);
        return Math.max(left,right)+1;
    }
}
