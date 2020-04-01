package 面试.算法.实习.美团.Day326美团.Q1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Solution{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        long nextLong=sc.nextLong();
        sc.nextLine();
        List<Integer> list =new ArrayList<>();
        for(int i=0;i<9;i++){
            list.add(sc.nextInt());
        }
        String a=""+nextLong;
        int n= a.length();
        boolean islessthan0 =false;
        // 处理负数
            if(a.charAt(0)=='0'){
                islessthan0=true;
                a  = a.substring(1);
            }
            StringBuilder sb=new StringBuilder();
            for(int i=0;i<n;i++){
                int num=a.charAt(i)-'0';
                sb.append(list.get(num));
            }
            String result =null;
            if(islessthan0==true){
               result = "-" + sb.toString();
            System.out.println(result);
            }else {
            System.out.println(sb);
        }
    }
}
