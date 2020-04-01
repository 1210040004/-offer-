package 面试.算法.实习.美团.Day326美团.Q2;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    static double pi = 3.1415926;
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < a.length; i++) {
            a[i]=sc.nextInt();
        }
        double result=0;
        Arrays.sort(a);
        result+=Math.pow(a[0],2);
        for (int i = 1; i < n; i++) {
            if(i%2==0){
                result+= Math.pow(a[i],2)-Math.pow(a[i-1],2);
            }
        }
        System.out.format("%.5f",result*pi);
    }
}
