package 面试.算法.尚硅谷刷题.递归.迷宫问题;

import javax.crypto.spec.PSource;

public class MiGong {
    public static void main(String[] args) {
        // 先创建一个二维数组，模拟迷宫
        int[][] map= new int[8][7];
        // 使用1表示墙
        // 上下全部置为1;
        for (int i = 0; i < 7; i++) {
            map[0][i]=1;
            map[7][i]=1;
        }
        for (int i = 0; i < 8; i++) {
            map[i][0]=1;
            map[i][6]=1;
        }
        System.out.println("地图");

        map[3][1]=1;
        map[3][2]=1;
//        map[1][2]=1;
//        map[2][2]=1;
        printmap(map);
        // 使用递归回溯给小球找路
        setWay2(map,1,1);
        // 输出新的地图，小球走过，并表示过的地图
        System.out.println("标识过的地图");
        printmap(map);
    }
    private  static void printmap(int[][] map){
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 7; j++) {
                System.out.print(map[i][j]+" ");
            }
            System.out.println();
        }
    }

    /**
     * 1 map表示地图
     * 2 ij 表示从地图的哪个位置开始出发
     * 3 如果小球可以到map[6][5] 这个位置说明通路找到
     * 4 约定： map[i][j]=0的时候表示该点没有走过
     *   当为1 的时候表示墙， 为2 的时候表示通路
     *   3 表示已经走过，但是走不通
     * 5 在走迷宫的时候需要确定一个策略，
     *  下-》右-》上—》左 这样的走路方式
     *
     *
     * @param map
     * @param i
     * @param j
     * @return 如果找到通路就返回true 否则返回false
     */
    public static boolean setWay(int[][] map, int i,int j){
        // 递归的出口
        if (map[6][5]==2){
            return true;
        }else {
            if(map[i][j]==0){  // 如果当前的点没有走过
                // 按照策略走 下   右    上   左
                map[i][j]=2; //假定这个点可以走得通如果走不通要回溯
                if (setWay(map,i+1,j)) { //向下走
                    return true;
                }else if(setWay(map,i,j+1)){ //向右
                    return true;
                }else if (setWay(map,i-1,j)){//向上
                    return true;
                }else if(setWay(map,i,j-1)){// 向左
                    return true;
                }else {// 说明这个点是走不通的死路
                    map[i][j]=3;
                    return false;
                }
            }else { // 如果map[i][j]!=0 , 可能是1，2，3
                return  false;
            }
        }
    }

    // 修改找路策略 改成 上   右    下左
    public static boolean setWay2(int[][] map, int i,int j){
        // 递归的出口
        if (map[6][5]==2){
            return true;
        }else {
            if(map[i][j]==0){  // 如果当前的点没有走过
                // 按照策略走 下   右    上   左
                map[i][j]=2; //假定这个点可以走得通如果走不通要回溯
                if (setWay(map,i,j-1)) { //向上走
                    return true;
                }else if(setWay(map,i,j+1)){ //向右
                    return true;
                }else if (setWay(map,i+1,j)){//向下
                    return true;
                }else if(setWay(map,i,j-1)){// 向左
                    return true;
                }else {// 说明这个点是走不通的死路
                    map[i][j]=3;
                    return false;
                }
            }else { // 如果map[i][j]!=0 , 可能是1，2，3
                return  false;
            }
        }
    }
}
/**
 * 如何得到最短路径如果改变策略，那么小球出迷宫的路径就会发生变化
 *  如何求出迷宫问题的最短路径
 *
 */
