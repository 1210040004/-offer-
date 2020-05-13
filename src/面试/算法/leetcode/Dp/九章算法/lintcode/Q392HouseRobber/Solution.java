package 面试.算法.leetcode.Dp.九章算法.lintcode.Q392HouseRobber;

public class Solution {
    public  static long houseRobber(int[] a) {
        // write your code here
        int n = a.length;
        if(n==0){
            return 0;
        }
        int[] f= new int[n];
        if(n==1){
            return a[0];
        }
        if(n==2){
            return Math.max(a[0],a[1]);
        }
        f[0]=a[0];
        f[1]=Math.max(a[0],a[1]);
        for (int i = 2; i <n ; i++) {
            f[i]=Math.max(f[i-1],f[i-2]+a[i]);
        }
        return f[n-1];
    }

    public static void main(String[] args) {
        int[] a=new int[]{3,8,4};
        houseRobber(a);
    }
}
