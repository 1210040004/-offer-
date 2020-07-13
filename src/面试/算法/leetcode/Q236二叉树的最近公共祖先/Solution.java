package 面试.算法.leetcode.Q236二叉树的最近公共祖先;

import 面试.算法.TreeNode;

public class Solution {
    //递归解法 公共祖先
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root == null || root == p || root == q) return root;
        TreeNode left = lowestCommonAncestor(root.left, p, q);
        TreeNode right = lowestCommonAncestor(root.right, p, q);
        if(left == null) return right;
        if(right == null) return left;
        return root;
    }
    TreeNode res ;
    public TreeNode lowestCommonAncestor2(TreeNode root, TreeNode p, TreeNode q) {
        /**
         *
         */
        dfs(root,p,q);
        return res;
    }

    private boolean dfs(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null){
            return false;
        }
        boolean left = dfs(root.left,p,q);
        boolean right = dfs(root.right,p,q);
        if (left && right || ((root.val==p.val || root.val==q.val)&&(left||right))){
            res = root;
        }
        return left||right||(root.val ==p.val)||(root.val==q.val);
    }

    public TreeNode lowestCommonAncestor3(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null || root==p || root==q){
            return root;
        }
        TreeNode left = lowestCommonAncestor(root.left, p, q);
        TreeNode right= lowestCommonAncestor(root.right, p, q);
        if (left== null) {
            return right;
        }
        if (right == null){
            return  left;
        }
        return root;

    }
    public TreeNode lowestCommonAncestor4(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null || root==p|| root==q){
            return root;
        }
        TreeNode left = lowestCommonAncestor(root.left, p, q);
        TreeNode right = lowestCommonAncestor(root.right, p, q);
        if (left==null && right==null){
            return null;
        }
        if (left==null) {
            return right;
        }
        if (right==null) {
            return left;
        }
        return root;
    }
}
