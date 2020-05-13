package 面试.算法.leetcode.Q42接雨水;

public class Solution {
    public static int trap(int[] height) {
        //第一种写法： 暴力法
        int n = height.length;
        if (n<=2){
            return 0;
        }
        int result =0;
        for (int i = 1; i < n-1; i++) {
             int minlen2i =Math.min(findpremax(i,height),findlattermax(i,height));
             if (minlen2i>height[i]){
                 result+= minlen2i-height[i];
             }
        }
        return  result;
    }

    private static int findlattermax(int i, int[] height) {
        int max = 0;
        for (int j = i; j <height.length; j++) {
            max = Math.max(height[j],max);
        }
        return max;
    }

    private static int findpremax(int i, int[] height) {
        int max = 0;
        for (int j = 0; j < i; j++) {
            max =Math.max(height[j],max );
        }
        return max;
    }

    public static int trap2(int[] height) {
        //第一种写法： 暴力法
        int n = height.length;
        if (n<=2){
            return 0;
        }
        int result =0;
        // 保存的是以i为下标的最小值
        int[] maxheightleft = new int[n];
        maxheightleft[0]=height[0];
        for (int i = 1; i < height.length; i++) {
            maxheightleft[i] = Math.max(height[i],maxheightleft[i-1]);
        }
        int[] maxheightright = new int[n];
        maxheightright[height.length-1] = height[height.length-1];
        for (int i = height.length-2; i >=0 ; i--) {
            maxheightright[i] =Math.max(height[i],maxheightright[i+1]);
        }
        for (int i = 1; i < n-1; i++) {
             int tmp = Math.min(maxheightleft[i],maxheightright[i]);
             if (tmp>height[i]){
                 result+=tmp-height[i];
             }
        }
        return  result;
    }
    public static void main(String[] args) {
        int[] arr= {0,1,0,2,1,0,1,3,2,1,2,1};
        int trap = trap2(arr);
    }

}
