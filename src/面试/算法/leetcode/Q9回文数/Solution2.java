package 面试.算法.leetcode.Q9回文数;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Solution2 {
    public boolean isPalindrome(int x) {
        if (x< 0){
            return false;
        }
        Stack<Integer> stack = new Stack<>();
        Queue<Integer> queue = new LinkedList<>();
        while(x!=0){
            int tmp = x % 10;
            stack.add(tmp);
            queue.add(tmp);
            x/=10;
        }
        while(!stack.isEmpty()){
            if (stack.peek() == queue.peek()){
                stack.pop();
                queue.poll();
            }else {
                return false;
            }
        }
        return true;
    }
}
