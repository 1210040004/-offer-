package 面试.算法.牛客.二叉树中和为某一值的路径;

import java.util.ArrayList;

public class Solution2 {
    ArrayList<ArrayList<Integer>> res = new ArrayList<>();
    public ArrayList<ArrayList<Integer>> FindPath(TreeNode root, int target) {
        ArrayList<Integer> tmp = new ArrayList<>();
        findPath(root,target,tmp);
        return res;
    }

    private void findPath(TreeNode root, int target, ArrayList<Integer> tmp) {
        if (root == null){
            return;
        }
        tmp.add(root.val);
        target-=root.val;
        if (target==0 && root.left==null && root.right==null){
            res.add(new ArrayList<>(tmp));
        }else {
            findPath(root.left,target,tmp);
            findPath(root.right,target,tmp);
        }
        tmp.remove(tmp.size()-1);
    }
}
