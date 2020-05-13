package 面试.算法.精选100.lc03机器人大冒险;

import java.util.HashSet;

public class Test {
    public static void main(String[] args) {
        HashSet<int[]> set= new HashSet<>();
        set.add(new int[]{1,23});
        int[] a = {1, 23};
        System.out.println(set.contains(a));
    }
}
