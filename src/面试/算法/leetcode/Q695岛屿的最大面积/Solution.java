//package 面试.算法.leetcode.Q695岛屿的最大面积;
//
//
//import java.util.ArrayList;
//import java.util.Collections;
//
//class Solution {
//    public int maxAreaOfIsland(int[][] grid) {
//        ArrayList<Integer> res= new ArrayList<>();
//        for (int i = 0; i < grid.length; i++) {
//            for (int j = 0; j < grid[0].length; j++) {
//                if(grid[i][j]==1){
//                    int count =0;
//                    res.add(findcounts(grid,i,j,count));
//                }
//            }
//        }
//        if (res.size()==0){
//            return 0;
//        }
//        Collections.sort(res);
//        return res.get(0);
//    }
//
//    private Integer findcounts(int[][] arr, int i, int j, int count) {
//        if(i)
//    }
//}