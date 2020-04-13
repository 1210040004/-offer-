package 面试.算法.牛客.反转单词顺序列;

public class Solution {
    public static String ReverseSentence(String str) {
        String[] s = str.split("\\s+");
        if (s.length<=1){
            return str;
        }
        StringBuilder sb= new StringBuilder();
        for (int i = s.length-1; i >=0; i--) {
            if (i!=0){
            sb.append(s[i]+" ");
            }else {
                sb.append(s[i]);
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        ReverseSentence("I am a student.");
    }
}
