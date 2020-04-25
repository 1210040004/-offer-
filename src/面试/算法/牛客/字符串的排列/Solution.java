package 面试.算法.牛客.字符串的排列;

//按照字典序打印出所有字符的排列
import java.util.ArrayList;

public class Solution {
    static ArrayList<String> res = new ArrayList<>();
    public static ArrayList<String> Permutation(String str) {
        // 字符串的全排列
        if (str.length()==0){
            return res;
        }
        String sb = new String();
        generatePermutation(str,0,sb);
        return res;
    }

    private static void generatePermutation(String str, int index, String tmp) {
        if (index == str.length()){
            res.add(tmp.toString());
            return;
        }
        for (int i = 0; i < str.length(); i++) {
            if (!doesStringAHasCharB(tmp,str.charAt(i))){
                tmp+=(str.charAt(i));
                generatePermutation(str,index+1,tmp);
                tmp=tmp.substring(0, tmp.length() - 1);
            }
        }
    }

    private static boolean doesStringAHasCharB(String tmp, char charAt) {
        int length = tmp.length();
        for (int i = 0; i < length; i++) {
            if (tmp.charAt(i)==charAt){
                return true;
            }
        }
        return false;
    }


}
