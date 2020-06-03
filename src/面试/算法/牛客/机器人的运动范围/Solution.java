package 面试.算法.牛客.机器人的运动范围;

import java.util.Arrays;

/**
 * 地上有一个m行和n列的方格。一个机器人从坐标0,0的格子开始移动，
 * 每一次只能向左，右，上，下四个方向移动一格，但是不能进入行坐标和列坐标的数位之和大于k的格子。
 * 例如，当k为18时，机器人能够进入方格（35,37），因为3+5+3+7 = 18。但是，它不能进入方格（35,38），因为3+5+3+8 = 19。
 * 请问该机器人能够达到多少个格子？
 */
public class Solution {
    int count = 0;
    public int movingCount(int threshold, int rows, int cols)
    {
        boolean[][] f = new boolean[rows][cols];
        for (int i = 0; i < f.length; i++) {
            for (int j = 0; j < f[0].length; j++) {
                f[i][j] =false;
            }
        }
        findPathways(threshold,f,0,rows,0,cols);
        return count;
    }

    private int findPathways(int threshold, boolean[][] f, int i, int rows, int j, int cols) {
        if ((i >= rows || j >= cols || i < 0 || j < 0 || !canGet(threshold, i, j) || f[i][j]) == true){
            return 0;
        }
        f[i][j] =true;
        count++;
        int shang  = findPathways(threshold,f,i-1,rows,j,cols);
        int xia  = findPathways(threshold,f,i+1,rows,j,cols);
        int zuo  = findPathways(threshold,f,i,rows,j-1,cols);
        int you  = findPathways(threshold,f,i,rows,j+1,cols);
        return shang+xia+zuo+you;
    }

    private boolean canGet(int threshold, int i, int j) {
        int res = numSum(i) + numSum(j);
        if (res<=threshold){
            return true;
        }else {
            return false;
        }
    }


    private int numSum(int i) {
        int sum = 0;
        do{
            sum += i%10;
        }while((i = i/10) > 0);
        return sum;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.movingCount(5, 10, 10));
    }
}
