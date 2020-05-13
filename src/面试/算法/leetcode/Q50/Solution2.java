package 面试.算法.leetcode.Q50;

public class Solution2 {
    public static double myPow(double x, int n) {
        //处理一些特殊情况
        double result =1 ;
        if (x==1){
            return 1;
        }
        if (x==0 ){
            throw new RuntimeException("错误");
        }else {
            if (n>0){
                while(n-->0){
                    result*=x;
                }
            }else {
                 n = -n;
                 while(n >0){
                     result*=x;
                     n--;
                 }
                 result = 1/result;            }
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(myPow(2.00000
               , -2147483648));
    }
}
