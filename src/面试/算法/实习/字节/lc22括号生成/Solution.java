package 面试.算法.实习.字节.lc22括号生成;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Solution {
    List<String> res = new ArrayList<>();
    public  List<String> generateParenthesis2(int n) {
        if (n<=0){
            return res;
        }
        findPathWay("",0,0,n);
        return res;
    }

    private void findPathWay(String s, int left, int right, int n) {
        if (s.length()==2*n){
            res.add(s);
            return ;
        }
        if (left<n){
            findPathWay(s+"(",left+1,right,n);
        }
        if (right<left){
            findPathWay(s+")",left,right+1,n);
        }
    }

    public  static List<String> generateParenthesis(int n) {
        List<String> ans = new ArrayList();
        backtrack(ans, "", 0, 0, n);
        return ans;
    }

    public  static void backtrack(List<String> ans, String cur, int open, int close, int max){
        if (cur.length() == max * 2) {
            ans.add(cur);
            return;
        }

        if (open < max)
            backtrack(ans, cur+"(", open+1, close, max);
        if (close < open)
            backtrack(ans, cur+")", open, close+1, max);
    }
    public static void main(String[] args) {
        List<String> strings = new Solution().generateParenthesis2(3);
        System.out.println(strings);
    }

}
