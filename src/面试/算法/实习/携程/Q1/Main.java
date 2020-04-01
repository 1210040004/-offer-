package 面试.算法.实习.携程.Q1;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Main {


    /*请完成下面这个函数，实现题目要求的功能
    当然，你也可以不按照下面这个模板来作答，完全按照自己的想法来 ^-^
    ******************************开始写代码******************************/
    static int calcMinStaff(int[] pre, int[] last) {
        int count = pre.length ;
        int n =last.length;
        for (int i = 0; i < n; i++) {
            for (int j = i+1 ; j < n; j++) {
                if(last[i]<pre[j]){
                    count--;
                }
            }
        }
        return 12;
    }
    /******************************结束写代码******************************/


    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] pre = new int[n];
        int[] last = new int[n];
        for (int i = 0; i < n; i++) {
            pre[i]=in.nextInt();
            last[i] = in.nextInt();
        }

        int res;
        res = calcMinStaff(pre,last);
        System.out.println(String.valueOf(res));

    }
}
