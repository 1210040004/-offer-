package 面试.算法.牛客.反转算法;

public class Solution {
    public static String reverse(String a ){
        String[] s = a.split("\\.");
        StringBuilder sb = new StringBuilder();
        for (int i = s.length-1; i >= 0; i--) {
            sb.append(s[i]);
            sb.append(".");
        }

        return sb.toString().substring(0,sb.length()-1);
    }

    public static void main(String[] args) {
        System.out.println(reverse("www.toutiao.com"));
    }
}
