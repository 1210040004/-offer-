package 面试.算法.leetcode.Q129根到叶子节点数字之和;

import 面试.算法.TreeNode;

public class Solution {
    int res = 0;
    public int sumNumbers(TreeNode root) {
        helper(root,"");
        return res;
    }

    private void helper(TreeNode root, String tmp) {
        if (root == null){
            int t = Integer.parseInt(tmp.toString());
            res+=t;
            return;
        }
        tmp+=root.val;
        helper(root.left,tmp);
        tmp = tmp.substring(0, tmp.length() - 1);
        helper(root.right,tmp);
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        TreeNode t1 = new TreeNode(1);
        TreeNode t2 = new TreeNode(2);
        TreeNode t3 = new TreeNode(3);
        t1.left = t2;
        t1.right = t3;
        System.out.println(s.sumNumbers(t1));
    }
}
