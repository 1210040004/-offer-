package 面试.算法.实习.字节.根到叶子节点数字之和;

import 面试.算法.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Solution {
    List<List<Integer>> res = new ArrayList<>();
    public int sumNumbers(TreeNode root) {
        // 找路径
        if (root== null){
            return 0;
        }
        int num = 0;
        findPath(root,new LinkedList<>());
        for (List<Integer> re : res) {
            StringBuilder sb = new StringBuilder();
            for (Integer i : re) {
                sb.append(i);
            }
            String s = sb.toString();
            Integer tmp = Integer.valueOf(s);
            num+=tmp;
        }
        return num;
    }

    private void findPath(TreeNode root, LinkedList<Integer> temp) {
        if (root.left==null&& root.right==null){
            temp.add(root.val);
            res.add(new ArrayList<>(temp));
            return;
        }
        temp.add(root.val);
        if (root.left!=null){
            findPath(root.left,temp);
            temp.removeLast();
        }
        if (root.right!=null){
            findPath(root.right,temp);
            temp.removeLast();
        }
    }

    public static void main(String[] args) {
        TreeNode t1 = new TreeNode(1);

        TreeNode t2 = new TreeNode(2);

        TreeNode t3 = new TreeNode(3);
        t1.left=t2;
        t1.right=t3;
        System.out.println(new Solution().sumNumbers(t1));
    }
}
