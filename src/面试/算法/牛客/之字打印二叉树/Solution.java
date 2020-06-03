package 面试.算法.牛客.之字打印二叉树;

import 面试.算法.TreeNode;

import java.util.*;

public class Solution {
    int level = 0;
    ArrayList<ArrayList<Integer>> res = new ArrayList<>();
    public ArrayList<ArrayList<Integer>> Print(TreeNode pRoot) {
        if (pRoot==null){
            return  res;
        }
        Queue<TreeNode> list = new LinkedList<>();
        list.add(pRoot);
        while(!list.isEmpty()){
            int size = list.size();
            level++;
            ArrayList<Integer> tmp = new ArrayList<>();
            for (int i = 0; i < size; i++) {
                TreeNode poll = list.poll();
                tmp.add(poll.val);
                if (poll.left!=null){
                    list.add(poll.left);
                }
                if (poll.right!=null){
                    list.add(poll.right);
                }
            }
            if (level%2 ==0){
                Collections.reverse(tmp);
            }
            res.add( tmp);
        }
        return  res;
    }
}
