package 面试.算法.牛客.二叉树中和为某一值的路径;

import java.util.ArrayList;

public class Solution {
    private ArrayList<ArrayList<Integer>>  listAll = new ArrayList<>();
    private ArrayList<Integer> list = new ArrayList<Integer>();
    public ArrayList<ArrayList<Integer>> FindPath(TreeNode root, int target) {
        if(root==null) return listAll;
        // 上来先加
        list.add(root.val);
        // 目标-root.val
        target = target-root.val;
        // 如果找到这条路径并且，已经在最二叉树的最底部，那么就会将这条路径添加进listall 中去
        if(target == 0 && root.left == null && root.right == null)
            listAll.add(new ArrayList<Integer>(list));
        // 如果没有到达底层或者target==0 ，就继续往下递归
        FindPath(root.left, target);
        FindPath(root.right, target);
        //递归到叶子节点如果还没有找到路径，就要回退到父节点继续寻找，依次类推
        list.remove(list.size()-1);
        return listAll;
    }
}
