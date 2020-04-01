package 面试.算法.公司真题.腾讯.有趣的数字;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            int n= sc.nextInt();
            int[] arr= new int[n];
            for (int i = 0; i < arr.length; i++) {
                arr[i]=sc.nextInt();
            }
            Arrays.sort(arr);
            if(arr[0]==arr[arr.length-1]){
                int temp=n*(n-1)/2;
                System.out.println(temp+" "+temp);
            }else {
                solution(arr);
            }
        }
    }

    private static void solution(int[] arr) {
        int n = arr.length;

        //做统计就可以了
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int i : arr) {
            if (map.containsKey(i)){
                map.put(i,map.get(i)+1);
            }else {
                map.put(i,1);
            }
        }
        Integer min = map.get(arr[0]);
        Integer max = map.get(arr[n - 1]);
        int[] f = new int[n-1];
        for (int i = 1; i < arr.length; i++) {
            f[i-1]=arr[i]-arr[i-1];
        }
        HashMap<Integer,Integer> map2 = new HashMap<>();
        for (int i : f) {
            if (map2.containsKey(i)){
                map2.put(i,map.get(i)+1);
            }else {
                map2.put(i,1);
            }
        }
        Integer minNum = map2.get(f[0]);// 最小
        System.out.println(minNum+" "+min*max );
    }
}
