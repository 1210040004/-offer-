package 面试.算法.牛客.二叉树的下一个节点;

public class Solution {
    public TreeLinkNode GetNext(TreeLinkNode pNode)
    {
        if (pNode.right!=null){
            TreeLinkNode node = pNode.right;
            while(node.left!=null){
                node = node.left;
            }
            return node;
        }else {
            while (pNode.next!=null){
                TreeLinkNode parent = pNode.next;
                if (parent.left==pNode){
                    return parent;
                }
                pNode = pNode.next;
            }
        }
        return null;
    }
}
