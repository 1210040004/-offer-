package 面试.算法.牛客.第一个只出现一次的字符;

public class Solution {
    public int FirstNotRepeatingChar(String str) {
        int[] cnts = new int[256];
        for (int i = 0; i < str.length(); i++) {
            cnts[str.charAt(i)]++;
        }
        for (int i = 0; i < str.length(); i++) {
            if (cnts[str.charAt(i)]==1){
                return i;
            }
        }
        return -1;
    }
}
