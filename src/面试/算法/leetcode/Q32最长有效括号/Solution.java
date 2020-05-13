package 面试.算法.leetcode.Q32最长有效括号;

import java.util.Stack;

public class Solution {
    public static int longestValidParentheses(String s) {
        if(s.length()<=1){
            return 0;
        }
        char[] c = s.toCharArray();
        int maxSize = 0;
        Stack<Character> stack= new Stack<>();
        for (int i = 0; i < c.length; i++) {
            if(!stack.isEmpty()){
                if (c[i]=='('){
                    stack.push(c[i]);
                }
                if(c[i]==')'){
                    stack.pop();
                    maxSize++;
                }
            }
            else {
                if(c[i]=='('){
                    stack.push(c[i]);
                }
            }

        }
        return maxSize*2;
    }

    public static void main(String[] args) {
        System.out.println(longestValidParentheses2(")()())"));
    }
    public static int longestValidParentheses2(String s) {
        int maxans = 0;
        Stack<Integer> stack = new Stack<>();
        stack.push(-1);
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                stack.push(i);
            } else {
                stack.pop();
                if (stack.empty()) {
                    stack.push(i);
                } else {
                    maxans = Math.max(maxans, i - stack.peek());
                }
            }
        }
        return maxans;
    }

}
