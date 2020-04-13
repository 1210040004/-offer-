package 面试.算法.牛客.和为S的连续正数序列;

import java.util.ArrayList;
public class Solution {
    public static ArrayList<ArrayList<Integer> > FindContinuousSequence(int sum) {
        ArrayList<ArrayList<Integer> > result = new ArrayList<>();
        int l = 1 ;
        int r = 2 ;
        while(r>l){
            int total = (l+r)*(r-l+1)/2;
            if(total==sum){
                ArrayList<Integer> list = new ArrayList<>();
                for(int i=l;i<=r;i++){
                    list.add(i);
                }
                result.add(list);
                l++;
            }
            if(total<sum){
                r++;
            }
            if(total>sum){
                l++;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> arrayLists = FindContinuousSequence(100);
        for (ArrayList<Integer> arrayList : arrayLists) {
            for (Integer integer : arrayList) {
                System.out.print(integer+" ");
            }
            System.out.println();
        }
    }
}