package 面试.算法.leetcode.Q125验证回文串;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Solution2 {
    public static boolean isPalindrome(String s) {
        Stack<Character> stack = new Stack<>();
        Queue<Character> queue = new LinkedList<>();
        s = s.toLowerCase();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (Character.isLetterOrDigit(c)){
                stack.add(c);
                queue.add(c);
            }
        }
        while(!stack.isEmpty()){
            if (!stack.pop().equals(queue.poll())){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        boolean palindrome = isPalindrome("A man, a plan, a canal: Panama");
        System.out.println(palindrome);
    }
}
