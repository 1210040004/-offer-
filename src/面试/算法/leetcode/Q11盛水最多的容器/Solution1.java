package 面试.算法.leetcode.Q11盛水最多的容器;

public class Solution1 {
    public static int maxArea(int[] height) {
        // 暴力法
        int max = 0;
        int n = height.length;
        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n; j++) {
                int tmp = (j-i)*Math.min(height[i],height[j]);
                max = Math.max(tmp,max);
            }
        }
        return max;
    }
    public static int maxArea2(int[] height) {
        int max = 0;
        int i = 0;
        int j = height.length-1;
        while(i<j){
            int tmp = (j-i)*Math.min(height[i],height[j]);
            max = Math.max( max,tmp);
            if (height[j]<height[i]){
                j--;
            }else {
                i++;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] arr ={1,8,6,2,5,4,8,3,7};
        System.out.println(maxArea(arr));
    }
}
