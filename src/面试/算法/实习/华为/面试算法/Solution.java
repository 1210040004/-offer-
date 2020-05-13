package 面试.算法.实习.华为.面试算法;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static boolean isBinarySearchTree(TreeNode root){
        if (root==null){
            return true;
        }
        if (root.left!=null && root.right!=null){
            if (root.left.val<root.val && root.right.val>root.val){
                return true;
            }else {
                return false;
            }
        }
        boolean left =true;
        boolean right = true;
        if (root.left!=null){
            left =isBinarySearchTree(root.left);
        }
        if (root.right!=null){
            right= isBinarySearchTree(root.right);
        }
        return left&&right;
    }

    public static void main(String[] args) {
        TreeNode t1 = new TreeNode(1);
        TreeNode t2 = new TreeNode(2);
        TreeNode t3 = new TreeNode(3);
        TreeNode t4 = new TreeNode(4);
        TreeNode t6 = new TreeNode(6);
        t4.left=t2;
        t4.right=t6;
        t2.left=t1;
        t2.right=t3;
        boolean binarySearchTree = isBinarySearchTree(t4);
        isBinarySearchTree1(t4);
        for (int i = 1; i < list.size(); i++) {
            if (list.get(i-1)>=list.get(i)){
                System.out.println(false);
                return;
            }
        }
        System.out.println(true);
    }

    static List<Integer> list = new ArrayList<>();
    public static void isBinarySearchTree1(TreeNode root){
        if (root==null){
            return ;
        }
        isBinarySearchTree1(root.left);
        list.add(root.val);
        isBinarySearchTree1(root.right);
    }


}
