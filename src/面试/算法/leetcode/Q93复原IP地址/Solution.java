package 面试.算法.leetcode.Q93复原IP地址;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    static List<String> res = new ArrayList<>();
    public static List<String> restoreIpAddresses(String s) {
        // 只有四段，所以搜索所有的情况，符合就存储
        List<String>  temp = new ArrayList<>();
        dfs(s,0,temp);
        return res;
    }

    private static void dfs(String s, int start, List<String> temp) {
        if (start == s.length()){
            if (temp.size()==4){
                StringBuilder sb= new StringBuilder();
                for (int i = 0; i < temp.size(); i++) {
                        sb.append(temp.get(i));
                    if (i!=temp.size()-1) {
                        sb.append(".");
                    }
                }
                res.add(sb.toString());
                return;
            }
        }
        else {
            if (temp.size()>=4) return;
            for (int i = start; i < s.length() && i<start+3; i++) {
                String str = s.substring(start,i+1);
                if (str.charAt(0)=='0' && str.length()>1) break;
                int num = Integer.parseInt(str);
                if (num>=0 && num <=255){
                    temp.add(str);
                    dfs(s,i+1,temp);
                    temp.remove(temp.size()-1);
                }else {
                    break;
                }
            }
        }
    }

    public static void main(String[] args) {
        List<String> strings = restoreIpAddresses("0000");
        System.out.println(strings);
    }
}
