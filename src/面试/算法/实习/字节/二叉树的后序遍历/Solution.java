package 面试.算法.实习.字节.二叉树的后序遍历;

import 面试.算法.TreeNode;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class Solution {
    public List<Integer> postorderTraversal(TreeNode root) {
        Stack<TreeNode> stack = new Stack<>();
        LinkedList<Integer> output= new LinkedList<>();
        if (root == null){
            return output;
        }
        stack.add(root);
        while(!stack.isEmpty()){
            TreeNode pop = stack.pop();
            output.add(pop.val);
            if (pop.left!=null){
                    stack.add(pop.left);
            }
            if (pop.right!=null){
                stack.add(pop.right);
            }
        }
        Collections.reverse(output);
        return output;
    }
}
