package 面试.算法.leetcode.Q17电话号码的组合;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    String[] num = {"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
    List<String> res = new ArrayList<>();
    public List<String> letterCombinations(String digits) {
        if (digits==null || digits.length()==0){
            return res;
        }
        getPhoneCall(digits,0,"");
        return res;
    }
    private void getPhoneCall(String digits,int index,String temp){
        if (index ==digits.length()){
            res.add(temp);
            return;
        }
        char c = digits.charAt(index);
        int value = c-'0';
        String s = num[value];
        for (int i = 0; i < s.length(); i++) {
            getPhoneCall(digits,index+1,temp+s.charAt(i));
        }
        return ;
    }

}
