package 面试.算法.牛客.二叉树的最大深度;

import 面试.算法.TreeNode;

public class Solution {
    public int TreeDepth(TreeNode root) {
        if (root == null){
            return 0;
        }
        return Math.max(TreeDepth(root.left),TreeDepth(root.right))+1;
    }
}
