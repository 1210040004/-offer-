package 面试.算法.leetcode.二叉树是否相同结构;

import 面试.算法.TreeNode;


public class Solution {
    public static boolean isSameStructTree(TreeNode p, TreeNode q){
        if (p==null && q == null){
            return true;
        }
        if (p==null || q == null){
            return false;
        }
        return isSameStructTree(p.left,q.left) && isSameStructTree(p.right,q.right);
    }
}
