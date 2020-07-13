package 面试.算法.leetcode.Q215数组中第k大的数;

public class Solution1 {
    public int findKthLargest(int[] nums, int k) {
        k = nums.length-k;
        int i = 0;
        int j = nums.length-1;
        while(i<j){
            int index = partition(nums,i,j);
            if (index == k){
                return nums[k];
            }else if (index<k){
                i = index+1;
            }else {
                j = index-1;
            }
        }
        return nums[k];
    }
    public static int partition(int[] arr ,int left ,int right){
        int pivot = arr[left];
        int i = left;
        int j = right;
        while (true){
            while(i<j && arr[j]>=pivot){
                j--;
            }
            while(i<j && arr[i]>=pivot){
                i++;
            }
            if (i>=j){
                break;
            }
            if (i<j){
                swap(arr,i,j);
            }
        }
        swap(arr,left,i);
        return i;
    }

    private static void swap(int[] arr, int i, int j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
    }
}
