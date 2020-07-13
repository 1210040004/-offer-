package 面试.算法.秋招.字节.加法;

import java.util.Scanner;

/**
 *   36进制由0-9，a-z，共36个字符表示，最小为'0'
 *   '0''9'对应十进制的09，'a''z'对应十进制的10 35
 *   例如：'1b' 换算成10进制等于 1 * 36^1 + 11 * 36^0 = 36 + 11 = 47
 *   要求按照加法规则计算出任意两个36进制正整数的和
 *   如：按照加法规则，计算'1b' + '2x' = '48'
 *
 *   要求：不允许把36进制数字整体转为10进制数字，计算出10进制数字的相加结果再转回为36进制
 */
public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.next();
        String s2 = sc.next();
        System.out.println(add36(s1, s2));
    }
    public static String add36(String a ,String b){
        StringBuilder sb= new StringBuilder();
        int i =a.length()-1;
        int j = b.length()-1;
        int flag = 0;
        while(i>=0 || j>=0){
            int v1 = 0;
            if (i>=0){
                v1 = getTrueValue(a.charAt(i));
                i--;
            }else {
                v1 = 0;
            }
            int v2 =0;
            if (j>=0){
                v2= getTrueValue(b.charAt(j));
                j--;
            }else {
                v2 = 0;
            }
             int tmp = v1+v2+flag;
             flag = tmp/36;
             String c= convertIntNumTo36(tmp);
             sb.append(c);
        }
        if (flag!=0){
            sb.append(flag);
        }
        return sb.reverse().toString();
    }

    private static String convertIntNumTo36(int tmp) {
        tmp = tmp % 36;
        if (tmp<=10){
            return String.valueOf(tmp) ;
        }else {
            int i = tmp + 87;
            char a = (char)i;
            return String.valueOf(a);
        }
    }

    public static int getTrueValue(char a){
        if (Character.isDigit(a)){
            return (int)(a-'0');
        }else {
            return (int)(a-87);
        }
    }
}
