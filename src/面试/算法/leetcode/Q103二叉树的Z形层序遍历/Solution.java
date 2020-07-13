package 面试.算法.leetcode.Q103二叉树的Z形层序遍历;

import sun.reflect.generics.tree.Tree;
import 面试.算法.TreeNode;

import java.util.*;

public class Solution {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        if (root == null){
            return res;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        int i = 0 ;
        queue.add(root);
        while(!queue.isEmpty()){
            int size = queue.size();
            List<Integer> tmp = new ArrayList<>();
            for (int j = 0; j < size; j++) {
                TreeNode poll = queue.poll();
                tmp.add(poll.val);
                if (poll.left!=null){
                    queue.add(poll.left);
                }
                if (poll.right!=null){
                    queue.add(poll.right);
                }
            }
            if (i%2==1){
                Collections.reverse(tmp);
            }
            res.add(tmp);
            i++;
        }
        return res;
    }
}
