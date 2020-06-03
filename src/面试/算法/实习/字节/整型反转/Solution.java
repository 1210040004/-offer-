package 面试.算法.实习.字节.整型反转;


import java.util.Stack;

public class Solution {
//    public static int reverse(int x) {
//        int res = 0;
//        while(x!=0){
//            int i = x % 10;
//            int result = res*10+i;
//            if ((result-i)/10!=res){
//                res = 0;
//                break;
//            }
//            res = result;
//            x = x/10;
//        }
//        return res;
//    }

    public static int reverse(int x) {
        String s = String.valueOf(x);
        char c = s.charAt(0);
        int res = 0;
        if (c=='-' || c=='+'){
            s.substring(1,s.length());

        }
        java.lang.String tmp = s.toString();
        res= Integer.parseInt(tmp);
        if (c=='-'){
            return res*-1;
        }
        return res;
    }
    public static void main(String[] args) {
        System.out.println(reverse(124));
    }
}
