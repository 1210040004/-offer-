package 面试.算法.实习.字节.跳跃游戏;

public class Solution {
    public boolean canJump(int[] nums) {
        if (nums==null ){
            return false;
        }
        if (nums.length==0){
            return true;
        }
        boolean[] f = new boolean[nums.length];
        if (nums[0]>=1){
            f[0]= true;
        }
        for (int i = 1; i < f.length; i++) {
            for (int j = i-1; j >=0; j--) {
                if (f[j]==true && j+nums[j]>=i){
                    f[i]=true;
                }
            }
        }
        return f[nums.length-1];
    }
}
