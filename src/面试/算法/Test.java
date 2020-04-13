package 面试.算法;

import sun.reflect.generics.tree.Tree;

import java.lang.management.ManagementFactory;
import java.lang.management.ThreadInfo;
import java.lang.management.ThreadMXBean;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.Stack;

public class Test {
    public static void main(String[] args) {
        ThreadMXBean threadMXBean = ManagementFactory.getThreadMXBean();
        ThreadInfo[] threadInfos = threadMXBean.dumpAllThreads(false, false);
        for (ThreadInfo threadInfo : threadInfos) {
            System.out.println(threadInfo.getThreadId()+threadInfo.getThreadName());
        }

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
