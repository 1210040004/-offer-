package 面试.算法.leetcode.Q20有效的括号;

import netscape.security.UserTarget;

import java.util.Stack;

public class Solution1 {
    public boolean isValid(String s) {
        Stack<Character> left = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c =='('||c=='['||c=='{'){
                left.add(c);
            }else {
                if (!left.isEmpty() && leftof(c) == left.peek()){
                    left.pop();
                }else {
                    return false;
                }
            }
        }
        return true;
    }
    char leftof(char c){
        if ( c == '(') return ')';
        if (c=='{') return '}';
        return ']';
    }
}
