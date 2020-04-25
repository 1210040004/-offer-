package 面试.算法.实习.华为.Q3;

import sun.awt.Symbol;

import java.awt.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    static ArrayList<container> containers = new ArrayList<>();
    static class container{
        int num;
        int contain;
        ArrayList<Integer> list = new ArrayList<>();

        public container() {
        }

        public int getNum() {
            return num;
        }

        public void setNum(int num) {
            this.num = num;
        }

        public int getContain() {
            return contain;
        }

        public void setContain(int contain) {
            this.contain = contain;
        }

        public ArrayList<Integer> getList() {
            return list;
        }

        public void setList(ArrayList<Integer> list) {
            this.list = list;
        }
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        while(sc.hasNext()){
            int n = sc.nextInt();
            int[]  contain = new int[n];
            for (int i = 0; i <n ; i++) {
                contain[i]=sc.nextInt();
            }
            sc.nextLine();

            for (int i = 0; i < n; i++) {
                String s = sc.nextLine();
                container c=new container();
                String[] t = s.split(" ");
                c.setNum(Integer.valueOf(t[0]));
                c.setContain(Integer.valueOf(t[1]));
                ArrayList<Integer> list = new ArrayList<>();
                for (int j = 2; j < t.length; j++) {
                    list.add(Integer.valueOf(t[j]));
                }
                c.setList(list);
                containers.add(c);
            }
            int max = Integer.MIN_VALUE;
        }
        container curr = new container();
        while(curr.list.size()!=0){
            for (int i = 0; i < containers.size(); i++) {
                container c = containers.get(i);
            }
        }
    }
}
