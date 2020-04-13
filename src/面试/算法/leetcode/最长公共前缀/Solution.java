package 面试.算法.leetcode.最长公共前缀;

import java.util.Arrays;

public class Solution {
    public static String replaceSpace(String[] strs){
        StringBuilder sb= new StringBuilder();
        if (!checkStr(strs)){
            return sb.toString();
        }
        int len = strs.length;
        Arrays.sort(strs);
        int m =strs[0].length();
        int n = strs[len-1].length();
        int num =Math.min(m,n);
        for (int i = 0; i < num; i++) {
            if (strs[0].charAt(i)==strs[len-1].charAt(i)){
                sb.append(strs[0].charAt(i));
            }else {
                break;
            }
        }
        return sb.toString();
    }

    private static boolean checkStr(String[] strs) {
        if (strs==null || strs.length==0){
            return false;
        }
        for (int i = 0; i < strs.length; i++) {
            if (strs[i]==null){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String[] strs = {"customer", "car", "cat" } ;
        String[] strs1 = {} ;
        System.out.println(replaceSpace(strs1));
    }
}
