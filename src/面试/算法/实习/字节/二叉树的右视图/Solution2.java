package 面试.算法.实习.字节.二叉树的右视图;

import 面试.算法.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Solution2 {
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        if (root ==null){
            return res;
        }
        queue.add(root);
        while(!queue.isEmpty()){
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                TreeNode poll = queue.poll();
                if (i==size-1){
                    res.add(poll.val);
                }
                if (poll.left!=(null)){
                    queue.add(poll.left);
                }
                if (poll.right!=(null)){
                    queue.add(poll.right);
                }
            }
        }
        return res;
    }
}
