package 面试.算法.leetcode.Dp.九章算法.lintcode.Q1713恢复空格;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static int respace(String[] dictionary, String sentence) {
        List<String> list = new ArrayList<>();
        for (String s : dictionary) {
            list.add(s);
        }
        int index = 0;
        int res = 0;
        while(index<sentence.length()){
            if (list.contains(sentence.substring(0,index))){
                sentence = sentence.substring(index,sentence.length());
                res ++;
            }else {
                index++;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        String[] arr= {"looked","just","like","her","brother"};
        String setence ="jesslookedjustliketimherbrother";
        respace(arr,setence);
    }
}
