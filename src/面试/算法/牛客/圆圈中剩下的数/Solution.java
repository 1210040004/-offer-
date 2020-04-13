package 面试.算法.牛客.圆圈中剩下的数;

import java.util.ArrayList;

public class Solution {
    public int LastRemaining_Solution(int n, int m) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list.add(i);
        }
        int temp = 0;
        while(list.size()>1){
            temp  = (temp+m-1)%list.size();
            list.remove(temp);
        }
        return list.size()==1 ? list.get(0):-1;
    }
}
