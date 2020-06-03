package 面试.算法.leetcode.Q543二叉树的直径;

import 面试.算法.TreeNode;

/**
 * 给定一棵二叉树，你需要计算它的直径长度。一棵二叉树的直径长度是任意两个结点路径长度中的最大值。这条路径可能穿过也可能不穿过根结点。
 *
 *  
 *
 * 示例 :
 * 给定二叉树
 *
 *           1
 *          / \
 *         2   3
 *        / \
 *       4   5
 * 返回 3, 它的长度是路径 [4,2,1,3] 或者 [5,2,1,3]。
 *
 */
public class Solution {
    public int diameterOfBinaryTree(TreeNode root) {
        if (root==null){
            return 0;
        }
        int left =0,right =0;
        if (root.left!=null){
            left = getMaxDepth(root.left);
        }
        if (root.right!=null){
            right = getMaxDepth(root.right);
        }
        return left+right;
    }
    private int getMaxDepth(TreeNode root){
        if (root == null){
            return 0;
        }
        return  Math.max(getMaxDepth(root.left),getMaxDepth(root.right))+1;
    }



    private int max = 0;

    public int diameterOfBinaryTree2(TreeNode root) {
        depth(root);
        return max;
    }

    private int depth(TreeNode root) {
        if (root == null) return 0;
        int leftDepth = depth(root.left);
        int rightDepth = depth(root.right);
        max = Math.max(max, leftDepth + rightDepth);
        return Math.max(leftDepth, rightDepth) + 1;
    }

    public static void main(String[] args) {
        TreeNode t1 = new TreeNode(1);
        TreeNode t2 = new TreeNode(2);
        TreeNode t3 = new TreeNode(3);
        TreeNode t4 = new TreeNode(4);
        TreeNode t5 = new TreeNode(5);
        t1.left=t2;
        t2.left=t4;
        t2.right=t5;
        t1.right =t3;
        Solution s = new Solution();
        s.diameterOfBinaryTree(t1);

    }
}
