package 面试.算法.leetcode.Q6Z字变换;

public class Solution {
    public static String convert(String s, int numRows) {
        if (s==null || s.length()==0){
            return s;
        }
        StringBuilder[] sb = new StringBuilder[numRows];
        for (int i = 0; i < sb.length; i++) {
            sb[i] = new StringBuilder();
        }
        int dir = 1 ;
        int index =0;
        for (char c : s.toCharArray()) {
            sb[index].append(c);
            index+=dir;
            if (index==0 || index==numRows){
                dir=-dir;
            }
        }
        StringBuilder res = new StringBuilder();
        for (int i = 0; i < sb.length; i++) {
            res.append(sb[i]);
        }
        return res.toString();
    }

    public static void main(String[] args) {
        convert("PAYPALISHIRING",3);
    }
}
