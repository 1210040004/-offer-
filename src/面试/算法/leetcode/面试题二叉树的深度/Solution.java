package 面试.算法.leetcode.面试题二叉树的深度;

import 面试.算法.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

public class Solution {
    public int maxDepth(TreeNode root) {
        int highth= getPath(root);
         return highth;
    }

    private int getPath(TreeNode root) {
        if (root == null){
            return 0;
        }
        return Math.max(getPath(root.left),getPath(root.right))+1;
    }
    // 非递归方法
    public int maxDepth2(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        if (root == null){
            return 0;
        }
        queue.add(root);
        int res = 0 ;
        while (!queue.isEmpty()){
            int size = queue.size();
            if (size>0){
                res++;
            }
            for (int i = 0; i < size; i++) {
                TreeNode poll = queue.poll();
                if (poll.left!=null){
                    queue.add(poll.left);
                }
                if (poll.right!=null){
                    queue.add(poll.right);
                }
            }
        }
        return res;
    }
}
