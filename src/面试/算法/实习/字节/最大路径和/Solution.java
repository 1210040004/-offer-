package 面试.算法.实习.字节.最大路径和;

import 面试.算法.TreeNode;

public class Solution {
    int max = Integer.MIN_VALUE;
    public int maxPathSum(TreeNode root) {
        MaxPathDown(root);
        return max;
    }
    public int MaxPathDown(TreeNode root ){
        if(root ==null) return 0;
        int left = Math.max(0,MaxPathDown(root.left));
        int right = Math.max(0,MaxPathDown(root.right));
        max = Math.max(max,left+right+root.val);
        return Math.max(left,right)+root.val;
    }


    boolean res = true;
    public boolean isBalanced(TreeNode root) {
        if(root == null){
            return false;
        }
        recru(root);
        return res;
    }
    public int recru(TreeNode root){
        if(root == null){
            return 0 ;
        }
        int left =recru(root.left);
        int right = recru(root.right);
        if(Math.abs(left-right)>=2){ res = false;}
        return Math.max(left,right)+1;
    }
}
