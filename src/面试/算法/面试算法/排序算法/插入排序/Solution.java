package 面试.算法.面试算法.排序算法.插入排序;

public class Solution {
    // 插入排序的思想
    //
    public static void main(String[] args) {
        int[] a={101,34,119,1};
    }

    public static  void insertSort(int[] arr){
        // 使用逐步推到的方式来理解
        // 第一轮{101,34,119,1}; => {34，101，119，1}

        // 定义待插入的数
        int insertVal =arr[1];
        int insertIndex = 1-1; // arr[1] 的前面的数的下标
        // 给insertVal 找到插入的位置
        // 保证在给insertVal 插入位置的时候 不越界
        while(insertIndex>=0){
            // 1 insertIndex >=0 保证在给insertVal 找插入位置，不越界
             // 2 insertval < arr[insertIndex]  待插入的数， 还没有找到插入位置
            // 3 就需要arr[insertIndex] 后移
            if(insertIndex >= 0 && insertVal >arr[insertIndex]){
                arr[insertIndex+1] =arr[insertIndex];
                insertIndex--;
            }
            // 当退出while 循的时候 说明插入的位置找到

        }

    }
}
