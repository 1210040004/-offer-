package 面试.算法.牛客.滑动窗口的最大值;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * 给定一个数组和滑动窗口的大小，找出所有滑动窗口里数值的最大值。
 * 例如，如果输入数组{2,3,4,2,6,2,5,1}及滑动窗口的大小3，那么一共存在6个滑动窗口，
 * 他们的最大值分别为{4,4,6,6,6,5}； 针对数组{2,3,4,2,6,2,5,1}的滑动窗口有以下6个：
 * {[2,3,4],2,6,2,5,1}， {2,[3,4,2],6,2,5,1}， {2,3,[4,2,6],2,5,1}，
 * {2,3,4,[2,6,2],5,1}， {2,3,4,2,[6,2,5],1}， {2,3,4,2,6,[2,5,1]}。
 */
public class Solution {
    public static ArrayList<Integer> maxInWindows(int [] num, int size){
        ArrayList<Integer> list  = new ArrayList<Integer> ();
        if(size>num.length||size==0)
            return list;
        for(int i = 0;i<=num.length-size;i++){
            int[] tmp = Arrays.copyOfRange(num, i, i + size);
            Arrays.sort(tmp);
            list.add(tmp[tmp.length-1]);
        }
        return list;
    }

    public static void main(String[] args) {
        int[] arr ={2,3,4,2,6,2,5,1};
        ArrayList<Integer> list = maxInWindows(arr, 3);
        System.out.println(list);
    }
}
