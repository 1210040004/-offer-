package 面试.算法.牛客.把数字翻译成字符串;

/**
 * 给定一个数字，我们按照如下规则把它翻译为字符串：0 翻译成 “a” ，1 翻译成 “b”，……，11 翻译成 “l”，……，25 翻译成 “z”。
 * 一个数字可能有多个翻译。请编程实现一个函数，用来计算一个数字有多少种不同的翻译方法。
 * 示例 1:
 *
 * 输入: 12258
 * 输出: 5
 * 解释: 12258有5种不同的翻译，分别是"bccfi", "bwfi", "bczi", "mcfi"和"mzi"
 */
public class Solution {
    public int translateNum(int num) {
        char[] sc = String.valueOf(num).toCharArray();
        int n = sc.length;
        int[] f = new int[n + 1];
        f[0] = 1;
        for (int i = 1; i <= n; i++) {
            //if (sc[i - 1] >= '0' && sc[i - 1] <= '9') {
            f[i] += f[i - 1];
            //}
            if (i > 1) {
                int a = (sc[i - 2] - '0') * 10 + (sc[i - 1] - '0');
                if (a >= 10 && a <= 25) {
                    f[i] += f[i - 2];
                }
            }
        }
        return f[n];
    }
}
