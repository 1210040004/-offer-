package 面试.算法.leetcode.Q98验证二叉搜索树;

import 面试.算法.TreeNode;


/**
 * @author 12100
 */
public class Solution {
    public boolean isValidBST(TreeNode root) {
        return recurse(root,null,null );
    }
    private boolean recurse(TreeNode root, Integer lower, Integer upper) {
        if (root ==null){
            return true;
        }
        int val = root.val;
        if (lower!=null && val<=lower) return false;
        if (upper!=null && val>=upper) return false;
        if (!(recurse(root.right,val,upper))) return false;
        if (!(recurse(root.left,lower,val))) return false;
        return true;
    }

}
