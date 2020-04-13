package 面试.算法.实习.网易.Q1.Q2;

import java.util.*;

public class Main {
    static class guaishou{
        int pofang = 0;
        int shanghai =0;

        public guaishou(int pofang, int shanghai) {
            this.pofang = pofang;
            this.shanghai = shanghai;
        }
    }

    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        while(sc.hasNext()){
            int n = sc.nextInt();
            int[] a= new int[n];
            int[] b= new int[n];
            int fangyu = sc.nextInt();
            for (int i = 0; i < a.length; i++) {
                a[i]=sc.nextInt();
            }
            for (int i = 0; i < b.length; i++) {
                b[i]=sc.nextInt();
            }
            List<guaishou> list = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                guaishou guaishou = new guaishou(a[i], b[i]);
                list.add(guaishou);
            }
            Collections.sort(list, new Comparator<guaishou>() {
                @Override
                public int compare(guaishou o1, guaishou o2) {
                    if (o1.pofang>o2.pofang){
                        return 1;
                    }
                    return -1 ;
                }
            });
            int damage = 0 ;
            for (guaishou guaishou : list) {
                if (guaishou.pofang>fangyu){
                    damage+=guaishou.shanghai;
                }else {
                    fangyu++;
                }
            }
            System.out.println(damage);
        }

    }
}
