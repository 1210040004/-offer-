package 面试.算法.面试算法.二叉树.遍历算法;

public class Solution {
    private static void preOrderTraveral (TreeNode node){
        if(node==null){
            return ;
        }
        System.out.println(node.data);
        preOrderTraveral(node.leftChild);
        preOrderTraveral(node.rightChild);
    }
}
