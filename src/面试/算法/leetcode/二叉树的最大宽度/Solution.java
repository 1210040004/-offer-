package 面试.算法.leetcode.二叉树的最大宽度;

import 面试.算法.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

public class Solution {
    public int widthOfBinaryTree(TreeNode root) {
        if (root == null){
            return 0;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        int res = 0 ;
        int left = 0;
        int right = 0;
        while (!queue.isEmpty()){
            for (int i = 0; i < queue.size(); i++) {
                TreeNode poll = queue.poll();
                if (poll.left!=null){
                    queue.add(poll.left);
                }
                if (poll.right!=null){
                    queue.add(poll.right);
                }
                // 分case chuli
                if (i==0 ){
                    if (poll.left!=null){
                        left = 1;
                    }else {
                        left = 0;
                    }
                }
                if (i ==queue.size()-1){
                    if (poll.right!=null){
                        right =1;
                    }else {
                        right = 0;
                    }
                }
            }
        }
        return res;
    }
}
