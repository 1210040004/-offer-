package 面试.算法.leetcode.Q98验证二叉搜索树;

import 面试.算法.TreeNode;

public class Solution4 {

    long pre =Long.MIN_VALUE;
    public boolean isValidBST(TreeNode root) {
        if (root == null){
            return true;
        }
        if (!isValidBST(root.left)){
            return false;
        }
        if (root.val<=pre){
            return false;
        }
        pre = root.val;
        return isValidBST(root.right);
    }
}
