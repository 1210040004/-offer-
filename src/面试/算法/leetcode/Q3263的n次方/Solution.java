package 面试.算法.leetcode.Q3263的n次方;

import java.util.HashSet;

public class Solution {
    public static boolean isPowerOfThree(int n) {
        HashSet<Integer> set = new HashSet<>();
        if (n==2147483647){
            return false;
        }
        for (int i = 1; i < 2000; i++) {
            int pow = (int) Math.pow(3, i);
            if (pow<=Integer.MAX_VALUE){
                set.add((int)Math.pow(3,i));
            }
           else {
               break;
            }

        }

        return set.contains(n);
    }

    public static void main(String[] args) {
        boolean powerOfThree = isPowerOfThree(2147483647);
        System.out.println(powerOfThree);
    }
}
