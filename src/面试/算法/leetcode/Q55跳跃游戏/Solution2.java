package 面试.算法.leetcode.Q55跳跃游戏;

/**
 * @author 12100
 */
public class Solution2 {

    public boolean canJump(int[] nums) {
        if (nums== null|| nums.length==0){
            return true;
        }
        boolean[] f = new boolean[nums.length];
        if (nums[0] == 0){
            return true;
        }
        f[0] = true;
        for (int i = 1; i < nums.length; i++) {
            for (int j = i-1; j >=0 ; j--) {
                if (f[j] && (j+nums[j]>=i)){
                    f[i] =true;
                }
            }
        }
        return f[nums.length-1];
    }
    // 贪心的方法做
    // 遍历整个数组，看能到达的最远位置

    public boolean canJump2(int[] nums) {
        int reach = 0 , n = nums.length;
        for (int i = 0; i < n; i++) {
            if (i>reach){
                return false;
            }
            reach = Math.max(i+nums[i],reach);
        }
        return true;
    }


}
