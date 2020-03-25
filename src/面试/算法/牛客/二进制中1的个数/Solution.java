package 面试.算法.牛客.二进制中1的个数;

public class Solution {
    public int NumberOf1(int n) {
        String sn = Integer.toBinaryString(n);
        int count = 0;
        for (int i = 0; i < sn.length(); i++) {
            if(sn.charAt(i)=='1'){
                count ++;
            }
        }
        return count;
    }
    // 可能陷入死循环的解法
    public int NumberOf12(int n){
        int count = 0;
        while(n!=0){
            int i = n & 1;
            if(i==1){
                count ++;
            }
           n= n>>1;
        }
        return count;
    }

    // 正解
    private static int NumberOf1_low(int n) {
        int count = 0;
        int flag = 1;
        while (flag != 0) {
            if ((n & flag) != 0) {
                count++;
            }
            // 相当于原来的数不动，让flag去移，
            flag = flag << 1;
        }
        return count;
    }

    public static void main(String[] args) {

    }
}
