package 面试.算法.牛客.左旋字符串;

public class Solution {
    public String LeftRotateString(String str,int n) {
        int t = str.length();
        if(t==0){
            return "";
        }
        str+=str;
        n=n%t;
        return str.substring(n,n+t);
    }
}
