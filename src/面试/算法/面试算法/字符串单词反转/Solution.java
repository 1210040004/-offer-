package 面试.算法.面试算法.字符串单词反转;

public class Solution {
    public static String reverseString(String s){
        String[] t = s.split("\\s+");
        int n = t.length;
        for (int i = 0; i < n/2 ; i++) {
            swap(t,i,n-1-i);
        }
        StringBuilder sb= new StringBuilder();
        for (int i = 0; i < t.length; i++) {
            if (i!=n-1){
                sb.append(t[i]);
                sb.append(" ");
            }
          else {
              sb.append(t[i]);
            }
        }
        return sb.toString();
    }

    private static void swap(String[] t, int i, int j) {
        String temp = t[i];
        t[i] = t[j];
        t[j] = temp;
    }

    public static void main(String[] args) {
        System.out.println(reverseString("how are you"));
    }
}
