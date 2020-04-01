package 面试.算法.面试算法.股票买卖;

import java.util.HashMap;

public class Solution {
    public  static  int maxProfit(int[] prices) {
        int n = prices.length;
        if(n<=1){
            return 0;
        }
        int[][] f= new int[n][n];
        f[0][0]=0;
        int result= 0;
        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n; j++) {
                if(prices[j]>prices[i]){
                    f[i][j]=prices[j]-prices[i];
                    result=Math.max(prices[j]-prices[i],result);
                }
            }
        }
        return result;
    }

    public  static  int maxProfit2(int[] prices) {
        int max = 0;
        int low= Integer.MAX_VALUE;
        for (int price : prices) {
            if(price < low){
                low = price;
            }
            max= Math.max(max,price-low);
        }
        return max;
    }
    public static void main(String[] args) {
        int[] f= {1,2};
        System.out.println(maxProfit2(f));
    }
}
