package 面试.算法.实习.字节.买卖股票的最佳时机;

public class Solution {
    public int maxProfit(int[] prices) {
        if (prices==null || prices.length<=1){
             return  0;
        }
        int min = Integer.MAX_VALUE;
        int result  = Integer.MIN_VALUE;
        for (int i = 0; i < prices.length; i++) {
            min = Math.min(min,prices[i]);
            result = Math.max(result,prices[i]-min);
        }
        return result;
    }
}
