package 面试.算法.leetcode.Q91解码方法;

public class Solution {
    public  static int numDecodings(String s) {
        int len = s.length();
        int[] arr = new int[len+1];
        if (s.length()==1 ) {

            return decodeString2(s);
        }
        if (s.length()==2){
            int l =decodeString1(s);
            return  l;
        }
        arr[0]=0;
        arr[1]=decodeString2(s.substring(0,1));
        arr[2]=decodeString1(s.substring(0,2));
        for (int i = 3; i <= len; i++) {
            if (decodeString2(s.substring(s.length()-1))==1){
                arr[i]=arr[i-1];
            }
            if (decodeString1(s.substring(s.length()-2))==2){
                arr[i]++;
            }
        }
        return arr[len];
    }

    private static int decodeString2(String s) {
        if (Integer.valueOf(s)!=0){
            return 1;
        }else {
            return 0;
        }
    }

    private static int decodeString1(String s) {
        if (s.startsWith("0")){
            return 0;
        }
        Integer i = Integer.valueOf(s);
        if (i <=26 && i>=10 && s.charAt(1)!='0'){
            return 2;
        }else if ((i<10 && i>=1) || i>26 || i==20 ||i==10){
            return 1;
        }else {
            return 0;
        }
    }

    public static void main(String[] args) {
        numDecodings("226");
    }
}
