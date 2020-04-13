package 面试.算法;

public class Solution {
    public String longestCommonPrefix(String[] strs) {
        if(strs==null || strs.length==0){
            return "";
        }
        String s = strs[0];
        for(int i=1; i<strs.length;i++){
            int j = 0 ;
            for(;j<strs[i].length();j++){
                if(strs[i].charAt(j)!=s.charAt(j)){
                    break;
                }
            }
            s=s.substring(0,j);
        }
        return s;
    }
}