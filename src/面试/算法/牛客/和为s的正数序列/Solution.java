package 面试.算法.牛客.和为s的正数序列;

import java.util.ArrayList;

public class Solution {
      ArrayList<ArrayList<Integer>>  res=new ArrayList<>();
    public  ArrayList<ArrayList<Integer> > FindContinuousSequence(int sum) {
        int i = 1 ;
        int j = 2;
        while(i<j){
            int total = (i+j)*(j-i+1)/2;
            if (total==sum){
                ArrayList<Integer> tmp = new ArrayList<>();
                for (int k = i; k <= j; k++) {
                    tmp.add(k);
                }
                res.add(tmp);
                i++;
            }else if (total<sum){
                j++;
            }else {
                i++;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> arrayLists =new Solution().FindContinuousSequence(4);
        System.out.println(arrayLists);
    }
}