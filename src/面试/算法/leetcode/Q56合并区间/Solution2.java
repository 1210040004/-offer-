package 面试.算法.leetcode.Q56合并区间;

import java.util.Arrays;

public class Solution2 {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals,((o1, o2) -> o1[0]-o2[0]));
        int[][] ans = new int[intervals.length][2];
        int index = -1;
        for (int[] interval : intervals) {
            // 如果结果数组是空的，或者当前区间的起始位置 > 结果数组中最后区间的终止位置，
            // 则不合并，直接将当前区间加入结果数组。
            if (index==-1||interval[0]>ans[index][1]){
                ans[++index] = interval;
            }else {
                ans[index][1] = Math.max(ans[index][1],interval[1]);
            }
        }
        return Arrays.copyOf(ans,index+1 );
    }
}
