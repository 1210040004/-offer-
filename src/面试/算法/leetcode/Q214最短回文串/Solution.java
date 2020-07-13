package 面试.算法.leetcode.Q214最短回文串;

// 给定一个字符串S，可以通过在字符串前面添加字符将其转换为回文串，找到并返回可以用这种方式转换的最短回文串

/**
 * 示例 1:
 *
 * 输入: "aacecaaa"
 * 输出: "aaacecaaa"
 * 示例 2:
 *
 * 输入: "abcd"
 * 输出: "dcbabcd"
 */
public class Solution {
    /**

     * @param s
     * @return
     */

    // 比较暴力的方法
    public static String shortestPalindrome(String s) {

        // 找到以s.charAt[0] 开头的最长的回文串，然后将这个回文串的最后逆序拼接到s前面，输出既可
        int len  =s.length();
        // 找到以c[0]开头的最长的回文字串
        StringBuilder sb = new StringBuilder(s);
        StringBuilder reverse = sb.reverse();
        for (int i = 0; i < len; i++) {
            if (s.substring(0,len-i).equals(reverse.substring(i))){
                return reverse.substring(0,i)+s;
            }
        }
        return "";
    }


        public static void main(String[] args) {
        System.out.println(shortestPalindrome("aacecaaa"));
    }
}
