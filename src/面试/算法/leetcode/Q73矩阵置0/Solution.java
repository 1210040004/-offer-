package 面试.算法.leetcode.Q73矩阵置0;

import java.util.HashSet;

public class Solution {
    public  static void setZeroes(int[][] matrix) {
        if (matrix==null || matrix.length==0 || matrix[0].length==0){
            return;
        }
        HashSet<Integer> seth = new HashSet<>();
        HashSet<Integer> setl = new HashSet<>();
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j]==0){
                    seth.add(i);
                    setl.add(j);
                }
            }
        }
        for (Integer hang : seth) {
            for (int i = 0; i < matrix[0].length; i++) {
                matrix[hang][i]=0;
            }
        }
        for (Integer lie : setl) {
            for (int i = 0; i < matrix.length; i++) {
                matrix[i][lie]=0;
            }
        }
    }

    public static void main(String[] args) {
        int[][] arr ={{0,1,2,0},{3,4,5,2},{1,3,1,5}};
        setZeroes(arr);
    }
}
