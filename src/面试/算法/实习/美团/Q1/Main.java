package 面试.算法.实习.美团.Q1;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int n = s.length();
        int gap = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        int countMax = 0;
        int countMin = 0;
        int min = arr[0];
        int max = arr[n - 1];
        // 计算大于min+x的数的个数, 或者 小于max-x 的数字的个数
        for (int i = 0; i < n; i++) {
            if (arr[i] > (min + gap)) {
                countMax++;
            }
            if (arr[i] < (max - gap)) {
                countMin++;
            }
        }
        System.out.println(Math.min(countMax, countMin));
    }
}