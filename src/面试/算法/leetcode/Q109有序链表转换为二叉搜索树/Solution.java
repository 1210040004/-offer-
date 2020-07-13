package 面试.算法.leetcode.Q109有序链表转换为二叉搜索树;

import 面试.算法.TreeNode;
import 面试.算法.牛客.链表中环的入口.ListNode;

import java.util.ArrayList;

public class Solution {
    public TreeNode sortedListToBST(ListNode head) {
        ArrayList<Integer> list = new ArrayList<>();
        while(head!=null){
            list.add(head.val);
            head = head.next;
        }
        Integer[] objects = (Integer[]) list.toArray();
        return sortedArrayToBST(objects);
    }
    public TreeNode sortedArrayToBST(Integer[] nums) {
        return helper2(nums,0,nums.length-1);
    }

    private TreeNode helper(Integer[] nums, int i, int j) {
        if (i>j){
            return null;
        }
        int mid = (i+j)/2;
        TreeNode root = new TreeNode(nums[mid]);
        root.left = helper(nums,i,mid-1);
        root.right = helper(nums,mid+1,j);
        return root;
    }
    private TreeNode helper2(Integer[] nums, int start, int end) {
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
