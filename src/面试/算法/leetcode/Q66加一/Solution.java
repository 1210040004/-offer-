package 面试.算法.leetcode.Q66加一;

import java.util.ArrayList;

public class Solution {
    public static int[] plusOne(int[] digits) {
        int len = digits.length;
        for (int i = len - 1; i >= 0; i--) {
            digits[i]++;
            digits[i] %= 10;
            if (digits[i] != 0) {
                return digits;
            }
        }
        digits = new int[len + 1];
        digits[0] = 1;
        return digits;
    }

    public static void main(String[] args) {
        int[] a={9,9,9};
        int[] ints = plusOne(a);

    }
}