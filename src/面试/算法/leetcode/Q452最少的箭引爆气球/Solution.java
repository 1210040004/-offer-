package 面试.算法.leetcode.Q452最少的箭引爆气球;

import java.util.Arrays;
import java.util.Comparator;

public class Solution {
    public  static int findMinArrowShots(int[][] points) {
        if (points == null || points.length==0){
            return 0;
        }
        Arrays.sort(points, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[1]-o2[1];
            }
        });
         int end = points[0][1];
         int count = 1;
        for (int[] point : points) {
            int start = point[0];
            if (start>end){
                count ++ ;
                end = point[1];
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[][] arr= {
                {10,16},
                {2,8},
                {1,6},
                {7,12}
        };
        System.out.println(findMinArrowShots(arr));
    }
}
