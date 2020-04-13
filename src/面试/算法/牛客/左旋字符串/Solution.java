package 面试.算法.牛客.左旋字符串;

public class Solution {
    public String LeftRotateString(String str,int n) {
        int t = str.length();
        str+=str;
        return str.substring(n,n+t);
    }
}
