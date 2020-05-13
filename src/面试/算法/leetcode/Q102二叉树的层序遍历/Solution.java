package 面试.算法.leetcode.Q102二叉树的层序遍历;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Solution {
    // 二叉树的层序遍历
        public List<List<Integer>> levelOrder(TreeNode root) {
            List<List<Integer>> levels = new ArrayList<List<Integer>>();
            if (root == null) return levels;

            Queue<TreeNode> queue = new LinkedList<>();

            queue.offer(root);
            List<Integer> list = new ArrayList<>();
            while(!queue.isEmpty()){
                int size = queue.size();
                ArrayList<Integer> tmp = new ArrayList<>();
                for (int i = 0; i < size; i++) {
                    TreeNode  t = queue.remove();
                    tmp.add(t.val);
                    if (t.left!=null){
                        queue.add(t.left);
                    }
                    if (t.right!=null){
                        queue.add(t.right);
                    }
                }
                levels.add(tmp);
            }
            return levels;
        }
}
