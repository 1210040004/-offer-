package 面试.算法.leetcode.Q99恢复二叉搜索树;

import java.util.Stack;

public class Solution {
    public void recoverTree(TreeNode root) {
        if (root == null) return;
        Stack<TreeNode> stack = new Stack<>();
        TreeNode pre = null, cur = root, wrongNode = null;
        while (!stack.isEmpty() || cur != null) {
            if (cur != null) {
                stack.add(cur);
                cur = cur.left;
            } else {
                cur = stack.pop();
                //与上一个节点比较，找到错误节点
                if (wrongNode == null && pre != null && cur.val < pre.val) {
                    wrongNode = pre;
                }
                //表示当前节点是否大于wrongNode
                if (wrongNode != null && cur.val > wrongNode.val) {
                    swap(pre, wrongNode);
                    break;
                }
                pre = cur;
                cur = cur.right;
            }
        }
        //如果没有节点大于wrongNode，与最后一个节点交换值
        if (wrongNode != null && wrongNode.val > pre.val) {
            swap(pre, wrongNode);
        }
    }

    private void swap(TreeNode pre, TreeNode wrongNode) {
        int tmp = pre.val;
        pre.val = wrongNode.val;
        wrongNode.val = tmp;
    }

}
