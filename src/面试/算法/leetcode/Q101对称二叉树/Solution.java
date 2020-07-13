package 面试.算法.leetcode.Q101对称二叉树;

import 面试.算法.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

public class Solution {
    public boolean isSymmetric(TreeNode root){
        return checkMirror(root,root);
    }

    private boolean checkMirror(TreeNode t1 , TreeNode t2) {
        if (t1 ==null && t2==null){
            return true;
        }
        if (t1==null ||t2 ==null){
            return false;
        }
        if (t1.val!=t2.val){
            return false;
        }
        return checkMirror(t1.left,t2.right) && checkMirror(t1.right,t2.left);
    }
}
