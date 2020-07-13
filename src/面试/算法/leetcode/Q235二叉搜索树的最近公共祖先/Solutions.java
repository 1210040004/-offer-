package 面试.算法.leetcode.Q235二叉搜索树的最近公共祖先;

import 面试.算法.TreeNode;

public class Solutions {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        //要求不得将其他的节点存储在另外的数据结构中

        /**
         * 最近公共祖先的定义： 设节点 rootroot 为节点 p,qp,q 的某公共祖先，若其左子节点 root.leftroot.left 和右子节点 root.rightroot.right 都不是 p,qp,q 的公共祖先，则称 rootroot 是 “最近的公共祖先” 。
         *
         * 根据以上定义，若 rootroot 是 p,qp,q 的 最近公共祖先 ，则只可能为以下情况之一：
         *
         * pp 和 qq 在 rootroot 的子树中，且分列 rootroot 的 异侧（即分别在左、右子树中）；
         * p = rootp=root，且 qq 在 rootroot 的左或右子树中；
         * q = rootq=root，且 pp 在 rootroot 的左或右子树中；
         *
         */

        /**
         * 若 root.val < p.valroot.val<p.val ，则 pp 在 rootroot 右子树 中；
         * 若 root.val > p.valroot.val>p.val ，则 pp 在 rootroot 左子树 中；
         * 若 root.val = p.valroot.val=p.val ，则 pp 和 rootroot 指向 同一节点 。
         *
         * 循环搜索： 当节点 root root 为空时跳出；
         * 当 p, qp,q 都在 rootroot 的 右子树 中，则遍历至 root.rightroot.right ；
         * 否则，当 p, qp,q 都在 rootroot 的 左子树 中，则遍历至 root.leftroot.left ；
         * 否则，说明找到了 最近公共祖先 ，跳出。
         *
         */
        while (root!=null){
            if (root.val<p.val && root.val<q.val){
                //都在右子树中
                root = root.right;
            }
            else if (root.val>p.val && root.val>q.val){
                root = root.left;
            }else {
                break;
            }
        }
        return root;
    }
}
