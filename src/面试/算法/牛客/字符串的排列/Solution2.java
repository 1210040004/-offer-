package 面试.算法.牛客.字符串的排列;
/**
 * 输入一个字符串,按字典序打印出该字符串中字符的所有排列。例如输入字符串abc,则打印出由字符a,b,c所能排列出来的所有字符串abc,acb,bac,bca,cab和cba。
 */

import java.util.ArrayList;

public class Solution2 {
    ArrayList<String> res= new ArrayList<>();
    public ArrayList<String> Permutation(String str) {
        findPath(str,0,"");
        return res;
    }

    private void findPath(String str, int index, String tmp) {
        if (index == str.length()){
            res.add(tmp);
        }
        for (int i = 0; i < str.length(); i++) {
            tmp+=str.charAt(i);
            findPath(str,index+1,tmp);
        }
        tmp = tmp.substring(0, tmp.length() - 1);
    }

    public static void main(String[] args) {
        Solution2 s = new Solution2();
        s.Permutation("abc");
    }
}
