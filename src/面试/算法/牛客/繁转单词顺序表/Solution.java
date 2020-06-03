package 面试.算法.牛客.繁转单词顺序表;

public class Solution {
    public  static String ReverseSentence(String str) {
        String[] s = str.split("\\s+");
        if (s.length<=1){
            return str;
        }
        StringBuilder sb = new StringBuilder();
        for (int i = s.length-1; i >=0 ; i--) {
            sb.append(new StringBuilder(s[i])+" ");
        }
        String substring = sb.substring(0, sb.length() - 1);
        return substring;
    }

    public static void main(String[] args) {
        System.out.println(ReverseSentence(" "));
    }
}
