package 面试.算法.实习.字节.路径总和2;

import 面试.算法.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Solution {
    List<List<Integer>> res= new ArrayList<>();
    public List<List<Integer>> pathSum(TreeNode root, int sum) {
         if (root == null){
             return res;
         }
         findTruePath(root,sum,new LinkedList<Integer>());
         return res;
    }

    private void findTruePath(TreeNode root, int target, LinkedList<Integer> tmp) {
        if (root.left==null && root.right==null && target==root.val){
            tmp.add(root.val);
            res.add(new ArrayList<>(tmp));
            return;
        }
        target-=root.val;
        tmp.add(root.val);
        if (root.left!=null){
            findTruePath(root.left,target,tmp);
            tmp.removeLast();
        }
        if (root.right!=null){
            findTruePath(root.right,target,tmp);
            tmp.removeLast();
        }
    }
}
