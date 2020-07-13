package 面试.算法.leetcode.Q515每个树的行里面找最大值;

import 面试.算法.TreeNode;
import 面试.算法.牛客.链表中环的入口.ListNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Solution {
    public List<Integer> largestValues(TreeNode root) {
        //不就是BFS 么
        if (root == null){

        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        List<Integer> res = new ArrayList<>();
        while(!queue.isEmpty()){
            int size = queue.size();
            int max = Integer.MIN_VALUE;
            for (int i = 0; i < size; i++) {
                TreeNode poll = queue.poll();
                if (poll.val>max){
                    max = poll.val;
                }
                if (poll.left!=null){
                    queue.add(poll.left);
                }
                if (poll.right !=null){
                    queue.add(poll.right);
                }
            }
            res.add(max);
        }
        return res;
    }
}
