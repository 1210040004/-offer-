package 面试.算法.实习.阿里.Q2;

import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        int[] l = new int[n];
        int[] r=  new int[n];
        TreeSet<Integer> treeSet= new TreeSet<>();
        for (int i = 0; i < n; i++) {
            l[i]=sc.nextInt();
            treeSet.add(l[i]);
        }
        for (int i = 0; i <n; i++) {
            r[i]=sc.nextInt();
            treeSet.add(l[i]);
        }
        Arrays.sort(l);
        Arrays.sort(r);
        //总共的随机数
        int total = (n+1)*n/2;

    }
}
