package 面试.算法.实习.阿里;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Solution2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<String> list= new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list.add(sc.next());
        }


        Collections.sort(list, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if(o1.charAt(o1.length()-1)<o2.charAt(o2.length()-1)){
                    return -1;
                }else {
                    return 1;
                }
            }
        });
        int[] len = new int[n];
        for (int i = 0; i < list.size(); i++) {
            len[i]=list.get(i).length();
        }
        int[] dp = new int[n+1];
        dp[0]=0;
        dp[1]=findMaxlength(list);
        // 长度为i的时候的dp是什么
        for (int i = 1; i <=n; i++) {
            for (int j = 2; j <n ; j++) {
                
            }
        }

    }

    private static int findMaxlength(ArrayList<String> list) {
        int maxlen=0;
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i).length()>maxlen){
                maxlen=list.get(i).length();
            }
        }
        return maxlen;
    }
}
