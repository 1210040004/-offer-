package 面试.算法.leetcode.Q104二叉树的高度;

import 面试.算法.TreeNode;

public class Solution {
    public int maxDepth(TreeNode root) {
        if (root== null){
            return 0;
        }
        return Math.max(maxDepth(root.left),maxDepth(root.right))+1;
    }
}
