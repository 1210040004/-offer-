package 面试.算法;

import sun.reflect.generics.tree.Tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.Stack;

public class Test {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String s = sc.nextLine();
        String[] t = s.split(" ");

    }
    public ArrayList<Integer> PrintFromTopToBottom(TreeNode root) {
        if(root==null){
            return null;
        }
        ArrayList<Integer> result = new ArrayList<>();
        Stack<TreeNode> list= new Stack<>();
        list.add(root);
        while(!list.isEmpty()){
            TreeNode temp =  list.pop();
            result.add(temp.val);
            if(temp.right!=null){
                list.add(temp.right);
            }
            if(temp.left!=null){
                list.add(temp.left);
            }
        }
        return result;
    }
}
