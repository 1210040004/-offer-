package 面试.算法.实习.字节.圆圈中剩下的数字;

import java.util.ArrayList;

public class Solution {
    public int lastRemaining(int n, int m) {
            ArrayList<Integer> list = new ArrayList<>(n);
            for (int i = 0; i < n; i++) {
                list.add(i);
            }
            int idx = 0;
            while(n>1){
                idx = (idx+m-1)%n;
                list.remove(idx);
                n--;
            }
            return list.remove(0);
    }
}
