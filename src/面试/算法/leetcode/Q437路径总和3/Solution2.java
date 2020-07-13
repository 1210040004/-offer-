package 面试.算法.leetcode.Q437路径总和3;

import 面试.算法.TreeNode;

public class Solution2 {
    int pathSum(TreeNode root, int sum) {
        if (root == null){
            return 0;
        }
        int path = getPath(root, sum)+pathSum(root.left,sum)+pathSum(root.right,sum);
        return path;
    }
    public int getPath(TreeNode root , int target){
        if (root == null){
            return 0;
        }
        int count = 0;
        if (root.val == target){
            count++;
        }
        int left = getPath(root.left, target - root.val);
        int right = getPath(root.right,target-root.val);
        return count+left+right;
    }
}
