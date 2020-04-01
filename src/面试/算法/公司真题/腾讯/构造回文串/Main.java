package 面试.算法.公司真题.腾讯.构造回文串;

import java.util.Scanner;

public class Main {
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        while(sc.hasNext()){
            String s= sc.next();
            function(s);
        }
    }

    private static void function(String s) {
        String t =  new StringBuilder(s).reverse().toString();
        int  n=s.length();
        int[][] f= new int[n+1][n+1];
        // 初始化
        for (int i = 0; i < n; i++) {
            f[i][0]=0;
        }
        for (int i = 0; i < n; i++) {
            f[0][i]=0;
        }
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <=  n; j++) {
                if (s.charAt(i-1) == t.charAt(j-1)) {
                    f[i][j] = f[i - 1][j - 1] + 1;
                }
                else {
                    f[i][j]=Math.max(f[i-1][j],f[i][j-1]);
                }
            }
        }
        System.out.println(n-f[n][n]);
    }
}
