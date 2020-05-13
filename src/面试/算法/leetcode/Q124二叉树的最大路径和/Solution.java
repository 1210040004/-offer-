package 面试.算法.leetcode.Q124二叉树的最大路径和;

import 面试.算法.TreeNode;

public class Solution {
    static int res = Integer.MIN_VALUE;

    public static int maxPathSum(TreeNode root) {
        calculate(root);
        return res;
    }

    private static int calculate(TreeNode root) {
        if (root == null){
            return 0 ;
        }
        int left = Math.max(0,calculate(root.left));
        int right = Math.max(0, calculate(root.right));
        res = Math.max(res,left+right+root.val);
        return Math.max(left,right)+root.val;
    }

    public static void main(String[] args) {
        TreeNode node = new TreeNode(0);
        System.out.println(maxPathSum(node));
    }
}
