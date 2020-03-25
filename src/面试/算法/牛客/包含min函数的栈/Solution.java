package 面试.算法.牛客.包含min函数的栈;

import java.util.Stack;

public class Solution {
    Stack<Integer> normalStack = new Stack<>();
    Stack<Integer> minStack = new Stack<>();

    public void push(int node) {
        normalStack.push(node);
        if(minStack.isEmpty()||minStack.peek()>node){
            minStack.push(node);
        }else {
            minStack.push(minStack.peek());
        }
    }

    public void pop() {
        normalStack.pop();
        minStack.pop();
    }

    public int top() {
       return  normalStack.peek();
    }

    public int min() {
       return  minStack.peek();
    }
}
