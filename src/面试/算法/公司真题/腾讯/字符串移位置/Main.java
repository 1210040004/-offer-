package 面试.算法.公司真题.腾讯.字符串移位置;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        while (sc.hasNext()){
            String s = sc.nextLine();
            solution(s);
        }
    }

    private static void solution(String s) {
        System.out.println(s.replaceAll("[A-Z]","")+s.replaceAll("[a-z]",""));
    }
}
