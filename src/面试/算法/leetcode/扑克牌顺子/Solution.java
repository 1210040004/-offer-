package 面试.算法.leetcode.扑克牌顺子;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Solution {
    public boolean isContinuous(int [] numbers) {
        int count0 = 0;
        List<Integer> list = new ArrayList<>();
        for (int number : numbers) {
            if (number ==0){
                count0++;
            }else {
                list.add(number);
            }
        }
        Collections.sort(list);
        if (count0==4){
            return true;
        }
        if (count0==3){
            int t = list.get(1) - list.get(0);
            if (t>4){
                return false;
            }
            return true;
        }
        if(count0==2){
            if ((list.get(2) - list.get(0)) > 4) {
                return false;
            }
            return true;
        }
        if(count0==1){
            if ((list.get(3) - list.get(0)) > 4) {
                return false;
            }
            return true;
        }
        if (count0 == 0) {
            for (int i = 0; i < list.size()-1; i++) {
                if((list.get(i+1)-list.get(i))!=1){
                    return false;
                }
            }
            return true;
        }
        return false;
    }
}
