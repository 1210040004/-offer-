package 面试.算法.牛客.判断二叉树是否对称;

import java.util.Stack;

public class Solution {
    boolean isSymmetrical(TreeNode pRoot)
    {
      if (pRoot==null){
          return true;
      }
      return isSymmetrical(pRoot.left,pRoot.right);
    }


    private boolean isSymmetrical(TreeNode left, TreeNode right) {
        if(left == null && right == null) return true;
        if(left == null || right == null) return false;
        return left.val == right.val //为镜像的条件：左右节点值相等
                && isSymmetrical(left.left, right.right) //2.对称的子树也是镜像
                && isSymmetrical(left.right, right.left);
    }
    boolean isSymmetrical2(TreeNode pRoot)
    {
        if (pRoot==null){
            return true;
        }
        Stack<TreeNode> stack = new Stack<>();
        stack.push(pRoot.left);
        stack.push(pRoot.right);
        while(!stack.isEmpty()){
            TreeNode right =  stack.pop();
            TreeNode left =  stack.pop();
            if(right==null && left == null)continue;
            if(right==null || left ==null) return false;
            if(right.val!=left.val) return false;
            stack.push(left.right);
            stack.push(right.left);
            stack.push(left.left);
            stack.push(right.right);

        }
        return true;
    }



    boolean isSymmetrical3(TreeNode root)
    {
        if(root == null){
            return true;
        }
        return isSymmertical3(root.left ,root.right);
    }
    private boolean isSymmertical3(TreeNode left ,TreeNode right){
        if(left == null && right == null){
            return true;
        }
        if(left == null || right  ==null){
            return false;
        }
        if(left.val != right.val){
            return false;
        }
        return isSymmertical3(left.left,right.right)&&isSymmertical3(left.right,right.left);
    }
}
