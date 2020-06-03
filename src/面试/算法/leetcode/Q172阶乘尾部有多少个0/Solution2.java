package 面试.算法.leetcode.Q172阶乘尾部有多少个0;

import java.math.BigDecimal;
import java.math.BigInteger;

public class Solution2 {
    public  static int trailingZeroes(int n) {
        BigDecimal b = new BigDecimal("1");
        BigDecimal res = new BigDecimal("1");
        BigDecimal high = new BigDecimal(String.valueOf(n));
        while(b.compareTo(high)<=0){
           res= res.multiply(b);
            BigDecimal bigInteger = new BigDecimal("1");
            b = b.add(bigInteger);
        }
        String s = res.toString();
        int count = 0;
        int length = s.length();
        while(s.charAt(length-1)=='0'){
            length--;
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(trailingZeroes(6898));
    }
}
