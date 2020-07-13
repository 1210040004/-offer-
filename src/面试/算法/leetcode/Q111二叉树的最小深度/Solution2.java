package 面试.算法.leetcode.Q111二叉树的最小深度;

public class Solution2 {
    public int minDepth(TreeNode root) {
        if (root == null){
            return 0;
        }
        if (root.left==null && root.right==null){
            return 1;
        }
        int left = minDepth(root.left);
        int right = minDepth(root.right);
        if (root.left==null || root.right==null){
            return left+right+1;
        }
        return  Math.min(left,right)+1;
    }
}
