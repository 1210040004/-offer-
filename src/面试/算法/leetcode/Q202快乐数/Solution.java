package 面试.算法.leetcode.Q202快乐数;

import java.util.HashSet;

public class Solution {
    public static boolean isHappy(int n) {
        HashSet<Integer> set = new HashSet<>();
        while(n!=1 && !set.contains(n)){
            set.add(n);
            n = getnext(n);
        }
        return n==1;
    }

    private static int getnext(int n) {
        int res = 0;
        while(n!=0){
            int t = n%10;
            n = n/10;
            res+=t*t;
        }
        return res;
    }

    public static void main(String[] args) {
        isHappy(19);
    }
}
