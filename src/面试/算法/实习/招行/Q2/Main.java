package 面试.算法.实习.招行.Q2;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            int n = sc.nextInt();
            ArrayList<Integer> list = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                String s = sc.next();
                int k = sc.nextInt();
                list.add(calcu(s,k));
            }
            for (Integer i : list) {
                System.out.println(i);
            }
        }
    }

    private static Integer calcu(String s, int k) {
    return 0;
    }
}
