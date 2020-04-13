package 面试.算法.实习.快手.Q4;

public class Solution {
    public int GetMaxStaffs(char[][] pos) {
        if (pos == null || pos[0].length == 0 || pos.length == 0) {
            return -1;
        }
        int m = pos.length;
        int n = pos[0].length;
        int[][] f = new int[m][n];
        f[0][0] = pos[0][0] == '.' ? 1 : 0;
        for (int i = 1; i < m; i++) {
            if (pos[i][0] == '.' && pos[i - 1][0] != '.') {
                f[i][0] = f[i - 1][0] + 1;
            } else {
                f[i][0] = f[i - 1][0];
            }
        }
        for (int i = 1; i < n; i++){
            if (pos[0][i] == '.' && pos[0][i - 1] != '.') {
                f[0][i] = f[0][i - 1] + 1;
            } else {
                f[0][i] = f[0][i - 1];
            }
        }
     // 初始话
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                if (pos[i-1][j]=='.')
                    return 0;
            }
        }
        return 9;
    }
}
