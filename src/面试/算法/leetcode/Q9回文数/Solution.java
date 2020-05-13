package 面试.算法.leetcode.Q9回文数;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Solution {
    public static boolean isPalindrome(int x) {
        // 判断一个数是否是回文数，转换成字符串很简单。不转换成字符串解决问题，优先想到，用栈来解决问题。
        if (x<0){
            return false;
        }
        if (x==0){
            return true;
        }else {
            Stack<Integer> stack1 = new Stack<>();
            Queue<Integer>  q = new LinkedList<>();
            while(x!=0) {
                stack1.add(x % 10);
                q.add(x % 10);
                x = x / 10;

            }
            while (!stack1.isEmpty()){
                if (stack1.pop()!=q.poll()){
                    return false;
                }
            }
            return  true;
        }
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome(1212));
    }
}
