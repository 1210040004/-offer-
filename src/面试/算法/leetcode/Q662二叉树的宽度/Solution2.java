package 面试.算法.leetcode.Q662二叉树的宽度;

import 面试.算法.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

public class Solution2 {
    public int widthOfBinaryTree(TreeNode root) {
        if(root == null){
            return 0;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        LinkedList<Integer> index = new LinkedList<>();
        queue.add(root);
        index.add(1);
        int res = 1;
        while(!queue.isEmpty()){
            int siz = queue.size();
            for (int i = 0; i < siz; i++) {
                TreeNode poll = queue.poll();
                Integer curIdx = index.removeFirst();
                if (poll.left!=null){
                    queue.add(poll.left);
                    index.add(curIdx*2);
                }
                if (poll.right!=null){
                    queue.add(poll.right);
                    index.add(curIdx*2+1);
                }
            }
            res =Math.max(res,index.peekLast()-index.pollFirst()+1);
        }
        return res;
    }
}
