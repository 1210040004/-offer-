package 面试.算法.leetcode.Q105前序中序构造二叉树;

import 面试.算法.TreeNode;

import java.util.Arrays;

public class Solution {
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        if (preorder == null || inorder ==null || preorder.length!=inorder.length ||preorder.length == 0 || inorder.length == 0){
            return null;
        }
        TreeNode root = new TreeNode(preorder[0]);
        for (int i = 0; i < inorder.length; i++) {
            if (inorder[i] ==preorder[0]){
                root.left = buildTree(Arrays.copyOfRange(preorder,1,i+1),Arrays.copyOfRange(inorder,0,i));
                root.right = buildTree(Arrays.copyOfRange(preorder,i+1,preorder.length),Arrays.copyOfRange(inorder,i+1,inorder.length));
            }
        }
        return  root;
    }
}
