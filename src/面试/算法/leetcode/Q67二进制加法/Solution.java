package 面试.算法.leetcode.Q67二进制加法;

public class Solution {
    public static String addBinary(String a, String b) {
        int i = a.length() - 1;
        int j = b.length() - 1;
        StringBuilder sb= new StringBuilder();
        int carry = 0;
        while(carry==1 || i>=0 ||j >=0){
            if (i>=0 && a.charAt(i--) == '1'){
                carry++;
            }
            if (j>=0 && b.charAt(j--) == '1'){
                carry++;
            }
            sb.append(carry%2);
            carry/=2;
        }
        return sb.reverse().toString();
    }

    public static void main(String[] args) {
    }
}
