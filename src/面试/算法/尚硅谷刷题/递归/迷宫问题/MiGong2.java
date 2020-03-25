package 面试.算法.尚硅谷刷题.递归.迷宫问题;

public class MiGong2 {
    public static void main(String[] args) {
        int[][] map = new int[8][8];
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                map[i][j]=0;
            }
        }
        initmap(map);
        map[3][1]=1;
        map[3][2]=1;
        printmap(map);
        System.out.println("路径");
        findPath(map,1,1);
        printmap(map);
    }

    /**
     *  * 1 map表示地图
     *      * 2 ij 表示从地图的哪个位置开始出发
     *      * 3 如果小球可以到map[6][5] 这个位置说明通路找到
     *      * 4 约定： map[i][j]=0的时候表示该点没有走过
     *      *   当为1 的时候表示墙， 为2 的时候表示通路
     *      *   3 表示已经走过，但是走不通
     *      * 5 在走迷宫的时候需要确定一个策略，
     *      *  下-》右-》上—》左 这样的走路方式
     *      *
     *      *
     * @param map
     * @return
     */
    private static boolean findPath(int[][] map,int i, int j) {
        int endchang = map.length-2;
        int endkuan = map[0].length-2;
        if(map[endchang][endkuan]==2){
            return true;
        }else {
            if (map[i][j]==0){ // 如果是没有走过的路 就按照下 右  上  左 的顺序来走
                map[i][j]=2;  // 上来先把当前的置为2，不管走没走过。
                if(findPath(map,i+1,j)){
                    return true;
                }else if(findPath(map,i,j+1)){
                    return true;
                }else if(findPath(map,i-1,j)){
                    return  true;
                }else if(findPath(map,i,j-1)){
                    return true;
                }else {
                    map[i][j]=3;
                    return false;
                }
            }
            else {
                return false;
            }
        }
    }

    private static void initmap(int[][] map) {
        int chang = map.length;
        int kuan = map[0].length;
        for (int i = 0; i < chang; i++) {
            map[i][0]=1;
            map[i][7]=1;
        }
        for (int i = 0; i < kuan; i++) {
            map[0][i]=1;
            map[7][i]=1;
        }
    }

    private  static void printmap(int[][] map){
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                System.out.print(map[i][j]+" ");
            }
            System.out.println();
        }
    }

}
