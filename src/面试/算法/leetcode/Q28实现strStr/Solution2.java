package 面试.算法.leetcode.Q28实现strStr;

public class Solution2 {
    public static int strStr(String haystack, String needle) {
        int len1 = haystack.length();
        int len2 = needle.length();
        if (len2 == 0){
            return 0;
        }
        if (len2>len1){
            return -1;
        }
        for (int i = 0; i < len1-len2; i++) {
            String substring = haystack.substring(i, i + len2);
            if (substring.equals(needle)){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int i = strStr("a", "a");
        System.out.println(i);
    }
}
