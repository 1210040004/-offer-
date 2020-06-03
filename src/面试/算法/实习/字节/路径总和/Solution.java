package 面试.算法.实习.字节.路径总和;

import 面试.算法.TreeNode;

public class Solution {
    boolean flag=  false;
    public boolean hasPathSum(TreeNode root, int sum) {
        if (root == null){
            return false;
        }
        findPath(root,sum);
        return flag;
    }

    private void findPath(TreeNode root, int target) {
        if (root.left==null && root.right==null ){
            if (target==root.val){
                flag = true;
                return;
            }else {
                return;
            }

        }
        if (!flag){
            int num = target-root.val;
            if (root.left!=null){
                findPath(root.left,num);
            }
            if (root.right!=null){
                findPath(root.right,num);
            }
        }
    }
}
