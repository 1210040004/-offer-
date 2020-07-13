package 面试.算法.leetcode.Q958二叉树的完全性检验;

import 面试.算法.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

public class Solution {
    public boolean isCompleteTree(TreeNode root) {
        // 给每个节点编号
        // 一个完全二叉树的编号一定是顺序执行的
        if (root == null){
            return false;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()){
            TreeNode poll = queue.poll();
            if (poll== null){
                while(!queue.isEmpty()){
                    if (queue.poll()!=null){
                        return false;
                    }
                }
                return true;
            }
            queue.add(poll.left);
            queue.add(poll.right);
        }
        return true;
    }
}
