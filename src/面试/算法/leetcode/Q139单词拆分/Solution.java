package 面试.算法.leetcode.Q139单词拆分;

import java.util.List;

public class Solution {
    public boolean wordBreak(String s, List<String> wordDict) {
        if (wordDict== null || wordDict.size()==0) {
            return s.isEmpty();
        }
        int n = s.length();
        boolean[] f = new boolean[n+1];
        f[0] = true;
        for (int i = 1; i <= n; i++) {
            for (int j = i-1; j >=0; j--) {
                if (f[j] && wordDict.contains(s.substring(j,i))){
                    f[i] = true;
                    break;
                }
            }
        }
        return f[n];
    }
}
