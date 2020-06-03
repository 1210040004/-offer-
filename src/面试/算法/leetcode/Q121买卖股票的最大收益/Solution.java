package 面试.算法.leetcode.Q121买卖股票的最大收益;

public class Solution {
    public static int maxProfit(int[] prices) {
        int profit = 0;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < prices.length; i++) {
            min = Math.min(prices[i],min);
            profit = Math.max(profit,prices[i]-min);
        }
        return profit;
    }

    public static void main(String[] args) {
        int[] arr = {7,1,5,3,6,4};
        System.out.println(maxProfit(arr));
    }
    public int maxProfit2(int[] prices) {
        int profit = 0;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < prices.length; i++) {
            min = Math.min(min,prices[i]);
            profit = Math.max(profit,prices[i]-min);
        }
        return profit;
    }
}
