package 面试.算法.实习.帮雪婷做.pdd.Q1;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] res=  new int[n];
        for (int i = 0; i < n; i++) {
            int l1 = sc.nextInt();
            int l2 = sc.nextInt();
            res[i] = calcu(l1,l2);
        }
        for (int re : res) {
            System.out.println(re);
        }
    }

    private static int calcu(int l1, int l2) {
        int tmp = l2/l1;
        return tmp+l2;
    }
}
