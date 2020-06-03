package 面试.算法.实习.字节.缺失的第一个正数;

import static 面试.算法.实习.字节.缺失的第一个正数.Solution.swap;

public class Solution2 {
    public static int firstMissingPositive(int[] nums) {
        // 将数组看成hash表， 要找的数一定在【1，N+1】里的整数
        //把 1 这个数放到下标为0的位置上，把2 放在下标为1 的位置上。。。 以此类推
        // 那么第一个不在自己位置上的下标，就是缺失的第一个正数
        int len = nums.length;
        for (int i = 0; i < len; i++) {
            while (nums[i]>=1 && nums[i]<=len && nums[nums[i]-1] != nums[i]){
                swap(nums,i,nums[i]-1);
            }
        }
        for (int i = 0; i < len; i++) {
            if (nums[i]!=i+1){
                return i+1;
            }
        }
        return nums.length;
    }
}
