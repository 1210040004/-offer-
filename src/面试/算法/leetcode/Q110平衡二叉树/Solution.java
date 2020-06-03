package 面试.算法.leetcode.Q110平衡二叉树;

import 面试.算法.TreeNode;

/**
 * 给定一个二叉树，判断它是否是高度平衡的二叉树。
 *
 * 本题中，一棵高度平衡二叉树定义为：
 *
 * 一个二叉树每个节点 的左右两个子树的高度差的绝对值不超过1。
 *
 * 示例 1:
 *
 * 给定二叉树 [3,9,20,null,null,15,7]
 *
 *     3
 *    / \
 *   9  20
 *     /  \
 *    15   7
 * 返回 true 。
 *
 * 示例 2:
 *
 * 给定二叉树 [1,2,2,3,3,null,null,4,4]
 *
 *        1
 *       / \
 *      2   2
 *     / \
 *    3   3
 *   / \
 *  4   4
 * 返回 false 。
 */
public class Solution {
    boolean res = true;
    public boolean isBalanced(TreeNode root) {
        recru(root);
        return res;
    }

    private int recru(TreeNode root) {
        if (root== null){
            return 0;
        }
        int left = recru(root.left);
        int right = recru(root.right);
        if (Math.abs(left-right)>=2) res = false;
        return Math.max(left,right)+1;
    }
}
