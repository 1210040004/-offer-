package 面试.算法.牛客.矩阵中的路径;

public class Solution {
    public boolean hasPath(char[] matrix, int rows, int cols, char[] str)
    {
        //按照自己的思路来， 先构造一个rows*cols的二维数组
        char[][] arr= new char[rows][cols];
        int temp = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                arr[i][j] = matrix[temp++];
            }
        }
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
               boolean res =  findPath(arr,i,j,str,0);
               if (res == true){
                   return true;
               }
            }
        }
        return false;
    }

    private boolean findPath(char[][] arr, int i, int j, char[] str, int index) {
        if (index==str.length){
            // 出口条件
            return true;
        }
        if (i>=arr.length ||i<0 || j>=arr[0].length || j<0 || arr[i][j]!=str[index]){
            return false;
        }
        char c = arr[i][j];
        arr[i][j] = '.';
        boolean shang = findPath(arr,i-1,j,str,index+1);
        boolean xia = findPath(arr,i+1,j,str,index+1);
        boolean zuo = findPath(arr,i,j-1,str,index+1);
        boolean you = findPath(arr,i,j+1,str,index+1);
        arr[i][j]= c;

        return shang||xia||zuo||you;
    }


    public static void main(String[] args) {
        Solution s= new Solution();
        char[] matrix={'a','b','c','e','s','f','c','s','a','d','e','e'};
        char[] str = {'b','c','c','e','d'};
        boolean b = s.hasPath(matrix, 3, 4, str);
        System.out.println(b);
    }
}
