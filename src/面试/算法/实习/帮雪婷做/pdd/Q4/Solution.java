package 面试.算法.实习.帮雪婷做.pdd.Q4;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int h =(int)Math.sqrt(2*(n+m));
        while (h*(h+1)>2*(n+m)) {
            h--;
        }
        long[] f= new long[1000000];
        f[1]=1;
        f[0]=1;
        for (int i = 2; i <= h; i++) {
            for (int j=(i+1)*i/2;j>=0;j--)
            {
                if (i*(i+1)/2-j>m) {
                    f[j]=0;
                }
                if (j<=n && j-i>=0) {
                    f[j]=(f[j-i]+f[j])%1000000007;
                }
            }
        }
        long ans = 0;
        for (int i = 0; i <= n; i++) {
            ans =(ans+f[i])%1000000007;
        }
        System.out.println(ans);
    }
}
