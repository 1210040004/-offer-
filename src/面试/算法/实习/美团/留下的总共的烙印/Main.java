package 面试.算法.实习.美团.留下的总共的烙印;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        long fali=sc.nextInt();
        sc.nextLine();
        int[] arr=new int[n];//法力值
        int sum=0;
        long count=0;
        int min=Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
            sum+=arr[i];//法力值总和
            if(arr[i]<min){
                min=arr[i];
            }
        }
        count=count+n*(fali/sum);//看至少能进行几次循环
        fali=fali%sum;//剩余多少法力
        while(fali>=min){
            for(int i=0;i<n;i++){
                if(fali>=arr[i]){
                    count++;
                    fali=fali-arr[i];//花费掉这么多法力
                }
            }
        }
        System.out.println(count);
        sc.close();
    }
}