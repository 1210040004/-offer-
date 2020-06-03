package 面试.算法.leetcode.Q172阶乘尾部有多少个0;

public class Solution {
    public  static int trailingZeroes(int n) {
        return n==0 ? 0:n/5+trailingZeroes(n/5);
    }

    public static void main(String[] args) {
        trailingZeroes(5);
    }
}
