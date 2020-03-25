package 面试.算法.尚硅谷刷题.递归.八皇后问题;

public class Queen8 {
    // 定义一个max 表示有多少个皇后
    static int max = 8;
    static int totalNum=0;
    // 定义一个数组array， 保存皇后位置的结果
    static int[] array = new int[max];
    public static void main(String[] args) {
        check(0);
        System.out.println(totalNum);
    }

    // 一个方法， 放置 第N个皇后
    // 特别注意： check 每一次递归的时候，进入check都有一个for 循环
    private static void  check(int n){
        if(n==max){  // n==8 防止第九个皇后的时候，前面八个皇后已经放好了
            print();
            totalNum++;
            return ;
        }
        // 依次放入皇后并判断是否冲突
        for (int i = 0; i < max; i++) {
            // 先把当前的皇后n，放到该行的第1列
            array[n]=i;
            //判断当防止第n个皇后到i列时，是否冲突
            if (judge(n)){ // 不冲突
                check(n+1);
            }
            // 如果冲突会继续执行这个i++ 去填下一列去了, 即将第n个皇后放在本行的下一列

        }
    }




    //查看当我们防止第N个皇后的时候，就去检测该皇后是否和前面已经摆放的皇后冲突

    /**
     *
     * @param n 表示第N个皇后
     * @return
     */
    private static boolean judge(int n){
        for (int i = 0; i < n; i++) {
            //  判断arr[i]== arr[n] 表示第n个皇后与前面n-1个皇后是否在同一列
            // Math.abs(n-i)==Math.abs(array[n]-array[i]) 表示判断第n个皇后和第i个皇后是否在同一条斜线
            // n=1 防止在第二列，1 n=1 arr[1] =1
            // 3 是否在同一行不需要去做
            if(array[i]==array[n] || Math.abs(n-i)==Math.abs(array[n]-array[i])){ // 同一列
                return false;
            }
        }
        return true;
    }

    // 一个方法，可以将皇后摆放的位置打印出来
    private static void print(){
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]+" ");
        }
        System.out.println();
    }

        
}
