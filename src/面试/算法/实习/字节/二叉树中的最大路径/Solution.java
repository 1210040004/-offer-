package 面试.算法.实习.字节.二叉树中的最大路径;

import sun.reflect.generics.tree.Tree;
import 面试.算法.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

public class Solution {
    int res = Integer.MIN_VALUE;
    public int maxPathSum(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty()){
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                TreeNode poll = queue.poll();
                int left = Math.max(0,getlength(poll.left));
                int right = Math.max(0,getlength(poll.right));
                res = Math.max(res,left+right+poll.val);
                if (poll.left!=null){
                    queue.offer(poll.left);
                }
                if (poll.right!=null){
                    queue.offer(poll.right);
                }
            }
        }
        return res;
    }
    private  int getlength(TreeNode root){
        if (root==null){
            return  0;
        }
        return Math.max(getlength(root.left),getlength(root.right))+root.val;
    }
}
