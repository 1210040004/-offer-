package 面试.算法.leetcode.Q437路径总和3;

import 面试.算法.TreeNode;

public class Solution {
    int pathSum(TreeNode root, int sum) {
        if (root == null) return 0;
        int pathImLeading = count(root, sum); // 自己为开头的路径数
        int leftPathSum = pathSum(root.left, sum); // 左边路径总数（相信他能算出来）
        int rightPathSum = pathSum(root.right, sum); // 右边路径总数（相信他能算出来）
        return leftPathSum + rightPathSum + pathImLeading;
    }
    int count(TreeNode node, int sum) {
        if (node == null) return 0;
        // 我自己能不能独当一面，作为一条单独的路径呢？
        int isMe = (node.val == sum) ? 1 : 0;
        // 左边的小老弟，你那边能凑几个 sum - node.val 呀？
        int leftBrother = count(node.left, sum - node.val);
        // 右边的小老弟，你那边能凑几个 sum - node.val 呀？
        int rightBrother = count(node.right, sum - node.val);
        return  isMe + leftBrother + rightBrother; // 我这能凑这么多个
    }
}
