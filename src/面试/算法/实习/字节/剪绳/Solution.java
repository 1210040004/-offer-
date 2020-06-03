package 面试.算法.实习.字节.剪绳;

/**
 * 给你一根长度为 n 的绳子，请把绳子剪成整数长度的 m 段（m、n都是整数，n>1并且m>1），每段绳子的长度记为 k[0],k[1]...k[m-1] 。请问 k[0]*k[1]*...*k[m-1] 可能的最大乘积是多少？例如，当绳子的长度是8时，我们把它剪成长度分别为2、3、3的三段，此时得到的最大乘积是18。
 *
 * 示例 1：
 *
 * 输入: 2
 * 输出: 1
 * 解释: 2 = 1 + 1, 1 × 1 = 1
 * 示例 2:
 *
 * 输入: 10
 * 输出: 36
 * 解释: 10 = 3 + 3 + 4, 3 × 3 × 4 = 36
 *
 */
public class Solution {
    public static int cuttingRope(int n) {
        if (n==1){
            return -1;
        }
        if (n==2){
            return 1;
        }
        if (n==3){
            return 2;
        }
        if (n==4){
            return 4;
        }
        int[] f = new int[n+1];
        f[1] = 1 ;
        f[2] = 1;
        f[3] = 3;
        for (int i = 4; i <= n ; i++) {
            for (int j = 1; j <=i-1 ; j++) {
                f[i] = Math.max(f[i],f[j]*(i-j));
            }
        }
        return f[n];
    }

    public static void main(String[] args) {
        System.out.println(cuttingRope(10));
    }
}
