package 面试.算法.牛客.把二叉树打印成多行;

import 面试.算法.TreeNode;

import java.util.*;

public class Solution {
        static ArrayList<ArrayList<Integer>> Print(TreeNode root) {
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        if (root==null){
            return res;
        }
        Queue<TreeNode> s = new LinkedList<>();
        s.add(root);
        while(!s.isEmpty()){
            ArrayList<Integer> tmp = new ArrayList<>();
            int size = s.size();
            for (int i = 0; i < size; i++) {
                TreeNode p = s.poll();
                tmp.add(p.val);
                if (p.left!=null){
                    s.add(p.left);
                }
                if (p.right!=null){
                    s.add(p.right);
                }

            }
            res.add(tmp);
        }
        return res;
    }

    public static void main(String[] args) {
         TreeNode treeNode = new  TreeNode(1);
         TreeNode treeNode2 = new  TreeNode(2);
         TreeNode treeNode3 = new  TreeNode(3);
         TreeNode treeNode4 = new  TreeNode(4);
         TreeNode treeNode5 = new  TreeNode(5);
         TreeNode treeNode6 = new  TreeNode(6);
         TreeNode treeNode7 = new  TreeNode(7);
         TreeNode treeNode8 = new  TreeNode(8);
         TreeNode treeNode9 = new  TreeNode(9);
         TreeNode treeNode10 = new  TreeNode(10);
         TreeNode treeNode11 = new  TreeNode(11);
         TreeNode treeNode12 = new  TreeNode(12);

        treeNode.left = treeNode2;
        treeNode.right = treeNode3;

        treeNode2.left = treeNode4;
        treeNode2.right = treeNode5;

        treeNode3.left = treeNode6;
        treeNode3.right = treeNode7;

        treeNode4.left = treeNode8;
        treeNode5.left = treeNode9;
        treeNode6.left = treeNode10;

        treeNode7.left = treeNode11;
        treeNode7.right = treeNode12;
        ArrayList<ArrayList<Integer>> print = Print(treeNode);
        System.out.println();
    }
}
