package 面试.算法.牛客.Q7斐波那契数列;

import java.math.BigDecimal;
import java.math.BigInteger;

public class Solution {
    public static int Fibonacci(int n) {
        if(n==0||n==1){
            return n;
        }
        if (n==2){
            return 1;
        }
        int[] res= new int[n+1];
        res[1]=1;
        res[2]=1;
        if(n>=3){
            for (int i = 3; i <=n ; i++) {
                res[i]=res[i-1]+res[i-2];
            }
        }
        return res[n];
    }
    public static BigDecimal bigFibonacci(int n){

        if(n==0||n==1){
            return new BigDecimal(n);
        }
        if (n==2){
            return new BigDecimal(1);
        }
        BigDecimal first =new BigDecimal(1);
        BigDecimal second = new BigDecimal(2);
        BigDecimal third = new BigDecimal(2);
        for (int i = 3; i < n; i++) {
            first = second;
            second = third;
            third = first.add(second);
        }
        return third;
    }
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.println(Fibonacci(i));
            System.out.println(bigFibonacci(i));
        }
    }
}
