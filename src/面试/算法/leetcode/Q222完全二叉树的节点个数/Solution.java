package 面试.算法.leetcode.Q222完全二叉树的节点个数;

import 面试.算法.TreeNode;

public class Solution {
    int res = 0 ;
    public int countNodes(TreeNode root) {
        if (root == null){
            return res;
        }
        helper(root);
        return res;
    }

    private void helper(TreeNode root) {
        if (root == null){
            return;
        }
        helper(root.left);
        helper(root.right);
        res++;
    }
}
