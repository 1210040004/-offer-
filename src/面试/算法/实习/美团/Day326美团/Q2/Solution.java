package 面试.算法.实习.美团.Day326美团.Q2;

import java.util.*;
public class Solution{
    public static void main(String[] args)
    {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=scanner.nextInt();
        }
        Arrays.sort(arr);
        long res=0;
        if(n%2==1)
        {
            int decimal=1;
            for(int i=0;i<n;i++)
            {
                res=arr[i]*arr[i]*decimal+res;
                decimal=-decimal;
            }
        }
        else{

            int decimal=-1;
            for(int i=0;i<n;i++)
            {
                res=arr[i]*arr[i]*decimal+res;
                decimal=-decimal;
            }}
        double pi=3.1415926535898;
        double out=pi*res;
        System.out.printf("%.5f",out);
    }
}