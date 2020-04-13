package 面试.算法.leetcode.Q257二叉树的所有路径;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Solution {
    public List<String> binaryTreePaths(TreeNode root) {
        LinkedList<String> paths = new LinkedList();
        construct_paths(root, "", paths);
        return paths;
    }

    private void construct_paths(TreeNode root, String path, LinkedList<String> paths) {
        if (root != null){
           path+=root.val;
           if (root.left==null  && root.right==null){
               paths.add(path);
           }else {
               path+="->";
               construct_paths(root.left,path,paths);
               construct_paths(root.right,path,paths);
           }
    }
}
}
