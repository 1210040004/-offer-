package 面试.算法.牛客.调整数组顺序使奇数位于偶数前面;

import java.math.BigInteger;

public class Solution {
    public void reOrderArray(int[] array){

    }
    public static BigInteger getfab(int n ){
        BigInteger first = new BigInteger("0");
        BigInteger second = new BigInteger("1");
        BigInteger third = new BigInteger("2");
        for (int i = 0; i < n; i++) {
            third = first.add(second);
            first = second;
            second =third;

        }
        return third;

    }

    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            System.out.println(getfab(i));
        }
    }
}
