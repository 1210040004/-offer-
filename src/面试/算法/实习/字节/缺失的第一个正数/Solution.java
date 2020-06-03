package 面试.算法.实习.字节.缺失的第一个正数;

public class Solution {
    public static int firstMissingPositive(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            while(nums[i]>=1 &&nums[i]<=nums.length && nums[i]!=nums[nums[i]-1]){
                swap(nums,i,nums[i]-1);
            }
        }
        for(int i =0 ;i<nums.length;i++){
            if((i+1)!=nums[i]){
                return i+1;
            }
        }
        return nums.length+1;
    }
    public static  void swap(int[] arr,int i ,int j ){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        int[] arr= {3,4,-1,1};
        int i = firstMissingPositive(arr);
        System.out.println(i);
    }
}
