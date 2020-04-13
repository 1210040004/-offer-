package 面试.算法.面试算法.面试题0109字符串轮转;

public class Solution {
//    字符串轮转。给定两个字符串s1和s2，请编写代码检查s2是否为s1旋转而成（比如，waterbottle是erbottlewat旋转后的字符串）。
    public static boolean isFlipedString(String s1, String s2) {
        int n1 = s1.length();
        int n2 = s2.length();
        if (n1!=n2){
            return false;
        }
        if (s1.equals(s2)){
            return true;
        }
        for (int i = 1; i <=n1-1; i++) {
            if((s1.substring(i)+ s1.substring(0,i)).equals(s2)){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(isFlipedString("waterbottle", "erbottlewat"));
    }
}
