package 面试.算法.公司真题.腾讯.求两个字符串的最长公共子序列;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String s = sc.next();
        String t = sc.next();
        int num = solution(s,t);
        System.out.println(num);
    }

    private static int solution(String s, String t) {
        int m = s.length();
        int n = t.length();
        char[] cs = s.toCharArray();
        char[] ct = t.toCharArray();
        int[][] f= new int[m+1][n+1];
        for (int i = 0; i < m ; i++) {
            f[0][i]=0;
        }
        for (int i = 0; i < n ; i++) {
            f[i][0]=0;
        }
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                if(cs[i-1]==ct[j-1]){
                    f[i][j]=f[i-1][j-1]+1;
                }else {
                    f[i][j]=Math.max(f[i-1][j],f[i][j-1]);
                }
            }
        }
        return f[m][n];
    }
}
