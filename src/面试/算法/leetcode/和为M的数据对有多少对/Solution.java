package 面试.算法.leetcode.和为M的数据对有多少对;

public class Solution {
    public static int count (int[] a , int target){
        // 升序的整型数组m， a，b 是数组中的两个元素，
        // 求a+b = m的数据对有多少
        int i = 0 ;
        int j = a.length-1;
        int count = 0 ;
        while(i<j){
            int sum = a[i]+a[j];
            if (sum==target){
                count++;
                i++;
            }else if (sum<target){
                i++;
            }else {
                j--;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] arr ={2 , 2 , 7, 11, 15};
        int target = 9;
        System.out.println(count(arr, target));
    }
}
