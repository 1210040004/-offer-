package 面试.算法.leetcode.Q55跳跃游戏;

public class Solution1 {
    public boolean canJump(int[] nums) {
        if (nums == null || nums.length ==0 ){
            return true;
        }
        boolean[] f = new boolean[nums.length];
        f[0] =true;
        for (int i = 1; i < nums.length; i++) {
            for (int j = i-1; j >=0 ; j--) {
                if (f[j] && (j+nums[j])>=i){
                    f[i] = true;
                    continue;
                }
            }
        }
        return f[nums.length-1];
    }
    public boolean canJump2(int[] nums) {
        int n = nums.length;
        int farthest = 0;
        for (int i = 0; i < n; i++) {
            farthest = Math.max(farthest,i+nums[i]);
            if (farthest<=i) return false;
        }
        return farthest>=n-1;
    }
}
