package 面试.算法.实习.快手.Q2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    boolean flag= false;
    List<List<Integer>> fac= new ArrayList<>();
    public int[] GetPowerFactor(int R, int N){
        List<Integer> list = new ArrayList<>();
        for (int i = 0; Math.pow(N,i)<=R; i++) {
            list.add((int)Math.pow(N,i));
        }
        int[] table = new int[list.size()];
        for (int i = 0; i < table.length; i++) {
            table[i]=list.get(i);
        }
        List<Integer> temp = new ArrayList<>();
        for (int i = 0; i < table.length; i++) {
              generateFactor(i,table,R,temp);
        }

        List<Integer> res = fac.get(0);
        int[] a= new int[res.size()];
        for (int i = 0; i < a.length; i++) {
            Integer tmp = res.get(i);
            int index =getIndex(tmp,table);
            a[i]=index;
        }
        return a;
    }

    private int getIndex(Integer tmp, int[] table) {
        for (int i = 0; i < table.length; i++) {
            if (tmp==table[i]){
                return i;
            }
        }
        return -1;
    }

    private void generateFactor(int index, int[] table, int r, List<Integer> res) {
        if (r==0){
            flag=true;
            fac.add(new ArrayList<>(res));
            return;
        }
        if (r<0){
            return;
        }
            if (!flag){
                for (int i = index; i < table.length; i++) {
                    res.add(table[i]);
                    generateFactor(index+1,table,r-table[i],res);
                    res.remove(res.size()-1);
                }
            }
           else {
               return;
            }
    }

    public static void main(String[] args) {
        Main a = new Main();
        int[] ints = a.GetPowerFactor(39, 3);
        for (int i : ints) {
            System.out.println(i);
        }
    }
}
