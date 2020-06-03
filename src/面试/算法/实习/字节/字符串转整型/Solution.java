package 面试.算法.实习.字节.字符串转整型;

public class Solution {
    public static int myAtoi(String str) {
        long res= 0;
        str= str.trim();
        char c = str.charAt(0);
        int flag= 1;
        if (c=='-' ||c == '+'){
            if (c=='-'){
                flag = -1;
            }
           str= str.substring(1,str.length());
        }
        if (c!='-' && c!='+' && !Character.isDigit(c)){
            return 0;
        }
        char[] chars = str.toCharArray();
        for (char t : chars) {
            if (!Character.isDigit(t)){
                return (int)res*flag;
            }
            res = res*10+(t-'0');
            if (res>Integer.MAX_VALUE){
                 if (flag ==1){
                     return Integer.MAX_VALUE;
                 }else {
                     return Integer.MIN_VALUE;
                 }
            }

        }
        if (c=='-'){
            return (int)res*-1;
        }
        return (int)res;
    }

    public static void main(String[] args) {
        System.out.println(myAtoi("-91283472332"));
    }
}
