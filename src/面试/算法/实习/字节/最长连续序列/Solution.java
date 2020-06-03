package 面试.算法.实习.字节.最长连续序列;

import java.util.Arrays;
import java.util.HashSet;

public class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }
        int res = 0;
        for (Integer num : set) {
            if (!set.contains(num-1)){
                int currentNum = num;
                int currentStreak = 1;
                while(set.contains(currentNum+1)){
                    currentNum++;
                    currentStreak++;
                }
                res = Math.max(res,currentStreak);
            }
        }
        return res;
    }
}
