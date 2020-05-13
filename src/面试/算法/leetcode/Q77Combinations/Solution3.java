package 面试.算法.leetcode.Q77Combinations;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;


public class Solution3 {
    static List<List<Integer>> res = new ArrayList<>();
    public static List<List<Integer>> combine(int n, int k) {
        if (n<=0 || k<=0 || n<k){
            return res;
        }
        ArrayList<Integer> tmp = new ArrayList<>();
        findTruePath(tmp,1,n,k);
        return res;
    }

    private static void findTruePath(ArrayList<Integer> tmp, int start, int n, int k) {
        if (tmp.size()==k){
            res.add(new ArrayList<>(tmp));
            return;
        }
        for (int i = start; i <=n ; i++) {
            tmp.add(i);
            findTruePath(tmp,i+1,n,k);
            tmp.remove(tmp.size()-1);
        }
    }

    public static void main(String[] args) {
        List<List<Integer>> combine = combine(4, 2);
        System.out.println(combine);
    }

}

