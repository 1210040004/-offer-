package 面试.算法.leetcode.Q1047删除字符串中所有的相邻重复项;


import java.util.HashSet;
import java.util.Stack;

public class Solution {
    public static String removeDuplicates(String S) {
        HashSet<String> set = new HashSet<>();
        StringBuilder sb = new StringBuilder();
        for (char i = 'a'; i <= 'z'; i++) {
            sb.setLength(0);
            sb.append(i);
            sb.append(i);
            set.add(sb.toString());
        }
        int preLen = -1;
        while (preLen != S.length()) {
            preLen = S.length();
            for (String d : set) {
                S = S.replace(d, "");
            }
        }
        return S;
    }

    public static String removeDuplicates2(String s) {
        // 利用一个栈去做
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if (!stack.isEmpty() && stack.peek().equals(s.charAt(i))) {
                stack.pop();
            } else {
                stack.push(s.charAt(i));
            }
        }
        StringBuilder sb = new StringBuilder();
        while(!stack.isEmpty()){
            sb.append(stack.pop());
        }
        return sb.reverse().toString();
    }
}