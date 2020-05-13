package 面试.算法.leetcode.Q435无重叠区间;

import java.util.Arrays;
import java.util.Comparator;

public class Solution2 {
    public static int eraseOverlapIntervals(int[][] intervals) {
        if (intervals==null || intervals.length==0){
            return 0;
        }
        Arrays.sort(intervals, new Comparator<int[]>() {
            @Override
            public int compare(int[] a, int[] b) {
                if (a[1]>=b[1]){
                    return 1;
                }else {
                    return -1;
                }
            }
        });
        // 至少有一个区间不相交
        int count = 1;
        // 排序以后第一个区间就是x
        int x_end = intervals[0][1];
        for (int[] interval : intervals) {
            int start = interval[0];
            if (start>=x_end){
                count ++ ;
                x_end = interval[1];
            }
        }
        return intervals.length-count;
    }

    public static void main(String[] args) {
        int[][] arr= {
                {1,2},
                {2,3},
                {3,4},
                {1,3}
        };
        System.out.println(eraseOverlapIntervals(arr));
    }
}
