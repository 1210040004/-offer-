package 面试.算法.leetcode.Q5最长回文串;

public class Solution2 {
    // 最长回文串,回文串会出现两种情况一种是aba 型，另一种是abba型
    // 那就遍历s， 分别向两边展开
    static int length =0;
    static int start=0;
    public  static   String longestPalindrome(String s) {
        int len = s.length();
        if (len<=1){
            return s;
        }
        for (int i = 0; i < len; i++) {
            getPali(s,i,i);
            getPali(s,i,i+1);
        }
        return s.substring(start,start+length);
    }

    private static  void getPali(String s, int i, int j) {
         while(i>=0 && j<=s.length()-1 && s.charAt(i)==s.charAt(j)){
             i--;
             j++;
         }
        int l = j - i-1;
         if (l>length){
             length = l;
             start=i+1;
         }
    }

    public static void main(String[] args) {
        String babad = longestPalindrome("babad");
        System.out.println(babad);
    }
}
