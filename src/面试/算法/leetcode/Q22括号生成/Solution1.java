package 面试.算法.leetcode.Q22括号生成;

import java.util.ArrayList;
import java.util.List;

public class Solution1 {
    List<String> res = new ArrayList<>();
    public List<String> generateParenthesis(int n) {
        if (n == 0){
            return res;
        }
        track(n,0,0,"");
        return res;
    }

    private void track(int n, int left, int right, String s) {
        if (right == n){
            res.add(s);
            return;
        }
        if (left<n){
            //加 (
            track(n,left+1,right,s+"(");
        }
        if (right<left){
            track(n,left,right+1,s+")");
        }
    }
}
