package 面试.集合.ArrayList和LinkedList;

import java.util.ArrayList;
import java.util.LinkedList;

public class interface2  implements inter{
     static LinkedList<Integer> list = new LinkedList<>();

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(5);
        for (int i = 0; i < 15; i++) {
            list.add(i);
        }
        for (Integer i : list) {
            System.out.println(i);
        }
    }

}
