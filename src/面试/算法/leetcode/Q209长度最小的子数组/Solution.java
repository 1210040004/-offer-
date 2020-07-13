package 面试.算法.leetcode.Q209长度最小的子数组;

public class Solution {
     int res = Integer.MAX_VALUE;
    public  int minSubArrayLen(int s, int[] nums) {
        if (nums== null || nums.length == 0) {
            return 0;
        }
        for (int i = 0; i < nums.length; i++) {
            int tmp = 0;
            for (int j = i; j <nums.length && tmp<s; j++) {
                tmp+=nums[j];
                if (tmp<s){
                    continue;
                }
                if (tmp>=s){
                    res = Math.min(res,j-i+1);
                }
            }
        }
        if (res == Integer.MAX_VALUE){
            return 0;
        }
        return res;
    }

    public static void main(String[] args) {
        int s = 11;
        int[] arr = {1,2,3,4,5};
     //   System.out.println(minSubArrayLen(s, arr));

    }
}
