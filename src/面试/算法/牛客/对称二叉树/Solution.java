package 面试.算法.牛客.对称二叉树;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Solution {
    boolean isSymmetrical(TreeNode root)
    {
        if (root==null){
            return true;
        }
        Stack<TreeNode> s = new Stack<>();
        s.add(root.left);
        s.add(root.right);
        while (!s.isEmpty()){
            TreeNode right = s.pop();
            TreeNode left = s.pop();
            if (right == null && left==null){
                continue;
            }
            else if (right==null || left==null){
                return false;
            }else if (right.val!=left.val){
                return false;
            }
            s.add(right.right);
            s.add(left.left);
            s.add(right.left);
            s.add(left.right);
        }
        return true;
    }
}
