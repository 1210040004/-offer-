package 面试.算法.leetcode.Q98验证二叉搜索树;

import 面试.算法.TreeNode;

public class Solution2 {    public boolean isValidBST(TreeNode root) {
    return helper(root,Long.MIN_VALUE,Long.MAX_VALUE);
}
    public boolean helper(TreeNode root, Long lower,Long higher){
        if(root == null){
            return true;
        }
        if(lower>=root.val || root.val>=higher){
            return false;
        }
        return helper(root.left,lower, (long) root.val) && helper(root.right,(long)root.val,higher);
    }
}
