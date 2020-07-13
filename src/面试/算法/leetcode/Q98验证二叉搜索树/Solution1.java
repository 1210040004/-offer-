package 面试.算法.leetcode.Q98验证二叉搜索树;

import 面试.算法.TreeNode;

public class Solution1 {
    public boolean isValidBST(TreeNode root) {
        if (root == null){
            return  true;
        }
        if (root.left!=null && root.val <= root.left.val) return false;
        if (root.right!=null && root.val>= root.right.val) return false;
        return isValidBST(root.left) && isValidBST(root.right);
    }
}
