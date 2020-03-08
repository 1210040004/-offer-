package 二维数组查找;

public class Solution {
    public boolean Find(int target, int [][] array) {
        int col = array.length; //列
        int row = array[0].length; // 行
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] == target){
                    return true;
                }
            }

        }
        return false;
    }

}
