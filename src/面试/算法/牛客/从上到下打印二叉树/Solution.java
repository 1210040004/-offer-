package 面试.算法.牛客.从上到下打印二叉树;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Solution {
    public ArrayList<Integer> PrintFromTopToBottom(TreeNode root) {
        // 从上到下打印出二叉树的没每个节点。曾节点从左至右打印
        ArrayList<Integer> result= new ArrayList<>();
        if(root == null) return result;
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        queue.offer(root);
        while(!queue.isEmpty()){
            TreeNode temp = queue.poll();
            result.add(temp.val);
            if(temp.left!=null)queue.offer(temp.left);
            if (temp.right!=null) queue.offer(temp.right);
        }
        return result;
    }
}
