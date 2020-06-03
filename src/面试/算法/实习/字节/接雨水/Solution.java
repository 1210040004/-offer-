package 面试.算法.实习.字节.接雨水;

public class Solution {
    public int trap(int[] height) {
        if (height==null|| height.length<=2){
            return 0;
        }
        int[] pre = new int[height.length];
        pre[0] = height[0];
        for (int i = 1; i < height.length; i++) {
            pre[i] = Math.max(pre[i-1],height[i]);
        }
        int[] after = new int[height.length];
        after[height.length-1] = height[height.length-1];
        for (int i = height.length-1; i >=1  ; i--) {
            after[i-1] = Math.max(after[i],height[i-1]);
        }
        int res = 0;
        for (int i = 1; i < height.length-1; i++) {
             int level = Math.min(pre[i],after[i]);
             if (level>height[i]){
                 res+=level-height[i];
             }
        }
        return  res;
    }
}
