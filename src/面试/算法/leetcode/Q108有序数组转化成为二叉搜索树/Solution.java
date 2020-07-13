package 面试.算法.leetcode.Q108有序数组转化成为二叉搜索树;

import 面试.算法.TreeNode;

public class Solution {
    public TreeNode sortedArrayToBST(int[] nums) {
        TreeNode root = calcu(nums,0,nums.length-1);
        return root;
    }

    private TreeNode calcu(int[] nums, int i, int j) {
        if (i>j){
            return null;
        }
        int mid = (i+j)/2;
        TreeNode root = new TreeNode(nums[mid]);
        root.left = calcu(nums,i,mid-1);
        root.right = calcu(nums,mid+1,j);
        return root;
    }
}
