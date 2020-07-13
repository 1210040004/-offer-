package 面试.算法.leetcode.Q190颠倒二进制位;

public class Solution {
    public static int reverseBits(int n) {
        String s = String.valueOf(n);
        int parseInt = Integer.parseInt(new StringBuilder(s).reverse().toString());
        return parseInt;
    }


}
