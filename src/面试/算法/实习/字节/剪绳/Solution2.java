package 面试.算法.实习.字节.剪绳;

public class Solution2 {

    public int cuttingRope  (int target) {
        if(target==2){
            return 1;
        }
        if(target==3){
            return 2;
        }
        // 用动态规划的方式去做
        int[] dp=new int[target+1];

        dp[1]=1;
        dp[2]=2;
        dp[3]=3;// 不分比不分更大

        for (int i = 4; i <dp.length; i++) {
            for (int j = 1; j <= i/2 ; j++) {
                dp[i]=Math.max(dp[i],dp[i-j]*dp[j]);
            }
        }
        return dp[target];
    }
}
