package 面试.算法.leetcode.Q108有序数组构建平衡二叉树;

import 面试.算法.TreeNode;

public class Solution {
    public TreeNode sortedArrayToBST(int[] nums) {
      return helper2(nums,0,nums.length-1);
    }

    private TreeNode helper(int[] nums, int i, int j) {
        if (i>j){
            return null;
        }
        int mid = (i+j)/2;
        TreeNode root = new TreeNode(nums[mid]);
        root.left = helper(nums,i,mid-1);
        root.right = helper(nums,mid+1,j);
        return root;
    }
    private TreeNode helper2(int[] nums, int start, int end) {
        if (start>end){
            return null;
        }
        int mid = (start+end)/2;
        TreeNode root = new TreeNode(nums[mid]);
        root.left  = helper(nums,start,mid-1);
        root.right = helper(nums,mid+1,end);
        return  root;
    }
}
