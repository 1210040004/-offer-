package 面试.算法.leetcode.Q112路径总和;

import 面试.算法.TreeNode;

public class Solution1 {
    boolean flag= false;
    public boolean hasPathSum(TreeNode root, int sum) {
        helper(root,sum);
        return flag;
    }
    public void helper(TreeNode root,int target){
        if (root.left == null && root.right == null){
            if (root.val == target){
                flag = true;
            }
            return;
        }
        if (!flag){
            target-= root.val;
            if (root.left!=null){
                helper(root.left,target);
            }
            if (root.right!=null){
                helper(root.right,target);
            }
        }
    }
}
