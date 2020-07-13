package 面试.算法.leetcode.Q128最长连续序列;

import java.util.HashSet;

public class Solution3 {
    public static int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }
        int res = 0;
        int tmpLen=0;
        for (int num : nums) {
            if (!set.contains(num-1)){
                int current = num;
                tmpLen = 1;
            while (set.contains(current+1)){
                    tmpLen++;
                    current++;
                }
            }
            res =Math.max(tmpLen,res);
        }
        return res;
    }

    public static void main(String[] args) {
        int[] arr ={100,4,200,1,3,2};
        longestConsecutive(arr);
    }
}
