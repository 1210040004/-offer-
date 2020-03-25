package 面试.算法.牛客.QUESTION2替换空格;


public class Solution {
    public String replaceSpace(StringBuffer str) {
        String s = str.toString().replaceAll(" ", "%20");
        return s;
    }

    public String replaceSpace2(StringBuffer str) {
        StringBuilder sb= new StringBuilder();
        String s = str.toString();
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i)==' '){
                sb.append("%20");
            }
            else {
              sb.append(s.charAt(i));
            }
        }
        return sb.toString();
    }
}
