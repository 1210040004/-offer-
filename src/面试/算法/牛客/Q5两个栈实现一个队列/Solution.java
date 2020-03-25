package 面试.算法.牛客.Q5两个栈实现一个队列;

import java.util.Stack;

public class Solution {
    // 作为入栈
    Stack<Integer> stack1 = new Stack<Integer>();
    // 作为出栈
    Stack<Integer> stack2 = new Stack<Integer>();

    public void push(int node) {
        stack1.push(node);
    }

    public int pop() {
        if(stack2.isEmpty()){
            while (!stack1.isEmpty()){
                stack2.push(stack1.pop());
            }
        }
        return stack2.pop();
    }
}
