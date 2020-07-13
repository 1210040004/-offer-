package 面试.算法.leetcode.Q113路经总和;

import 面试.算法.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Solution {
    List<List<Integer>> res = new ArrayList<>();
    public List<List<Integer>> pathSum(TreeNode root, int sum) {
        if (root == null){
            return  res;
        }
        LinkedList<Integer> tmp = new LinkedList<>();
        helper(root,sum,tmp);
        return res;
    }

    private void helper(TreeNode root, int target, LinkedList<Integer> tmp) {
       if (root.left==null && root.right == null && root.val == target){
           tmp.add(root.val);
           res.add(new ArrayList<>(tmp));
           return;
       }
       target-=root.val;
       tmp.add(root.val);
       if (root.left!=null){
           helper(root.left,target,tmp);
           tmp.removeLast();
       }
       if(root.right!=null){
           helper(root.right,target,tmp);
           tmp.removeLast();
       }
    }
}
