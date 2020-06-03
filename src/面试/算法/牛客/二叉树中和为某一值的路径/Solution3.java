package 面试.算法.牛客.二叉树中和为某一值的路径;

import java.util.ArrayList;

public class Solution3 {
    ArrayList<ArrayList<Integer>> res= new ArrayList<>();
    public ArrayList<ArrayList<Integer>> FindPath(TreeNode root, int target) {
        ArrayList<Integer> list = new ArrayList<>();
        findWay(root,target,list);
        return res;
    }

    private void findWay(TreeNode root, int target, ArrayList<Integer> list) {
        if (root==null ){
            return;
        }
        list.add(root.val);
        target-=root.val;
        if (target==0 && root.left==null && root.right==null){
            res.add(new ArrayList<>(list));
        } else{
            findWay(root.left,target,list);
            findWay(root.right,target,list);
        }
        list.remove(list.size()-1);
    }
}
