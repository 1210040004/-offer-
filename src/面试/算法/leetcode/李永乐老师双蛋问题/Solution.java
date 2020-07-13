package 面试.算法.leetcode.李永乐老师双蛋问题;

import com.sun.org.apache.xpath.internal.operations.String;

import java.util.Arrays;
import java.util.Random;

public class Solution {
    /**
     *
     */
    public int superEggDrop(int K, int N) {
        int[] dp = new int[K + 1];
        int ans = 0;    // 操作的次数
        while (dp[K] < N){
            for (int i = K; i > 0; i--) // 从后往前计算
                dp[i] = dp[i] + dp[i-1] + 1;
            ans++;
        }
        return ans;
    }

    public static int calcu(int K, int N) {
        int[] arr = new int[K];
        Arrays.fill(arr, 1);
        while (arr[K - 1] < N) {
            for (int i = K - 1; i >0 ; i--) {
                arr[i] = arr[i] + arr[i - 1] + 1;
            }
            arr[0]++;
        }
        return arr[0];
    }

    public static void main(String[] args) {

    }
}
