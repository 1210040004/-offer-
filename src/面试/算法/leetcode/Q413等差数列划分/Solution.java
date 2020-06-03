package 面试.算法.leetcode.Q413等差数列划分;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;

/**
 * 如果一个数列至少有三个元素，并且任意两个相邻元素之差相同，则称该数列为等差数列。
 *
 * 例如，以下数列为等差数列:
 *
 * 1, 3, 5, 7, 9
 * 7, 7, 7, 7
 * 3, -1, -5, -9
 * 以下数列不是等差数列。
 *
 * 1, 1, 2, 5, 7
 *  
 *
 * 数组 A 包含 N 个数，且索引从0开始。数组 A 的一个子数组划分为数组 (P, Q)，P 与 Q 是整数且满足 0<=P<Q<N 。
 *
 * 如果满足以下条件，则称子数组(P, Q)为等差数组：
 *
 * 元素 A[P], A[p + 1], ..., A[Q - 1], A[Q] 是等差的。并且 P + 1 < Q 。
 *
 * 函数要返回数组 A 中所有为等差数组的子数组个数。
 *
 */
public class Solution {
    public static int numberOfArithmeticSlices(int[] A) {
       //
        if (A==null || A.length ==0){
            return  0;
        }
        int[] f= new int[A.length-1];
        for (int i = 1; i < A.length; i++) {
            f[i-1] = A[i] - A[i-1];
        }
       // 不能排序, 因为可能 出现 首尾有不同的key 的情况
        ArrayList<Integer> res = new ArrayList<>();
        for (int i = 1; i < f.length; i++) {
            int count = 0;
            while(f[i]==f[i-1]){
                i++;
                count++;
            }
            res.add(count);
        }
        int result = 0;
        for (Integer re : res) {
            if (re>=2){
                result+=(re-1)*(re)/2;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] arr ={1,2,3,4};
        numberOfArithmeticSlices(arr);
    }
}
