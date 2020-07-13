package 面试.算法.leetcode.Q84柱状图的最大矩形;

/**
 *
 *
 */
public class Solution {
    /**
     *
     * @param heights
     * @return
     */
    public int largestRectangleArea(int[] heights) {
        int res = 0;
        for (int i = 0; i < heights.length; i++) {
            for (int j = i; j < heights.length; j++) {
                res = Math.max(res,calcu(heights,i,j));
            }
        }
        return res;
    }

    private int calcu(int[] heights, int i, int j) {
        int min = Integer.MAX_VALUE;
        for (int k = i; k <=j ; k++) {
            min = Math.min(min,heights[k]);
        }
        return min*(j-i+1);
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        int[] arr ={2,1,5,6,2,3};
        System.out.println(s.largestRectangleArea(arr));
    }
}
