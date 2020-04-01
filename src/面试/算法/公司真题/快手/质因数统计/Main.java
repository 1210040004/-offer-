package 面试.算法.公司真题.快手.质因数统计;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.next();
        String s2 = sc.next();
        int m = s1.length();
        int n= s2.length();

        int[][] f= new int[m+1][n+1];
        for (int i = 1; i <= m; i++) {
               f[i][0]=i;
        }
        for (int i = 1; i <= n; i++) {
               f[0][i]=i;
        }
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                if(s1.charAt(i-1)==s2.charAt(j-1)){
                    f[i][j]=f[i-1][j-1];
                }else {
                    f[i][j]=Math.min(Math.min(f[i][j-1],f[i-1][j]),f[i-1][j-1])+1;
                }
            }
        }
        System.out.println(f[m-1][n-1]);
    }
}
