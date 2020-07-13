package 面试.算法.leetcode.Q11cur的容器;

public class Solution2 {
    public int maxArea(int[] height) {
        int i =0 , j = height.length-1;
        int res = 0 ;
        while (i<j){
            int tmp = calcu(height,i,j);
            res = Math.max(res,tmp);
            if (height[j]>height[i]){
                i++;
            }else {
                j--;
            }
        }
        return res;
    }

    private int calcu(int[] height, int i, int j) {
       return (j-i)*Math.min(height[i],height[j]);
    }
}
