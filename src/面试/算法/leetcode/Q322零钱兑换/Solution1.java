package 面试.算法.leetcode.Q322零钱兑换;

public class Solution1 {
    int res = Integer.MAX_VALUE;
    public int coinChange(int[] coins,int amount){
        if (coins.length==0){
            return -1;
        }
        findWay(coins,amount,0);
        if (res== Integer.MAX_VALUE){
            return -1;
        }
        return  res;
    }

    private void findWay(int[] coins, int amount, int count) {
        if (amount<0){
            return;
        }
        if (amount == 0){
            res = Math.min(res,count);
        }
        for (int i = 0; i < coins.length; i++) {
            findWay(coins,amount-coins[i],count+1);
        }
    }


    // 动态化搜索
    int[] memo;
    public int coinChange2(int[] coins, int amount) {
        if (coins.length==-1){
            return -1;
        }
        memo = new int[amount];
        return findWay2(coins,amount);
    }

    private int findWay2(int[] coins, int amount) {
        if (amount<0){
            return -1;
        }
        if (amount==0){
            return 0;
        }
        if (memo[amount-1]!=0){
            return memo[amount-1];
        }
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < coins.length; i++) {
            int res = findWay2(coins,amount-coins[i]);
            if (res>=0 && res <min){
                // 加1.是为了得到res结果中的那个步骤中，兑换一个硬币
                min =res+1;
            }
        }
        memo[amount-1]= (min==Integer.MAX_VALUE? -1:min);
        return memo[amount-1];
    }
}
