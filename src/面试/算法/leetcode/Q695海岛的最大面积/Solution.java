package 面试.算法.leetcode.Q695海岛的最大面积;

public class Solution {
    public int maxAreaOfIsland(int[][] grid) {
        int res = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == 0){
                    res =Math.max(res,helper(grid,i,j));
                }
            }
        }
        return res;
    }

    // 每次调用的时候默认num为1，进入后判断如果不是岛屿，则直接返回0，就可以避免预防错误的情况。
    // 每次找到岛屿，则直接把找到的岛屿改成0，这是传说中的沉岛思想，就是遇到岛屿就把他和周围的全部沉默。
    // ps：如果能用沉岛思想，那么自然可以用朋友圈思想。有兴趣的朋友可以去尝试。

    private int helper(int[][] grid, int i, int j) {
        if (i<0 || j<0 || i>=grid.length || j>=grid[0].length ||grid[i][j] == 0 ){
            return 0;
        }

        grid[i][j] = 0;
        int num = 1;
        num+=helper(grid,i+1,j);
        num+=helper(grid,i-1,j);
        num+=helper(grid,i,j-1);
        num+=helper(grid,i,j+1);
        return num;
    }

    public static void main(String[] args) throws ClassNotFoundException {
        Class<?> aClass = Class.forName("面试.算法.leetcode.Q695海岛的最大面积.Solution");
        String name = aClass.getName();
        System.out.println(name);
    }
}
