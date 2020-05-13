package 面试.算法.leetcode.Q50;

public class Solution {
    public  static double myPow(double x, int n) {
        double result=1;
        if (x==0  && n !=0){
            throw new RuntimeException("runtime error");
        }
        if (x==0 && n==0){
            throw new RuntimeException("错误");
        }
        if(n>0){
            while (n-->0){
                result = result*x;
            }
            return result;
        }else {
            x = Math.abs(x);
            while(n-->0){
                result=result*x;
            }
            return 1/result;
        }
    }

    public static void main(String[] args) {
        System.out.println(myPow(2.00000, -2));
    }
}
