package 面试.算法.实习.字节.二叉树的深度;

import 面试.算法.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

public class Solution {
    int depth;
    public int maxDepth(TreeNode root) {
        if (root==null){
            return depth;
        }
       depth=  helper(root);
        return depth;
    }

    private int helper(TreeNode root) {
        if (root== null){
            return 0 ;
        }
        return Math.max(helper(root.left),helper(root.right))+1;
    }

    public int maxDepth2(TreeNode root){
        Queue<TreeNode> queue = new LinkedList<>();
        int res=0;
        if (root == null){
            return res;
        }
        queue.add(root);
        while(!queue.isEmpty()){
            int size = queue.size();
            res++;
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
