package 面试.算法.牛客.树的子结构;

public class Solution2 {
    // 一个树是否是另一个树的子树
    public boolean HasSubtree(TreeNode root1,TreeNode root2) {
        boolean res=  false;
        if(root1!=null && root2!=null){
            if(root1.val==root2.val){
                res= doesTree1HasTree2(root1,root2);
            }
            if(!res){
                res= HasSubtree(root1.left,root2);
            }
            if(!res){
                res= HasSubtree(root1.right,root2);
            }
        }

        return res;
    }

    private boolean doesTree1HasTree2(TreeNode node1, TreeNode node2) {
        if(node2==null) return true;
        if(node1==null) return false;
        if(node1.val!=node2.val) return false;
        return doesTree1HasTree2(node1.left,node2.left) && doesTree1HasTree2(node1.right,node2.right);
    }
}
