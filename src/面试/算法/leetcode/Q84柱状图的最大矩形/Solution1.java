package 面试.算法.leetcode.Q84柱状图的最大矩形;

import netscape.security.UserTarget;

public class Solution1 {
    public int largestRectangleArea(int[] heights) {
        // 利用单调栈维护
        int n = heights.length;
        int max = 0;
        for (int i = 0; i < n; i++) {
            // 以当前的长度为height的最大矩形
            int width = calcu(heights,i);
            max = Math.max(max,width*heights[i]);
        }
        return max;
    }

    private int calcu(int[] heights, int index) {
        // 往后找第一个小于当前height的index
        int end = heights.length-1;
        int start = 0;
        for (int i = index; i < heights.length; i++) {
            if (heights[i]<heights[index]){
                end = i-1;
                break;
            }
        }
        for (int i = index; i >=0 ; i--) {
            if (heights[i]<heights[index]){
                start = i+1;
                break;
            }
        }
        return end-start+1;
    }

    public static void main(String[] args) {
        Solution1 s = new Solution1();
        int[] arr= {2,1,5,6,2,3};
        s.largestRectangleArea(arr);
    }
}
