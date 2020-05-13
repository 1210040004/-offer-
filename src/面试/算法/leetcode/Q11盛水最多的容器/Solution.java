package 面试.算法.leetcode.Q11盛水最多的容器;

public class Solution {
    public int maxArea(int[] height) {
        int n = height.length;
        int max = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n; j++) {
                int container = (j-i)*Math.min(height[j],height[i]);
                max = Math.max(container,max);
            }
        }
        return max;
    }
    public int maxArea2(int[] height) {
        int n = height.length;
        if(n<=1){
            throw new RuntimeException("有问题");
        }
        int i = 0;
        int j =height.length;
        int max = 0;
        while(i<j){
            int container = (j-i)*Math.min(height[j],height[i]);
            max = Math.max(container,max);
            if(height[j]<height[i]){
                j--;
            }else {
                i++;
            }
        }
        return max;
    }
}
