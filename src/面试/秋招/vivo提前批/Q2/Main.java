package 面试.秋招.vivo提前批.Q2;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            int k = sc.nextInt();
            int n = sc.nextInt();
            int res = calcu(k,n);
            System.out.println(res);
        }
    }
    public static int calcu(int K, int N) {
        // 借助额外空间
        int[] arr = new int[K];
        Arrays.fill(arr, 1);
        while (arr[K - 1] < N) {
            for (int i = K - 1; i >0 ; i--) {
                // 上一个状态的
                arr[i] = arr[i] + arr[i - 1] + 1;
            }
            arr[0]++;
        }
        return arr[0];
    }
}
