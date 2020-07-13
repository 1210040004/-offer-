package 面试.算法.leetcode.Q124二叉树的最大路径和;

import 面试.算法.TreeNode;

public class Solution2 {
    int res = Integer.MIN_VALUE;
    public int maxPathSum(TreeNode root) {
        helper(root);
        return res;
    }

    private int helper(TreeNode root) {
        if (root == null){
            return 0;
        }
        int left = Math.max(0,helper(root.left));
        int right = Math.max(0,helper(root.right));
        res =Math.max(left+right+root.val,res);
        return Math.max(left,right)+root.val;
    }
}
