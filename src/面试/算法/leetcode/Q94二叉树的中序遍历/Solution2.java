package 面试.算法.leetcode.Q94二叉树的中序遍历;

import netscape.security.UserTarget;
import 面试.算法.TreeNode;

import java.util.*;

public class Solution2 {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        if (root == null){
            return res;
        }
        Stack<TreeNode> queue = new Stack<>();
        TreeNode cur = root;
        while(!queue.isEmpty()||cur!=null){
            while (cur!=null){
                queue.add(cur);
                cur = cur.left;
            }
            cur = queue.pop();
            res.add(cur.val);
            cur = cur.right;
        }
        return res;
    }
}
