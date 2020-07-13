package 面试.算法.leetcode.Q56合并区间;

import java.util.Arrays;
import java.util.Comparator;

public class Solutions {
    /**
     * 给出一个区间的集合，请合并所有重叠的区间。
     *
     * 示例 1:
     *
     * 输入: [[1,3],[2,6],[8,10],[15,18]]
     * 输出: [[1,6],[8,10],[15,18]]
     * 解释: 区间 [1,3] 和 [2,6] 重叠, 将它们合并为 [1,6].
     * 示例 2:
     *
     * 输入: [[1,4],[4,5]]
     * 输出: [[1,5]]
     * 解释: 区间 [1,4] 和 [4,5] 可被视为重叠区间。
     *
     * 来源：力扣（LeetCode）
     * 链接：https://leetcode-cn.com/problems/merge-intervals
     * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
     * @param intervals
     * @return
     */
    public int[][] merge(int[][] intervals) {
        /**
         * 对起点和重点分别进行排序，将起点和重点一一对应形成一个数组
         * 扫描起始点， 如果起始点和上一个区间有交集，就进行合并。
         * if cur.start <= last.end;
         * 就需要merge intervals
         * 否则就插入一个新的区间
         *
         */
        if (intervals == null){
            return null;
        }
        Arrays.sort(intervals, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[0]- o2[0];
            }
        });
        int[][] ans  =  new int[intervals.length][2];
        int idx = -1;
        for (int[] interval : intervals) {
            // 如果结果数组是空的，或者当前区间的起始位置 > 结果数组中最后区间的终止位置，
            // 则不合并，直接将当前区间加入结果数组。
            if (idx ==-1 || interval[0] > ans[idx][1]){
                ans[++idx] = interval;
            }else {
                // 反之将当前区间合并至结果数组的最后区间
                ans[idx][1] = Math.max(ans[idx][1],interval[1]);
            }
        }
        return Arrays.copyOf(ans,idx+1);
    }
}
