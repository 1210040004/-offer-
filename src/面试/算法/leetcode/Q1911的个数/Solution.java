package 面试.算法.leetcode.Q1911的个数;

public class Solution {
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
        String s = Integer.toBinaryString(n);
        int count0 =0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i)=='1'){
                count0++;
            }
        }
        return count0;
    }
}
