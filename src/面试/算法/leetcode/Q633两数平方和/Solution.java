package 面试.算法.leetcode.Q633两数平方和;

import java.util.ArrayList;

public class Solution {
    public static boolean judgeSquareSum(int c) {
        double t = Math.sqrt(c);
        int r = (int) t;
        int l = 0;
        while(l<=r){
            int sum  = (int)(Math.pow(l,2)+Math.pow(r,2));
            if (sum== c){
                return true;
            }
            else if (sum<c){
                l++;
            }else {
                r--;
            }
        }
        return false;
    }

    public static boolean judgeSquareSum2(int c) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            list.add(i*i);
        }
        for (Integer integer : list) {
            if (list.contains(c-integer)){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        System.out.println(judgeSquareSum(2));
    }
}
