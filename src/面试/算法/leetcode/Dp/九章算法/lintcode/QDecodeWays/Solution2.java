package 面试.算法.leetcode.Dp.九章算法.lintcode.QDecodeWays;

public class Solution2 {
    public static int numDecodings(String s) {
        // write your code here
        char[] c = s.toCharArray();
        int n = c.length;
        if(n==0){
            return 0;
        }
        int[] f= new int[n+1];
        f[0]=1;
        for (int i = 1; i <= n; i++) {
            f[i]=0;
            int t=c[i-1]-'0';
            if(t>=1 && t<=9){
                f[i]+=f[i-1];
            }
            if(i>=2){
                  int k=((c[i-2]-'0')*10+c[i-1]-'0');
                  if(k>=10 && k<=26){
                      f[i]+=f[i-2];
                  }
            }
        }
        return f[n];
    }

    public static void main(String[] args) {
        numDecodings("12");
    }
}
