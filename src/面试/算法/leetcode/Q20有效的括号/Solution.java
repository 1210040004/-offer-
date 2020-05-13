package 面试.算法.leetcode.Q20有效的括号;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Stack;

public class Solution {


    public boolean isValid(String s) {
         Stack<Character> stack = new Stack<>();
         int len = s.length();
         if (len%2!=0) return false;
        char[] c = s.toCharArray();
        for (int i = 0; i < c.length; i++) {
            if (c[i]=='{' || c[i]=='[' || c[i]=='('){
                stack.push(c[i]);
            }else if(c[i]=='}'||c[i]==')'||c[i]==']'){
                if(c[i]=='}'){
                    if(stack.empty() || stack.peek()!='{') return false;
                }
                if(c[i]==']'){
                    if(stack.empty() || stack.peek()!='[') return false;
                }
                if(c[i]==')'){
                    if(stack.empty() || stack.peek()!='(') return false;
                }
                stack.pop();
            }
            else {
                return false;
            }
        }
        return stack.isEmpty();
    }
}