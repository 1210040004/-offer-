package 面试.算法.leetcode.Q67二进制加法;

import java.util.Arrays;

/**
 * @author wcx
 *
 */
public class Solution2 {
    /**
     *    用String builder 然后reverse 就可以了
     */
    public static String addBinary(String a, String b) {
        int m = a.length();
        int n = b.length();
        int i = m-1;
        int j = n-1;
        int len = Math.max(m, n);
        int[] c = new int[len +1];
        int idx = c.length-1;
        int flag = 0;
        while(idx>=1){
            int c1 = 0;
            int c2 = 0;
            if (i>=0){
                c1 = Integer.valueOf(a.charAt(i)-'0');
                i--;
            }
            if (j>=0){
                c2 = Integer.valueOf(b.charAt(j)-'0');
                j--;
            }
            c[idx--]= (c1+c2+flag)%2;
            flag = (c1+c2+flag)/2;
        }
        StringBuilder sb =new StringBuilder();
        if (flag ==1){
            c[0] =1;
            for (int t : c) {
                sb.append(t);
            }
            return sb.toString();
        }
        else {
            for (int k = 1; k < c.length; k++) {
                sb.append(c[k]);
            }
            return sb.toString();
        }
    }

    public static void main(String[] args) {
        System.out.println(addBinary("1010", "1011"));
    }
}
