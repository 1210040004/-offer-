package 面试.算法.leetcode.Dp.九章算法.lintcode.Q669CoinChange;

public class Solution2 {
    public static int coinChange(int[] coins, int amount) {
        // write your code her
        int n =amount+1;
        int m=coins.length;
        int[] f= new int[n];
        f[0]=0;
        for (int i = 1; i <=amount ; i++) {
            f[i]=Integer.MAX_VALUE;
            for (int j = 0; j < m; j++) {
                // 如果当前的槽位i比当前的值大并且，
                if(i>=coins[j] && f[i-coins[j]]!= Integer.MAX_VALUE){
                    f[i]=Math.min(f[i-coins[j]]+1,f[i]);
                }
            }
        }
        if(f[amount]==Integer.MAX_VALUE){
            return -1;
        }
        return f[amount];
    }

    public static void main(String[] args) {
        int[] arr=new int[]{1,2,4};
        int amount =11;
        coinChange(arr,amount);
    }
}
