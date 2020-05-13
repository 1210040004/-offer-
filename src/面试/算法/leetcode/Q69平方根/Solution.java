package 面试.算法.leetcode.Q69平方根;

public class Solution {
        public static int mySqrt(int x) {
            if (x < 2) return x;

            int left = (int)Math.pow(Math.E, 0.5 * Math.log(x));
            int right = left + 1;
            return (long)right * right > x ? left : right;
        }



    public static void main(String[] args) {
        int i = mySqrt(2147395600);
        System.out.println(i);
    }
}
