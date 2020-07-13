package 面试.算法.leetcode.Q98验证二叉搜索树;

import 面试.算法.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class Solution3 {
    List<Integer> list = new ArrayList<>();
    public boolean isValidBST(TreeNode root) {
        if (root == null){
            return true;
        }
            helper(root);
        Integer pre = list.get(0);
        for (int i = 1; i < list.size(); i++) {
            if (list.get(i)<=pre){
                return false;
            }
            pre = list.get(i);
        }
        return true;
    }

    private void helper(TreeNode root) {
        if (root == null){
            return;
        }
        helper(root.left);
        list.add(root.val);
        helper(root.right);
    }
}
