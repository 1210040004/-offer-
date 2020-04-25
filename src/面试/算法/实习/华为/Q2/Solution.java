package 面试.算法.实习.华为.Q2;

import java.util.ArrayList;
import java.util.Scanner;


public class Solution {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        while(sc.hasNext()){
            String par = sc.next();
            String next = sc.next();
            int length = next.length();
            String[] s = next.split("],");
            for (int i = 0; i < s.length; i++) {
                String[] t = s[i].split("\\[");
                //匹配开头的字符
                if (!t[0].equals(par)){
               //     System.out.println("FAIL");
                    continue;
                }
                String[] l = t[1].split("=|,|]");
                ArrayList<String> list = new ArrayList<>();
                for (int j = 0; j < l.length; j++) {
                    if (l[j].startsWith("0")){
                        if (is16Num(l[j])){
                            list.add(l[j]);
                        }
                    }

                }
                if (list.size()==3){
                    for (String s1 : list) {
                        System.out.print(s1+" ");
                    }
                }else {
                    System.out.print("FAIL");
                }
                System.out.println();
            }
        }
    }

    private static boolean is16Num(String s) {
        int length = s.length();
        if (!(s.charAt(1)=='x'||s.charAt(1)=='X')){
            return false;
        }
        for (int i = 2; i <s.length() ; i++) {
            char c = s.charAt(i);
            if (!((c>='A' && c<='F') || (c>='a' && c<='f') ||(c>='0' && c<='9'))){
                return false;
            }
        }
        return true;
    }

}
