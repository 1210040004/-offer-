package 面试.算法.leetcode.Q17电话号码的可能组合;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Solution {
    static List<String> res = new ArrayList<>();
    static String[] letterMap = {" ","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
    public static List<String> letterCombinations(String digits) {
        //
        if (digits==null||digits.length()==0){
            return res;
        }
        fintCombination(digits,0,"");
        return res;
    }
    public static void fintCombination(String digits,int index , String s){
        if (index == digits.length()){
            //保存
            res.add(s);
            return;
        }
        // 这个数字
        char c = digits.charAt(index);
        //
        String letters = letterMap[c - '0'];
        for (int i = 0; i < letters.length(); i++) {
             fintCombination(digits,index+1,s+letters.charAt(i));
        }
        return;
    }

    public static void main(String[] args) {
        List<String> strings = letterCombinations("2323");
        for (String string : strings) {
            System.out.println(string);
        }
    }
}
