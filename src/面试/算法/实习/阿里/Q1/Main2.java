package 面试.算法.实习.阿里.Q1;

import java.util.*;

public class Main2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        String t = in.nextLine();
        char[] s1 = s.toCharArray();
        char[] t1 = t.toCharArray();
        int num = 26;
        int[] tArray = new int[num];
        for(char a:t1){
            tArray[a-'a']++;
        }
        for(char b:s1){
            tArray[b-'a']--;
        }
        for(int i=0;i<num;i++){
            if(tArray[i]<0){
                System.out.print(-1);
                return;
            }
        }
        int count =0;
        int pos = 0;
        for(int i=0;i<s1.length;i++){
            if(s1[i]==t1[pos]){
                pos++;
            }else{
                count++;
            }
        }
        System.out.print(count);
    }
}