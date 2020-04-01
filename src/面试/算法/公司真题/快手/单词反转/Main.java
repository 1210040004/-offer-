package 面试.算法.公司真题.快手.单词反转;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        String t = sc.nextLine();
        String[] s =t.split("\\s+");
        int n = s.length;
        if(n<=1){
            System.out.println(s[0]);
            return;
        }
        StringBuilder sb = new StringBuilder();
        if(s[n-1].equals(".")){
            for (int i = 0; i < n - 1; i++) {
                sb.append(s[n-2-i]+" ");
            }
            String trim = sb.toString().trim();
            trim+=".";
            System.out.println(trim);
            return;
        }else {
            for (int i = 0; i < n - 1; i++) {
                if(i==0){
                    sb.append(s[n-1-i].substring(0,s[n-i-1].length()-1)+" ");
                }
                sb.append(s[n-2-i]+" ");
            }
            String trim = sb.toString().trim();
            trim+=".";
            System.out.println(trim);
            return;
        }
    }
}
