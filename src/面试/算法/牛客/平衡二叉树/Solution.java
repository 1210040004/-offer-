package 面试.算法.牛客.平衡二叉树;

import 面试.算法.TreeNode;

public class Solution {
    public boolean IsBalanced_Solution(TreeNode root) {
        if (root==null){
            return true;
        }
        //  最直接的暴力解法，但是没有剪枝
        return Math.abs(maxDepth(root.left)-maxDepth(root.right))<=1 && IsBalanced_Solution(root.left) && IsBalanced_Solution(root.right);
    }
    private int maxDepth(TreeNode root){
        if (root==null){
            return 0;
        }
        return 1+Math.max(maxDepth(root.left),maxDepth(root.right));
    }
    // 在判断上层节点的时候，会多次重复遍历下层节点，增加了不必要的开销，如果改成从西网上遍历，如果子树是平衡二叉树，则返回子树的高度
    // 如果不是子树，就停止遍历，这样最多每个节点访问一次


    private boolean isBalanced=true;
    public boolean IsBalanced_Solution2(TreeNode root) {

        getDepth(root);
        return isBalanced;
    }
    public int getDepth(TreeNode root){
        if(root==null)
            return 0;
        int left=getDepth(root.left);
        int right=getDepth(root.right);

        if(Math.abs(left-right)>1){
            isBalanced=false;
        }
        return right>left ?right+1:left+1;

    }

}
