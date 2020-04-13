package 面试.算法.实习.招行.Q1;

import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<String> list = new ArrayList<String>();
        for(int i=0; i<n; i++){
            String s = sc.next();
            list.add(isMirror(s));
        }
        for (String s : list) {
            System.out.println(s);
        }
    }

    public static String isMirror(String s){
        int[] change = new int[]{0,1,5,8,7,2,9,4,3,6};
        int len = s.length();
        int[] cur = new int[len];
        int[] reverse = new int[len];
        int[] result = new int[len];
        for(int i=0; i<len; i++){
            int temp = s.charAt(i)-'0';
            cur[i] = temp;
            reverse[len-1-i] = temp;
            result[i] = change[temp];
        }
        for(int i=0; i<len; i++){
            if(reverse[i]!=result[i]){
                return "NO";
            }
        }

        return "YES";
    }
}
