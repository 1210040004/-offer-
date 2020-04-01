package 面试.算法.实习.阿里.Q1;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String t = sc.next();
        char[] cs = s.toCharArray();
        char[] ct = t.toCharArray();
        int m = cs.length;
        int n = ct.length;
        if(m!=n){
            System.out.println(-1);
            return;
        }
        int temp=m-1;
        int count=0;
        while(temp>0 && !cs.toString().equals(ct.toString())){
            while(temp>=1 && cs[temp]==ct[temp]){
                temp--;
            }
            int i=0;
            while(i<temp&&ct[i]!=cs[temp]){
                i++;
            }
            count++;
            char c = cs[temp];
            for (int j = i; j < temp; j++) {
                ct[j]=ct[j+1];
            }
            ct[temp]=cs[temp];
        }
        if(count==0){
            System.out.println(-1);
        }else {
            System.out.println(count-1);
        }
    }
}