package 面试.算法.实习.字节.对称二叉树.迭代法;

import 面试.算法.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

public class Solution {
    public boolean isSymmetric(TreeNode root) {
        return check(root,root);
    }

    private boolean check(TreeNode t1, TreeNode t2) {
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(t1);
        queue.offer(t2);
        while(!queue.isEmpty()){
            TreeNode l1 = queue.poll();
            TreeNode l2 = queue.poll();
            if (l1==null && l2==null){
                continue;
            }
            if ((l1==null || l2 ==null)|| l1.val!=l2.val){
                return false;
            }
            queue.offer(l1.left);
            queue.offer(l2.right);
            queue.offer(l1.right);
            queue.offer(l2.left );
        }
        return true;
    }
}
