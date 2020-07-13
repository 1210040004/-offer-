package 面试.算法.leetcode.Q1014最佳观光组合;


import java.util.Arrays;

/**
 * 给定正整数数组 A，A[i] 表示第 i 个观光景点的评分，并且两个景点 i 和 j 之间的距离为 j - i。
 *
 * 一对景点（i < j）组成的观光组合的得分为（A[i] + A[j] + i - j）：景点的评分之和减去它们两者之间的距离。
 *
 * 返回一对观光景点能取得的最高分。
 *
 *  
 *
 * 示例：
 *
 * 输入：[8,1,5,2,6]
 * 输出：11
 * 解释：i = 0, j = 2, A[i] + A[j] + i - j = 8 + 5 + 0 - 2 = 11
 *  
 *
 */
public class Solution {
    public static int maxScoreSightseeingPair(int[] A) {
        // 最直观的方法，暴力法,直接提交发现应该不能通过,大量数据的时候爆了，事件复杂度n方
        int len = A.length;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < len; i++) {
            for (int j = i+1; j < len; j++) {
                max = Math.max(A[i]+A[j]+i-j,max);
            }
        }
        return max;
    }
    public static int maxScoreSightseeingPair2(int[] A) {
        // 快速拆分成两个部分 A[i]+i 和 A[j]-j 两个部分
        // 对于J而言我们只需要找出A[i]+i的最大值 ,在[0,j-1]中
        int[] tmp = new int[A.length];
        tmp[0] = A[0]+0;
        int max = Integer.MIN_VALUE;
        for (int j = 1; j < A.length; j++) {
            max =Math.max(max,A[j]-j+tmp[j-1]);
            tmp[j] = Math.max(A[j]+j,tmp[j-1]);
        }
        return max ;
    }


    public static void main(String[] args) {
        int[] arr= {8,1,5,2,6};
        int i = maxScoreSightseeingPair2(arr);
        System.out.println(i);
    }
}
