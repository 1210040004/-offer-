package 面试.算法.leetcode.Q144二叉树的前序遍历;

import javafx.util.BuilderFactory;
import 面试.算法.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Solution1 {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        if (root == null){
            return res;
        }
        Stack<TreeNode> stack = new Stack<>();
        stack.add(root);
        while(!stack.isEmpty()){
            TreeNode pop = stack.pop();
            res.add(pop.val);
            if (pop.right!=null){
                stack.add(pop.right);
            }
            if (pop.left!=null){
                stack.add(pop.left);
            }
        }
        return res;
    }
}
