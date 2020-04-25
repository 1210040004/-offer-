package 面试.算法.牛客.重建二叉树;

import 面试.算法.牛客.合并两个排序的链表.ListNode;

import java.util.Arrays;

public class Main {
    public TreeNode reConstructBinaryTree(int[] pre, int[] in) {
        if (pre==null  || in==null ||pre.length!=in.length){
            return null;
        }
        TreeNode root = new TreeNode(pre[0]);
        for (int i = 0; i < in.length; i++) {
            if (pre[0]==in[i]){
                root.left = reConstructBinaryTree(Arrays.copyOfRange(pre,1,i+1),Arrays.copyOfRange(in,0,i));
                root.right = reConstructBinaryTree(Arrays.copyOfRange(pre,i+1,pre.length),Arrays.copyOfRange(in,i+1,in.length));
            }
        }
        return root;
    }
}
