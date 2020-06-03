package 面试.算法.牛客.树的子结构;

public class Solution3 {
    public boolean HasSubtree(TreeNode root1,TreeNode root2) {
        if (root1==null || root2==null){
            return false;
        }
        return  isSubTreeWithRoot(root1,root2) || isSubTreeWithRoot(root1.left,root2) || isSubTreeWithRoot(root1.right,root2);
    }

    private boolean isSubTreeWithRoot(TreeNode root1, TreeNode root2) {
        if (root2==null){
            return true;
        }
        if (root1 == null){
            return false;
        }
        if (root1.val!= root2.val){
            return false;
        }
        return isSubTreeWithRoot(root1.left,root2.left) && isSubTreeWithRoot(root1.right,root2.right);
    }


}
