package 面试.算法.leetcode.Q384打乱数组;

import jdk.nashorn.internal.ir.CallNode;

import java.util.Random;

import static 面试.算法.leetcode.Q75颜色分类.Solution3.swap;

public class Solution {
    static int[] arr = null;
    int[] tmp = null;

    public Solution(int[] nums) {
        arr = new int[nums.length];
        tmp = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            arr[i] = nums[i];
            tmp[i] = nums[i];
        }
    }

    /**
     * Resets the array to its original configuration and return it.
     */
    public int[] reset() {
        return arr;
    }

    /**
     * Returns a random shuffling of the array.
     */
    public int[] shuffle() {
        int n = tmp.length;
        Random random = new Random();
        for (int i = 0; i < n; i++) {
            int rand = random.nextInt(n-i)+i;
            swap(tmp,i,rand);
        }
        return tmp;
    }
    public static  void swap(int[] arr,int i ,int j ){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}