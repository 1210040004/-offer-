package 面试.算法.实习.招行.Q1;

import java.util.ArrayList;
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            int n = Integer.valueOf(sc.nextLine());
            ArrayList<String> list = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                String s = sc.nextLine();
                char[] c = s.toCharArray();
                panduan(c,list);
            }
            for (String s : list) {
                System.out.println(s);
            }

        }
    }

    private static void panduan(char[] c, ArrayList<String> list) {
        if (c.length==0){
            list.add("NO");
        }
        int j = c.length-1;
        int i = 0 ;
        while(i<j){
            if (!isMirror(c[i],c[j])){
                list.add("NO");
                return;
            }
            i++;
            j--;
        }
        list.add("YES");
        return;
    }

    private static boolean isMirror(char c, char t) {
        if (c=='1'&&t=='1')return true;
        if ((c=='2'&& t=='5')||(c=='5'&&t=='2')) return true;
        if ((c=='3'&&t=='8')||(c=='8'&&t=='3')) return true;
        if ((c=='4'&&t=='7')||(c=='7'&&t=='4')) return true;
        if ((c=='6'&&t=='9')||(c=='9'&&t=='6')) return true;
        return false;
    }
}
