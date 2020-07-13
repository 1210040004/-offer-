package 面试.算法.leetcode.Q75颜色分类;

public class Solution2 {
    public void sortColors(int[] nums) {
        int count0 = 0 ;
        int count1 = 0;
        int count2 = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0){
                count0++;
            }else  if (nums[i] ==1){
                count1++;
            }else {
                count2++;
            }
        }
        int idx = 0;
        while(idx<count0){
            nums[idx++] = 0;
        }
        while(idx<count0+count1){
            nums[idx++] = 1;
        }
        while(idx<nums.length){
            nums[idx++] = 2;
        }
    }
}
