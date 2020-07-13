package 面试.算法.leetcode.Q58最后一个单词的长度;

public class Solution {
    public int lengthOfLastWord(String s) {
        s = s.trim();
        String[] t = s.split("\\s+");
        if (t.length==0){
            return 0;
        }
        return t[t.length-1].length();
    }

    public int lengthOfLastWord2(String s) {
        int index = s.length()-1;
        int res = 0;
        while (index>=0 && s.charAt(index)==' '){
            index--;
        }
        while(index>=0 && Character.isLetter(s.charAt(index))){
            index--;
            res++;
        }
        return res;
    }
}
