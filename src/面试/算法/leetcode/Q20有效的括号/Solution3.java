package 面试.算法.leetcode.Q20有效的括号;

import java.util.Stack;

public class Solution3 {
    public boolean isValid(String s) {
        if (s== null || s.length() == 0){
            return true;
        }
        int len = s.length();
        if (len%2 == 1){
            return false;
        }
        Stack<Character> stack = new Stack<>();
        char[] c = s.toCharArray();
        for (int i = 0; i < c.length; i++) {
            char t = c[i];
            if (t=='(' || t=='{' || t=='['){
                stack.add(t);
            }else if (!stack.isEmpty()){
                if (t==')'){
                    if (stack.peek()=='(') {
                        stack.pop();
                    }else {
                        return false;
                    }
                }
                if (t=='}'){
                    if ( stack.peek()=='{'){
                        stack.pop();
                    }else {
                        return false;
                    }
                }
                if (t==']' ){
                    if (stack.peek()=='['){
                        stack.pop();
                    }else {
                        return false;
                    }
                }

            }
        }
        return  stack.isEmpty();
    }
}
