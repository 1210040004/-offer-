package 面试.算法.leetcode.Q84柱状图的最大矩形;

public class Solution2 {
    public int largestRectangleArea(int[] heights) {
        //暴力解法的缺陷在于每次都要重新去找，我们可以先做一个memotable，再去找
        // 利用单调栈维护
        int n = heights.length;
        int max = 0;
        // pre[i]记载的是i坐标之前的最小的index的坐标
        int[] pre = new int[n];
        pre[0] = heights[0];
        int[] latter = new int[n];
        latter[0] = heights[0];


        for (int i = 0; i < n; i++) {
            // 以当前的长度为height的最大矩形
            int width = calcu(heights,i);
            max = Math.max(max,width*heights[i]);
        }
        return max;
    }

    private int calcu(int[] heights, int i) {
        return 0;
    }
}
