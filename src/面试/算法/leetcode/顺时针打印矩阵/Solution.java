package 面试.算法.leetcode.顺时针打印矩阵;

public class Solution {
    public static int[] spiralOrder(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        int[] f = new int[m*n];

        int i = 0 ,j = 0,temp = 0;
        while (temp<f.length){
            for (;j<m;j++) {
                f[temp++] = matrix[i][j];
            }
            j--;
            i++;
            for (;i<n;i++) {
                f[temp++] = matrix[i][j];
            }
            i--;
            j--;
            for (; j>=0  ; j--) {
                f[temp++] = matrix[i][j];
            }
            j++;
            i--;
            for (; i >=0 ; i--) {
                f[temp++] = matrix[i][j];
            }
            i++;
            m--;
            n--;
        }
        return f;
    }

    public static void main(String[] args) {
        int[][] arr={
                {1,2,3},
                {4,5,6},
                {7,8,9}};
        spiralOrder(arr);
    }
}
