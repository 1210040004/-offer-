package 面试.算法.leetcode.正数反转;

/**
 * 给出一个 32 位的有符号整数，你需要将这个整数中每位上的数字进行反转。
 *
 * 示例 1:
 *
 * 输入: 123
 * 输出: 321
 *  示例 2:
 *
 * 输入: -123
 * 输出: -321
 * 示例 3:
 *
 * 输入: 120
 * 输出: 21
 *
 */
public class Solution {
    /**
     * @param x
     * @return
     */
    public int reverse(int x) {
        int res = 0;
        while(x!=0){
            int i = x%10;
            int result = res*10+i;
            if ((result-i)/10!=res){
                res = 0 ;break;
            }
            res = result;
            x = x/10;
        }
        return res;
    }
}
