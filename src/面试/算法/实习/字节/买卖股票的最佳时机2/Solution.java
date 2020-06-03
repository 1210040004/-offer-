package 面试.算法.实习.字节.买卖股票的最佳时机2;

public class Solution {
    public int maxProfit(int[] prices) {
        int result = 0;
        for (int i = 1; i < prices.length; i++) {
            if (prices[i]>prices[i-1]){
                result+=prices[i]-prices[i-1];
            }
        }
        return result;
    }
}
