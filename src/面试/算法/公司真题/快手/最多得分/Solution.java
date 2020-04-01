package 面试.算法.公司真题.快手.最多得分;

import java.util.Scanner;

public class Solution{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int m = sc.nextInt();// m个学生
        int n = sc.nextInt();// n道题目
        String[] s = new String[m];
        int[] val=new int[n];
        for (int i = 0; i < m; i++) {
            s[i]=sc.next();
        }
        for (int i = 0; i < n; i++) {
            val[i]=sc.nextInt();
        }
        int[] f = new int[n];// 每题的最好的得分
        for (int i = 0; i < n; i++) {//
            int countval=Integer.MIN_VALUE; //
            int[] num=calculate(s,i);
            for (int j = 0; j < m; j++) {
                for (int va : num) {
                    countval=Math.max(countval,va*val[i]);
                }
            }
            f[i]=countval;
        }
        int res=0;
        for (int i : f) {
            res+=i;
        }
        System.out.println(res);
    }

    private static int[] calculate(String[] s, int i) {
        int n = s.length;
        int[] res= new int[5];
        for (int k = 0; k < n; k++) {
            if(s[k].charAt(i)=='A'){
                res[0]++;
            }
            if(s[k].charAt(i)=='B'){
                res[1]++;
            }
            if(s[k].charAt(i)=='C'){
                res[2]++;
            }
            if(s[k].charAt(i)=='D'){
                res[3]++;
            }
            if(s[k].charAt(i)=='E'){
                res[4]++;
            }
        }
        return res;
    }
}

