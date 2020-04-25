package 面试.算法.牛客.从上到下打印二叉树;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Solution2 {
    public ArrayList<Integer> PrintFromTopToBottom(TreeNode root) {
        ArrayList<Integer> res = new ArrayList<>();
        if (root == null){
            return res;
        }
        Queue<TreeNode>  queue = new LinkedList<>();
        queue.add(root);
        while(queue.size()!=0){
            TreeNode t = queue.poll();
            res.add(t.val);
            if (t.left!=null){
                queue.add(t.left);
            }
            if (t.right!=null){
                queue.add(t.right);
            }

        }
        return res;
    }
}
