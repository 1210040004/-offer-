package 面试.算法.实习.百度.Q1;

import java.math.BigDecimal;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        long n = sc.nextLong();
        BigDecimal a = new BigDecimal(n);
        BigDecimal b = new BigDecimal(n-1);
        BigDecimal one = new BigDecimal(1);
        BigDecimal plus = a.multiply(b);
        BigDecimal result = plus.subtract(one);
        System.out.println(result);
    }
}
