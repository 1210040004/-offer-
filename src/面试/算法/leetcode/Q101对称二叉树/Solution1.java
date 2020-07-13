package 面试.算法.leetcode.Q101对称二叉树;

import 面试.算法.TreeNode;

public class Solution1 {
    public boolean isSymmetric(TreeNode root){
        if (root == null){
            return  true;
        }
        boolean res = helper(root,root);
        return res ;
    }

    private boolean helper(TreeNode t1, TreeNode t2) {
        if (t1 == null && t2 == null){
            return true;
        }
        if (t1 == null || t2 == null){
            return  false;
        }
        if (t1.val!=t2.val){
            return false;
        }
        return helper(t1.left,t2.right) && helper(t1.right,t2.left);
    }
}
