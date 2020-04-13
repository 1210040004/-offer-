package 面试.算法.实习.网易.Q1.Q3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        while (sc.hasNext()){
            int n = sc.nextInt();
            int m = sc.nextInt();
            boolean[] result = new boolean[n];
            int count = 0;
            int begin = sc.nextInt();
            result[begin] = true;
            for (int i = 0; i < m; i++) {
                int num = sc.nextInt();
                // 参加聚会的人数
                int[] arr = new int[num];
                for (int k = 0; k < arr.length; k++) {
                    arr[k]= sc.nextInt();
                }
                //刷新感染人数
                for (int l = 0; l < arr.length; l++) {
                    if (result[arr[l]]==true){
                        for (int i1 = 0; i1 < arr.length; i1++) {
                            result[arr[i1]]=true;
                        }
                    }
                }

            }
            for (boolean b : result) {
                if (b){
                    count++;
                }
            }
            System.out.println(count);
        }
    }

}
