package 面试.算法.实习.字节.二叉树的遍历.后序遍历;

import 面试.算法.TreeNode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Stack;

public class Solution2 {
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        if (root ==null){
            return res;
        }
        Stack<TreeNode> stack = new Stack<>();
        stack.add(root);
        while(!stack.isEmpty()){
            TreeNode pop = stack.pop();
            res.add(pop.val);
            if (pop.left!=null){
                stack.add(pop.left);
            }
            if (pop.right!=null){
                stack.add(pop.right);
            }
        }
        Collections.reverse(res);
        return res;
    }
}
