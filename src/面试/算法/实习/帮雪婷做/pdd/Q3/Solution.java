package 面试.算法.实习.帮雪婷做.pdd.Q3;

import java.util.Arrays;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr= new int[n];
        for (int i = 0; i < n; i++) {
            arr[i]= sc.nextInt();
        }
        for (int i = 0; i < m; i++) {
            Arrays.sort(arr);
            int min = arr[0];
            int max = arr[arr.length-1];
            if (max-1>min){
                arr[0]++;
                arr[arr.length-1]--;
            }
        }
        Arrays.sort(arr);
        System.out.println(arr[arr.length-1] - arr[0]);
    }
}
