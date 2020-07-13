package 面试.算法.leetcode.Q257二叉树的所有路径;

import java.util.ArrayList;
import java.util.List;

public class Solution3 {
    List<String> res = new ArrayList<>();
    public List<String> binaryTreePaths(TreeNode root) {
        if (root == null){
            return  res;
        }

        helper(root,"");
        return res;
    }

    private void helper(TreeNode root, String s) {
        if (root.left == null && root.right==null){
             s+=root.val;
             res.add(s);
             return;
        }
        s+= root.val+"->";
        if (root.left!=null){
            helper(root.left,s);
        }
        if (root.right!=null){
            helper(root.right,s);
        }
    }
}
