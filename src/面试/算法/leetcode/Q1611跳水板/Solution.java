package 面试.算法.leetcode.Q1611跳水板;

public class Solution {
    public static int[] divingBoard(int shorter, int longer, int k) {
        int[] f = new int[k+1];
        if (k == 0){
            return  new int[0];
        }
        if (shorter==longer){
            return new int[]{shorter*k};
        }
        int t= 0;
        while(t<=k){
            int temp = shorter*(k-t)+longer*(t);
            f[t] = temp;
            t++;
        }
        return f;
    }

    public static void main(String[] args) {
        int[] x = divingBoard(1, 2, 3);
        for (int i : x) {
            System.out.println(i);
        }
    }
}
