package 面试.算法.实习.字节.TopK快排;


import static 面试.算法.实习.字节.缺失的第一个正数.Solution.swap;

public class Solution2 {
    public int findKthLargest(int[] nums, int k) {
        int tarket  = nums.length-k;
        int left= 0,right = nums.length;
        while(true){
            int index = partition(nums,left,right);
            if (tarket== index){
                return index;
            }else if (index<tarket){
                right = index-1;
            }
            else {
                left = index+1;
            }
        }
    }

    private int partition(int[] nums, int left, int right) {
        int pivot = nums[left];
        int j = left;
        for (int i =left+1; i <=right ; i++) {
            if (pivot<nums[i]){
                j++;
                swap(nums,i,j);
            }
        }
        swap(nums,j,left);
        return  j;
    }
}
