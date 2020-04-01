package 面试.算法.面试算法.二叉树.遍历算法.DFS;

import sun.reflect.generics.tree.Tree;
import 面试.算法.面试算法.二叉树.遍历算法.TreeNode;

import javax.sound.sampled.Line;
import java.util.*;

/**
 * DFS（Depth first Search）  是搜索算法的一种沿着树的深度遍历树的界定啊，尽可能到达树的分支
 * 当节点V的所有的边 都已经被探寻过， 搜索将回溯发现节点V 的那条变的起始节点
 * 这一过程一直进行到已发现从源节点可达的所有节点为止。
 */
public class Solution {
    public  static List<Integer> result = new ArrayList<>();
    public static void main(String[] args) {
        TreeNode treeNode = new TreeNode(1);
        TreeNode treeNode2 = new TreeNode(2);
        TreeNode treeNode3 = new TreeNode(3);
        TreeNode treeNode4 = new TreeNode(4);
        TreeNode treeNode5 = new TreeNode(5);
        TreeNode treeNode6 = new TreeNode(6);
        TreeNode treeNode7 = new TreeNode(7);
        TreeNode treeNode8 = new TreeNode(8);
        TreeNode treeNode9 = new TreeNode(9);
        TreeNode treeNode10 = new TreeNode(10);
        TreeNode treeNode11 = new TreeNode(11);
        TreeNode treeNode12 = new TreeNode(12);

        treeNode.leftChild = treeNode2;
        treeNode.rightChild = treeNode3;

        treeNode2.leftChild= treeNode4;
        treeNode2.rightChild = treeNode5;

        treeNode3.leftChild = treeNode6;
        treeNode3.rightChild = treeNode7;

        treeNode4.leftChild = treeNode8;
        treeNode5.leftChild = treeNode9;
        treeNode6.leftChild = treeNode10;

        treeNode7.leftChild = treeNode11;
        treeNode7.rightChild = treeNode12;

//        List<Integer> result = Solution.BFSByQueue(treeNode);
//        preOrder(treeNode);
        //midOrder(treeNode);
        dfs(treeNode);
        Iterator<Integer> iterator = result.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }



    }
    // DFS
    public static void dfs(TreeNode root){
        if (root==null){
            return;
        }
        Stack<TreeNode> stack = new Stack<>();
        stack.add(root);
        while(!stack.isEmpty()){
            TreeNode tmp = stack.peek();
            System.out.print(stack.pop());
            // 先右再左
            if (tmp.rightChild!=null){
                stack.add(tmp.rightChild);
            }
            if(tmp.rightChild!=null){
                stack.add(tmp.leftChild);
            }
        }
    }
    // BFS 广度优先级遍历
    public static List<Integer> BFSByQueue(TreeNode root){
        if(root==null){
            return null;
        }
        Queue<TreeNode> queue=new LinkedList<>();
        queue.add(root);
        List<Integer> result= new ArrayList<>();
        while (!queue.isEmpty()){
            TreeNode treeNode= queue.poll();
            result.add(treeNode.data);
            if(treeNode.leftChild!=null){
                 queue.add(treeNode.leftChild);
            }
            if(treeNode.rightChild!=null){
                queue.add(treeNode.rightChild);
            }
        }
        return result;
    }


    public  static  List<Integer> BFS(TreeNode root){
        if(root==null){
            return null;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        List<Integer> result =new ArrayList<>();
        while(!queue.isEmpty()){
            TreeNode t = queue.poll();
             result.add(t.data);
             if (t.leftChild!=null){
                 queue.add(t.leftChild);
             }
             if(t.rightChild!=null){
                 queue.add(t.rightChild);
             }
        }
        return result;
    }

    public static List<Integer> DFS(TreeNode root){
        if(root==null){
            return null;
        }
        Stack<TreeNode> stack=new Stack<>();
        stack.add(root);
        List<Integer> list = new ArrayList<>();
        while(!stack.isEmpty()){
            TreeNode treeNode = stack.pop();
            list.add(treeNode.data);
            if(treeNode.rightChild!=null){
                stack.add(treeNode.rightChild);
            }
            if(treeNode.leftChild!=null){
                stack.add(treeNode.leftChild);
            }
        }
        return list;
    }

    public static void preOrder(TreeNode root){
        if(root!=null) {
            result.add(root.data);
            if (root.leftChild != null) {
                preOrder(root.leftChild);
            }
            if (root.rightChild != null) {
                preOrder(root.rightChild);
            }
        }
    }
    public static void midOrder(TreeNode root){
        if(root!=null){
            midOrder(root.leftChild);
            result.add(root.data);
            midOrder(root.rightChild);
        }
    }
    public static void lastOrder(TreeNode root){
        if(root!=null){
            lastOrder(root.leftChild);
            lastOrder(root.rightChild);
            result.add(root.data);
        }
    }
}
