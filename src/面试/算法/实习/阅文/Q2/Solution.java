package 面试.算法.实习.阅文.Q2;

public class Solution {
    public static int getBinary(int code){
        int count =0;
        String s = Integer.toBinaryString(code);
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i)=='1'){
                count++;
            }
        }
        return  count;
    }
}
