package 面试.算法.实习.字节.字符串有字母和数字找出最大值;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Solution {
    static int res = 0;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int maxNum = parse(s);
        System.out.println(maxNum);
    }

    private static int parse(String s) {
        char[] c = s.toCharArray();
        for (int i = 0; i < c.length; i++) {
            if (Character.isLetter(c[i])){
                c[i]=' ';
            }
        }
        final String s2 = String.valueOf(c);
        String[] split = s2.split("\\s+");
        for (String s1 : split) {
            Integer i = Integer.valueOf(s1);
            res = Math.max(res,i);
        }
        return res;
    }
}
