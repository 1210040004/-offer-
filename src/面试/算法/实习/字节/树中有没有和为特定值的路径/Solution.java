package 面试.算法.实习.字节.树中有没有和为特定值的路径;

import 面试.算法.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    List<List<Integer>> res = new ArrayList<>();
    public List<List<Integer>> pathSum(TreeNode root, int sum) {
        List<Integer> tmp = new ArrayList<>();
        findPath(root, sum,tmp );
        return res;
    }

    private void findPath(TreeNode root, int target, List<Integer> tmp) {
        if (root==null){
            return;
        }
        tmp.add(root.val);
        target-= root.val;
        if (root.left==null && root.right==null && target==0){
            res.add(new ArrayList<>(tmp));
        }
       else{
            findPath(root.left,target,tmp);
            findPath(root.right,target,tmp);
        }
        tmp.remove(tmp.size()-1);
    }
}
