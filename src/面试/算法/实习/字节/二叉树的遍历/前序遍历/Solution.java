package 面试.算法.实习.字节.二叉树的遍历.前序遍历;

import sun.reflect.generics.tree.Tree;
import 面试.算法.TreeNode;

import java.util.*;
import java.util.function.DoubleToIntFunction;


public class Solution {
    /**
     * 前序递归
     */
    public void preOrderRecur(TreeNode root) {
        if (root == null){
            return;
        }
        System.out.println(root.val);
        preOrderRecur(root.left);
        preOrderRecur(root.right);
    }
    /**
     * 前序非递归
     */
    public void preOrderRecur2(TreeNode root){
        if (root == null){
            return;
        }

    }
    List<Integer> res= new ArrayList<>();
    public List<Integer> preorderTraversal(TreeNode root) {
        if (root==null){
            return res;
        }
        findPath(root);
        return res;
    }

    private void findPath(TreeNode root) {
        if (root==null){
            return ;
        }
        res.add(root.val);
        findPath(root.left);
        findPath(root.right);
    }
    public List<Integer> preorderTraversal2(TreeNode root) {
        Stack<TreeNode> stack = new Stack<>();
        LinkedList<Integer> output = new LinkedList<>();
        if (root == null) {
            return output;
        }

        stack.add(root);
        while (!stack.isEmpty()) {
            TreeNode node = stack.pop();
            output.add(node.val);
            if (node.right != null) {
                stack.add(node.right);
            }
            if (node.left != null) {
                stack.add(node.left);
            }
        }
        return output;
    }
    public List<Integer> aftorderTraversal(TreeNode root) {
            Stack<TreeNode> stack = new Stack<>();
            LinkedList<Integer> output = new LinkedList<>();
            if (root == null) {
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



    public List<Integer> pre(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        if (root ==null){
            return  res ;
        }
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
        return  res;
    }
}
