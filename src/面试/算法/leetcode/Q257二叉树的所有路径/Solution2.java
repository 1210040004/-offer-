package 面试.算法.leetcode.Q257二叉树的所有路径;

import java.util.ArrayList;
import java.util.List;


/**
 * 给定一个二叉树，返回所有从根节点到叶子节点的路径。
 *
 * 说明: 叶子节点是指没有子节点的节点。
 *
 * 示例:
 *
 * 输入:
 *
 *    1
 *  /   \
 * 2     3
 *  \
 *   5
 *
 * 输出: ["1->2->5", "1->3"]
 *
 * 解释: 所有根节点到叶子节点的路径为: 1->2->5, 1->3
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/binary-tree-paths
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class Solution2 {
     List<String> res = new ArrayList<>();
    public  List<String> binaryTreePaths(TreeNode root) {
        if (root==null){
            return  res;
        }

        findTruePath(root,"");
        return res;
    }

    private   void findTruePath(TreeNode root, String tmp) {
        if (root.left==null && root.right==null){
            tmp+=root.val;
            res.add(tmp);
            return;
        }
        tmp+=root.val+"->";
        if (root.left!=null){
            findTruePath(root.left,tmp);
        }
        if (root.right!=null){
            findTruePath(root.right,tmp);
        }
    }

    public static void main(String[] args) {
        TreeNode t1 = new TreeNode(1);
        TreeNode t2 = new TreeNode(2);
        TreeNode t3 = new TreeNode(3);
        TreeNode t4 = new TreeNode(5);
        t1.left=t2;
        t2.right=t4;
        t1.right=t3;
        Solution2 s = new Solution2();
        List<String> strings =s.binaryTreePaths(t1);
        System.out.println(strings);

    }
}
