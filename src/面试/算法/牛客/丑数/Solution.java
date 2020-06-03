package 面试.算法.牛客.丑数;

import java.util.ArrayList;

public class Solution {
    public int GetUglyNumber_Solution(int index) {
        if (index<7) return index;
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        int i2 = 0, i3=0,i5=0;
        while (list.size()<index){
            int m2=list.get(i2)*2;
            int m3=list.get(i3)*3;
            int m5=list.get(i5)*5;
            int min=Math.min(m2,Math.min(m3,m5));
            list.add(min);
            if(min==m2)i2++;
            if(min==m3)i3++;
            if(min==m5)i5++;
        }
        return list.get(list.size()-1);
    }
}
