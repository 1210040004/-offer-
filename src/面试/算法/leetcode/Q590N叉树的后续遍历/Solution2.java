package 面试.算法.leetcode.Q590N叉树的后续遍历;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Stack;

/**
 * 非递归写法
 */
public class Solution2 {
    public List<Integer> postorder(Node root) {
        Stack<Node> stack = new Stack<>();
        List<Integer> res = new ArrayList<>();
        if (root == null){
            return res;
        }
        while(!stack.isEmpty()){
            Node pop = stack.pop();
            res.add(pop.val);
            List<Node> children = pop.children;
            for (Node child : children) {
                stack.add(child);
            }
        }
        Collections.reverse(res);
        return res;
    }
}
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
}
