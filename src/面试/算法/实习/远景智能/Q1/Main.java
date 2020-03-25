package 面试.算法.实习.远景智能.Q1;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        while(sc.hasNext()){
            String s = sc.nextLine();
            String t = sc.nextLine();
            System.out.println(calculateStringDistance(s,t));
        }
    }
    private static int min(int i, int j, int k) {
        return Math.min(i,Math.min(j,k));
    }
    private static String calculateStringDistance(String s, String t){
        int m = s.length();
        int n = t.length();
        // 加约束 只能是小写的字母
        int[][] f= new int[m+1][n+1];
        // 初始话边界，s 或t 长度为0的情况
        for (int i = 0; i <= m; i++) {
            f[i][0]=i;
        }
        for (int i = 0; i <= n; i++) {
            f[0][i]=i;
        }
        char[] cs = s.toCharArray();
        char[] ct = t.toCharArray();
//        for (char c : cs) {
//            if (c<'a' || c >'z'){
//                System.out.println("");
//                return null;
//            }
//        }
//        for (char c : ct) {
//            if (c<'a' || c >'z'){
//                System.out.println("");
//                return null;
//            }
//        }
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                // 如果最后字符串数组的最后一个字符相同，那么f[i][j]=f[i-1][j-1]
                if(cs[i-1]==ct[j-1]){
                    f[i][j]=f[i-1][j-1];
                }else {
                    // 否则说明最后一位是需要编辑的,取三种编辑方式前一步的最下值
                    f[i][j]=1+min(f[i-1][j-1],f[i-1][j],f[i][j-1]);
                }
            }
        }
        return ("1/"+(f[m][n]+1));
    }

}