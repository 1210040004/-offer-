package 面试.算法.实习.百度.Q2;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        while(sc.hasNext()){
            int n = sc.nextInt();
            Long[] arr= new Long[n];
            for (int i = 0; i < n; i++) {
                arr[i]=sc.nextLong();
            }
            System.out.println(Solution(arr));
        }

    }

    private static long Solution(Long[] arr) {
        Arrays.sort(arr);
        int n = arr.length;
        if (arr[n-1]<n){
            return 0;
        }
        int k=0;
        while(topN(arr)>=n){
            k++;
            arr[n-1]=arr[n-1]-n;
            for (int i = 0; i < arr.length-1; i++) {
                arr[i]=arr[i]+1;
            }
        }
        return k;
    }

    private static Long topN(Long[] arr) {
        Arrays.sort(arr);
        return arr[arr.length-1];
    }
}
