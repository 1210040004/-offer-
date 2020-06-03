package 面试.算法.实习.字节.二叉树的前序遍历;

import 面试.算法.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;



public class Solution {
    /**
     * 从根节点开始，每次迭代弹出当前栈顶元素，并将其孩子节点压入栈中，先压右孩子再压左孩子。
     * @param root
     * @return
     */
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
