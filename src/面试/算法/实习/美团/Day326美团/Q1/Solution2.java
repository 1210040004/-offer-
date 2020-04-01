package 面试.算法.实习.美团.Day326美团.Q1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Solution2{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        long a=sc.nextLong();
        sc.nextLine();
        List<Integer> list =new ArrayList<>();
        for(int i=0;i<9;i++){
            list.add(sc.nextInt());
        }
        String s=""+a;
        int len=s.length();
        if(a<0){
            StringBuilder sb=new StringBuilder();
            sb.append("-");
            for(int i=0;i<len-1;i++){
                int num=s.charAt(i+1)-'0'-1;
                sb.append(list.get(num));
            }
            System.out.println(sb.toString());
        }else{
            StringBuilder sb=new StringBuilder();
            for(int i=0;i<len;i++){
                int num=s.charAt(i)-'0';
                sb.append(list.get(num));
            }
            System.out.println(sb.toString());
        }
        sc.close();


    }
}