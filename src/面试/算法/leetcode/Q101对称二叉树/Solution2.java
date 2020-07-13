package 面试.算法.leetcode.Q101对称二叉树;

import 面试.算法.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

public class Solution2 {
    public boolean isSymmetric(TreeNode root){
        return check(root,root);
    }

    private boolean check(TreeNode t1, TreeNode t2) {
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(t1);
        queue.add(t2);
        while (!queue.isEmpty()){
            TreeNode p1 = queue.poll();
            TreeNode p2 = queue.poll();
            if (p1 == null && p2 == null){
                continue;
            }
            if (p1 ==null || p2 == null){
                return false;
            }
            if (p1.val!=p2.val){
                return  false;
            }
            queue.add(p1.left);
            queue.add(p2.right);
            queue.add(p1.right);
            queue.add(p2.left);
        }
        return true;
    }
}
