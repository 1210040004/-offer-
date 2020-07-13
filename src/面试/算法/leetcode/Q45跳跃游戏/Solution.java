package 面试.算法.leetcode.Q45跳跃游戏;

public class Solution {
    // 题目设定，总是可以到达最后一个位置

    /**
     * 初步设想还是用DP的方式来做, 这个方法比较直观，但是lc有一个非常大的case 过不了
     *
     * @param nums
     * @return
     */
    public int jump(int[] nums) {
        int[] minWay = new int[nums.length];
        for (int i = 1; i < nums.length; i++) {
            minWay[i] = Integer.MAX_VALUE;
            for (int j = i - 1; j >= 0; j--) {
                if (j + nums[j] >= i) {
                    minWay[i] = Math.min(minWay[i], minWay[j] + 1);
                }
            }
        }
        return minWay[nums.length - 1];
    }

    /**
     * 贪心的方法
     * @param nums
     * @return
     */
    public int jump2(int[] nums) {
        // 在每次可选择的范围，选取一个跳的更远的位置
        int steps = 0;
        int index = 0;
        int end  =0 ;
        for (int i = 0; i < nums.length-1; i++) {
            index = Math.max(index,nums[i]+i);
            if( i == end){ //遇到边界，就更新边界，并且步数加一
                end = index;
                steps++;
            }
        }
        return steps;
    }
}
