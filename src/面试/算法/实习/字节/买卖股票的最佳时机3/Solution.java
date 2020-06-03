package 面试.算法.实习.字节.买卖股票的最佳时机3;

public class Solution {
    public int maxProfit(int[] prices) {
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
