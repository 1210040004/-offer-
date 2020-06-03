package 面试.算法.实习.字节.二叉树的遍历.中序遍历;

import 面试.算法.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Solution {
    List<Integer> res= new ArrayList<>();
    public List<Integer> inorderTraversal(TreeNode root) {
        if (root==null){
            return res ;
        }
        findPath(root);
        return res;
    }

    private void findPath(TreeNode root) {
        if (root== null){
            return;
        }
        findPath(root.left);
        res.add(root.val);
        findPath(root.right);
    }
    public List<Integer> inorderTraversal2(TreeNode root) {
        List <Integer> res = new ArrayList <> ();
        Stack <TreeNode> stack = new Stack <> ();
        TreeNode current = root;
        while(current!=null || !stack.isEmpty()) {
            while (current != null) {
                stack.push(current);
                current = current.left;
            }
            current = stack.pop();
            res.add(current.val);
            current = current.right;
        }
        return res;
    }
    public List<Integer> inorderTraversal3(TreeNode root) {
        Stack<TreeNode> stack = new Stack<>();
        List<Integer> res = new ArrayList<>();
        TreeNode cur = root;
        while(cur!=null && !stack.isEmpty()){
            while(cur!=null){
                stack.add(cur);
                cur = cur.left;
            }
            cur = stack.pop();
            res.add(cur.val);
            cur = cur.right;
        }
        return res;
    }

    public List<Integer> inorderTraversal4(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        TreeNode cur = root;
        while(cur!=null || !stack.isEmpty()){
            while(cur!=null){
                stack.add(cur);
                cur = cur.left;
            }
            cur = stack.pop();
            res.add(cur.val);
            cur = cur.right;
        }
        return res;
    }
}
