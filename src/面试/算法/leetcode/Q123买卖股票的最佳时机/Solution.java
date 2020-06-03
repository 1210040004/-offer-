package 面试.算法.leetcode.Q123买卖股票的最佳时机;

import java.util.Arrays;

public class Solution {
    // 笨方法
    public int maxProfit(int[] prices) {
        if (prices==null || prices.length==0){
            return  0;
        }
        int res = 0;
        for (int i = 0; i < prices.length; i++) {
            int max = getmaxProfit(Arrays.copyOfRange(prices, 0, i)) + getmaxProfit(Arrays.copyOfRange(prices, i, prices.length));
            res = Math.max(max,res);
        }
        return res;
    }
    public static int getmaxProfit(int[] prices) {
        int profit = 0;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < prices.length; i++) {
            min = Math.min(prices[i],min);
            profit = Math.max(profit,prices[i]-min);
        }
        return profit;
    }

    //
    public int maxProfit2(int[] prices) {
        //两次买卖
            if(prices==null||prices.length<=1){
                return 0;
            }
            int firstBuy = Integer.MIN_VALUE;
            int firstSell = 0;
            int secondBuy = Integer.MIN_VALUE;
            int secondSell = 0;
            for(int i=0;i<prices.length;i++){
                firstBuy = Math.max(firstBuy,-prices[i]);
                firstSell = Math.max(firstSell,prices[i] + firstBuy);
                secondBuy = Math.max(secondBuy,firstSell-prices[i]);
                secondSell = Math.max(secondSell,prices[i]+secondBuy);
            }
            return secondSell;
    }
}
