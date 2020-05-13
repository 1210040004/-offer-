package 面试.算法.leetcode.Q77Combinations;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    List<List<Integer>> res = new ArrayList<>();

    public List<List<Integer>> combine(int n, int k) {
        // 从1 到n 中选k个数
        if (n<=0 || k<=0 || k>n){
            return res;
        }
        List<Integer> list   = new ArrayList<>();
        generateConbinations(n,k,1,list);
        return res;
    }
    // 当前已经找到的组合存储在c 中，需要从start 开始搜索新的元素
    private  void generateConbinations(int n , int k, int start,List<Integer> c){
        if (c.size()==k) {
            res.add(new ArrayList<>(c));
            return;
        }
        for (int i = start; i <=n ; i++) {
            c.add(i);
            generateConbinations(n,k,i+1,c);
            c.remove(c.size()-1);
        }
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        List<List<Integer>> combine = s.combine(4, 2);
        for (List<Integer> integers : combine) {
            for (Integer integer : integers) {
                System.out.print(integer+"->");
            }
            System.out.println();
        }
    }

}
