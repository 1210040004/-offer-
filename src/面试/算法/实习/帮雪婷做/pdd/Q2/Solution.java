package 面试.算法.实习.帮雪婷做.pdd.Q2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;
class Memory{
    int a;
    int b;

    public Memory(int a, int b) {
        this.a = a;
        this.b = b;
    }
}
public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n==1){
            System.out.println(sc.nextInt());
            return;
        }
        ArrayList<Memory> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            Memory memory = new Memory(a,b);
            list.add(memory);
        }
        Collections.sort(list, new Comparator<Memory>() {
            @Override
            public int compare(Memory o1, Memory o2) {
                return (o1.b+o2.a)-(o1.a+o2.b);
            }
        });
        int max = 0 ;
        int pre = 0 ;
        for (Memory memory : list) {
            max = Math.max(pre+memory.a,max);
            pre+= memory.b;
        }
        System.out.println(max);
    }
}
