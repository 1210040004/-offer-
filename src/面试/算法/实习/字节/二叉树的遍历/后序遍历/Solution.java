package 面试.算法.实习.字节.二叉树的遍历.后序遍历;

import 面试.算法.TreeNode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Stack;

public class Solution {
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        if(root ==null){
            return res;
        }
        Stack<TreeNode> stack= new Stack<>();
        stack.add(root);
        while(!stack.isEmpty()){
            TreeNode poll= stack.pop();
            res.add(poll.val);
            if(poll.left!=null){
                stack.add(poll.left);
            }
            if(poll.right!=null){
                stack.add(poll.right);
            }
        }
        Collections.reverse(res);
        return res;
    }
    List<Integer> res = new ArrayList<>();
    public List<Integer> postorderTraversal2(TreeNode root) {
        helper(root);
        return res;
    }

    private void helper(TreeNode root) {
        if (root == null){
            return;
        }
        helper(root.left);
        helper(root.right);
        res.add(root.val);
    }
}
