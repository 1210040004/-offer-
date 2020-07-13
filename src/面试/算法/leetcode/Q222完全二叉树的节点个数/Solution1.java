package 面试.算法.leetcode.Q222完全二叉树的节点个数;


import 面试.算法.TreeNode;



public class Solution1 {
    public int countNodes(TreeNode root) {
        {
            if (root == null) {
                return 0;
            }
            //因为当前树是 complete binary tree
            //所以可以通过从最左边和从最右边得到的高度判断当前是否是 perfect binary tree
            TreeNode left = root;
            int h1 = 0;
            while (left != null) {
                h1++;
                left = left.left;
            }
            TreeNode right = root;
            int h2 = 0;
            while (right != null) {
                h2++;
                right = right.right;
            }
            //如果是 perfect binary tree 就套用公式求解
            if (h1 == h2) {
                return (1 << h1) - 1;
            } else {
                return countNodes(root.left) + countNodes(root.right) + 1;
            }
        }
    }
}