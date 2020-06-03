package 面试.算法.实习.字节.是否二叉搜索树;

import 面试.算法.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public boolean isValidBST(TreeNode root) {
        if (root == null){
            return false;
        }
        getMidPath(root);
        int tem = res.get(0);
        for (int i = 1; i < res.size(); i++) {
            if (res.get(i)<tem){
                return false;
            }
            tem = res.get(i);
        }
        return true;
    }
    List<Integer> res= new ArrayList<>();
    public void getMidPath(TreeNode root){
        if (root==null){
            return;
        }
        getMidPath(root.left);
        res.add(root.val);
        getMidPath(root.right);
    }
}
