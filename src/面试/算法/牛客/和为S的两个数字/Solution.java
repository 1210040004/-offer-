package 面试.算法.牛客.和为S的两个数字;

import java.util.ArrayList;
public class Solution {
    public ArrayList<Integer> FindNumbersWithSum(int [] array,int sum) {
        ArrayList<Integer> result = new ArrayList<>();
        int r = array.length-1;
        int l = 0;
        while (l<r){
            int total = array[l] + array[r];
            if (total==sum){
                result.add(array[l]);
                result.add(array[r]);
                return result;
            }
            if (total<sum){
                l++;
            }else {
                r--;
            }
        }
        return  result;
    }
}