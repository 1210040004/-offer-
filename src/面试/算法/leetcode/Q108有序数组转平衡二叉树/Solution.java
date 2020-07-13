package 面试.算法.leetcode.Q108有序数组转平衡二叉树;

import 面试.算法.TreeNode;

public class Solution {
    public TreeNode sortedArrayToBST(int[] nums) {
        if (nums==null || nums.length == 0){
            return null;
        }
        TreeNode res = helper(nums,0,nums.length-1);
        return res;
    }

    private TreeNode helper(int[] nums, int start, int end) {
        if (start>end){
            return null;
        }
        int mid = (start+end)/2;
        TreeNode root = new TreeNode(nums[mid]);
        root.left = helper(nums,start,mid-1);
        root.right = helper(nums,mid+1,end);
        return root;
    }

    public static void main(String[] args) {
        // 异或操作
        int a = 0;
        int i = 10;
        int b = 20;
        System.out.println(a^b);
        System.out.println(a^b^b);
    }
}
