package 面试.算法.leetcode.Q236二叉树的最近公共祖先;

import 面试.算法.TreeNode;

public class Solution2 {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null|| root == p || root ==q){
            return root;
        }
        TreeNode lert = lowestCommonAncestor(root.left,p,q);
        TreeNode right = lowestCommonAncestor(root.right,p,q);
        if (lert==null){
            return right;
        }
        if (right==null){
            return lert;
        }
        return  root;
    }
}
