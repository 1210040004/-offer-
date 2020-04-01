package 面试.算法.实习.美团.Day326美团.Q1;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String s = sc.nextLine();
        char[] c = s.toCharArray();
        String[] t= new String[9];

        for (int i = 0; i < t.length; i++) {
            char[] chars = t[i].toCharArray();
            char a = chars[0];
            for (int k = 0; k < c.length; k++) {
                if(c[k]== (char)i){
                    c[k]=a;
                }
            }
        }
        System.out.println(c);
    }
}

//        for (int i = 0; i < c.length; i++) {
////            if(c[i]=='-'||c[i]=='+'){
////                continue;
////            }else {
////                char c1 = t[j].charAt(0);
////                c[i]=c1;
////                j++;
////            }
//              if(c[i]=='-'||c[i]=='+'){
//                  continue;
//              }
//
//        }
// 第i个整数表示将数字i改成t[i];