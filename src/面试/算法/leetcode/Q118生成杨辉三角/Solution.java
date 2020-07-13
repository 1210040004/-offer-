package 面试.算法.leetcode.Q118生成杨辉三角;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result=new ArrayList<List<Integer>>();
        for (int i=0;i<numRows;i++){
            ArrayList<Integer> sub=new ArrayList<Integer>();
            for (int j=0;j<=i;j++){
                //第一个位置和最后一个位置的元素为1
                if (j==0 || j==i){
                    sub.add(1);
                }else {
                    //上一行的元素进行相加
                    sub.add(result.get(i-1).get(j-1)+result.get(i-1).get(j));
                }
            }
            result.add(sub);
        }
        return result;
    }
}
