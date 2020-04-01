package 面试.算法.公司真题.快手;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static int num=0;
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n = Integer.valueOf(sc.nextLine());
        String s = sc.nextLine();


//        ArrayList<String> list= new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            for (int j = i+1; j <=s.length() ; j++) {
                String substring = s.substring(i, j);
//                list.add(substring);
                boolean flag= StringHasNOne(substring,n);
                 if(flag){
                     num++;
                 }
            }
        }
        System.out.println(num);
//       for (String s1 : list) {
//            System.out.println(s1);
//        }
    }

    private static boolean StringHasNOne(String s, int n) {
        char[] c = s.toCharArray();
        for (int i = 0; i < c.length; i++) {
             if (c[i]=='1'){
                 n--;
             }
        }
        if (n!=0){
            return false;
        }
        return true;
    }
}
