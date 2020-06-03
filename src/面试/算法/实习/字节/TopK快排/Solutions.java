package 面试.算法.实习.字节.TopK快排;

import static 面试.算法.实习.字节.缺失的第一个正数.Solution.swap;

public class Solutions {
    public int findKthLargest(int[] nums, int k) {
        int leng = nums.length;
        int left = 0 ,right = leng-1;
        int target = leng -k;
        while(true){
        int index = partition(nums,left,right);
        if (index==target){
            return nums[target];
        }if (index>target){
            right = index-1;
        }if (index<target){
            left = index+1;
        }
        }
    }

    public int partition(int[] nums, int left, int right) {
        int pivot = nums[left];
        int j = left;
        for (int i = left+1; i <= right; i++) {
            if (nums[i]<pivot){
                j++;
                swap(nums,i,j);
            }
        }
        swap(nums,j,left);
        return j;
    }
    public  int partition2(int[] arr,int left ,int right){
        int pivot = arr[left];
        int j = left;
        for (int i = j+1; i <=right ; i++) {
            if (arr[i]<pivot){
                j++;
                swap(arr,i,j);
            }
        }
        swap(arr,j,left);
        return j;
    }

    public  int findKthLargest3(int[] arr, int k){
        if (k>arr.length){
            throw new RuntimeException("数据有误");
        }
        k = arr.length-k;
        int left =0,right = arr.length-1;
        while(true){
            int index =findPath(arr,left,right);
            if (index==k){
                return arr[index];
            }else  if (index<k){
                left = index+1;
            }else {
                right = index-1;
            }
        }
    }

    private int findPath(int[] arr, int left, int right) {
        int pivot = arr[left];
        int j =left;
        for (int i = left+1; i <=right ; i++) {
            if (arr[i]<pivot){
                j++;
                swap(arr,i,j);
            }
        }
        swap(arr,j,left);
        return j;
    }
}
