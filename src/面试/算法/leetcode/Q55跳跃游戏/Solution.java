package 面试.算法.leetcode.Q55跳跃游戏;

public class Solution {
    public static boolean canJump(int[] nums) {
        if (nums.length==0 || nums==null){
            return true;
        }
        boolean[] f= new boolean[nums.length];
        f[0]= true;
        for (int i = 1; i < f.length; i++) {
            for (int j = 0; j < i; j++) {
                if (f[j]==true && nums[j]+j>=i){
                    f[i]=true;
                }
            }
        }
        return f[f.length-1];
    }

    public static void main(String[] args) {
        int[] arr= {2,3,1,1,4};
        boolean b = canJump(arr);
    }
}
