package 面试.算法.leetcode.Q33搜索旋转数组的排序数组;

public class Solution2 {
    public  static int search(int[] nums, int target) {
        //旋转数组的下标
        // 排序数组和搜索
        // 对于有序数组或者部分有序数组进行搜索，基本上都是使用二分搜索来实现算法复杂度为Ologn的方法
        // 二分搜索的核心在每次可以丢弃一半的数据
      int result = serachHelper(nums,0,nums.length-1,target);
      return result;
    }

    private static int serachHelper(int[] nums, int left, int right, int target) {
        if (right<left){
            return -1;
        }
        int mid = (left+right);
        return 0;
    }

    public static void main(String[] args) {
        int[] arr= {4,5,6,7,0,1,2};
        System.out.println(search(arr, 3));
    }
}
