package 面试.算法.尚硅谷刷题.动态规划.背包问题;

public class beibao {

    public static void main(String[] args) {
        int[] w ={1,4,3};//物品的重量
        int[] val = {1500,3000,2000}; // 物品的价值
        int m = 4;// 背包的容量
        int n = val.length; // 物品的个数

        // 创建二维数组
        // v[i][j]表示在前i个物品中能够装入j容量背包的最大值
        int[][] v= new int[n+1][m+1];
        // 初始话第一行第一列
        for (int i = 0; i < v.length; i++) {
            v[i][0]=0;
        }
        for (int i = 0; i < v[0].length; i++) {
            v[0][i]=0;
        }
        printmap(v);
        for (int i = 1; i < v.length; i++) {
            for (int j = 1; j < v[0].length; j++){
                // 从第一列开始的，j是从1开始的
                if(w[i-1]>j){
                    v[i][j]=v[i-1][j];
                }else {
                    // 说明：
                    // 因为i 是从1开始的，因此公式需要调整成下面这段代码
                    v[i][j]=Math.max(v[i-1][j],val[i-1]+v[i-1][j-w[i-1]]);
                }
            }
        }
        System.out.println();
        printmap(v);
        System.out.println(v[v.length-1][v[0].length-1]);
    }
    // 背包问题的解决
    //
    // 背包最多只能4磅重量，请问最多可以放多少的东西进去

    private  static void printmap(int[][] map){
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[0].length; j++) {
                System.out.print(map[i][j]+" ");
            }
            System.out.println();
        }
    }
}
