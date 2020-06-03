package 面试.算法.leetcode.Q415字符串加法;

public class Solution {
    public static String addStrings(String num1, String num2) {
        int i = num1.length() - 1;
        int j = num2.length() - 1;
        int flag = 0;
        StringBuilder sb= new StringBuilder();
        while(flag!=0 || i>=0 || j>=0){
            int res1 = i>= 0? num1.charAt(i--)-'0': 0;
            int res2 = j>=0? num2.charAt(j--)-'0': 0;
            int total = res1+res2+flag;
            sb.append(total%10);
            flag = total/10;
        }
        return sb.reverse().toString();
    }

    public static void main(String[] args) {
        String s = addStrings("9133", "0");
        System.out.println(s);
    }
}
