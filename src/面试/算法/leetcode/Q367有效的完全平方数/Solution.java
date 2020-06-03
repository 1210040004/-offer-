package 面试.算法.leetcode.Q367有效的完全平方数;

import java.util.HashMap;
import java.util.HashSet;

/**
 * 给定一个正整数 num，编写一个函数，如果 num 是一个完全平方数，则返回 True，否则返回 False。
 *
 * 说明：不要使用任何内置的库函数，如  sqrt。
 *
 * 示例 1：
 *
 * 输入：16
 * 输出：True
 * 示例 2：
 *
 * 输入：14
 * 输出：False
 *
 */
public class Solution {
    public boolean isPerfectSquare(int num) {
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < 50000; i++) {
            set.add(i*i);
        }
        if (set.contains(num)){
            return true;
        }
        return false;
    }
    public boolean isPerfectSquare2(int num) {
        int sub = 1 ;
        while (num>0){
            num-=sub;
            sub+=2;
        }
        return num == 0;
    }
    public boolean isPerfectSquare3(int num) {
        double sqrt = Math.sqrt(num);
        double v = Math.ceil(sqrt) - sqrt;
        return v==0;
    }
}
