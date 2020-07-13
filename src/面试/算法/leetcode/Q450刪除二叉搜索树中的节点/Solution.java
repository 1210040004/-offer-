package 面试.算法.leetcode.Q450刪除二叉搜索树中的节点;

import 面试.算法.TreeNode;

public class Solution {
    public TreeNode deleteNode(TreeNode root, int key) {
        if (root == null){
            return null;
        }
        if (root.val ==key){
            // 进行删除
            if (root.left==null) return root.right;
            if (root.right==null) return root.left;
            // 处理左右子树都不为null的情况
            TreeNode minNode = getMin(root.right);
            root.val = minNode.val;
            root.right = deleteNode(root.right,minNode.val);
        }
        else if (root.val>key){
            root.left = deleteNode(root.left,key);
        }else {
            root.right = deleteNode( root.right,key);
        }
        return root;
    }

    private TreeNode getMin(TreeNode right) {
        while(right.left!=null){
            right = right.left;
        }
        return right;
    }
}
