package 面试.算法.实习.美团.ABA字符串判定;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String s = sc.nextLine();
        int k =sc.nextInt();
        // s是字符串，k是ABA的最小长度
        int n = s.length();
        if (n<((2*k)+1)){
            throw new RuntimeException("输入数据有问题");
        }
        int val = 0;
        for (int i = 0; i <n ; i++) {
            for (int j = i+1; j<n+1; j++) {
                String t = s.substring(i, j);
                if (isABAStr(t,k)){
                    val++;
                }
            }
        }
        System.out.println(val);
    }
    private static boolean isABAStr(String s, int k){
        int n = s.length();
        for (int i = k-1; i < (n-1)/2; i++) {
            if(s.substring(0,i+1).equals(s.substring(n-i-1))){
                return true;
            }
        }
        return false;
    }
}


