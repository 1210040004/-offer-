package 面试.算法.leetcode.Q343整数拆分;

import com.sun.xml.internal.fastinfoset.tools.XML_SAX_StAX_FI;

/**
 * 给定一个正整数 n，将其拆分为至少两个正整数的和，并使这些整数的乘积最大化。 返回你可以获得的最大乘积。
 *
 * 示例 1:
 *
 * 输入: 2
 * 输出: 1
 * 解释: 2 = 1 + 1, 1 × 1 = 1。
 * 示例 2:
 *
 * 输入: 10
 * 输出: 36
 * 解释: 10 = 3 + 3 + 4, 3 × 3 × 4 = 36。
 * 说明: 你可以假设 n 不小于 2 且不大于 58。
 *
 */
public class Solution {
    public static int integerBreak(int n) {
       int[] f = new int[n+1];
       f[2]= 1;
        for (int i = 3; i <=n ; i++) {
            for (int j = 2; j < i; j++) {
                f[i] = Math.max(f[i],Math.max(f[j]*(i-j),j*(i-j)));
            }
        }
        return f[n];
    }

    public static void main(String[] args) {
        System.out.println(integerBreak(10));
    }
}
/*
2  1*1 = 1
3  2*1 = 2
4  2*2 =4
5  2*3 = 6
6  3*3 =9;
7  4*3 = 12
8  4 *4 =16;
9  3*3*3 = 27
10
 */