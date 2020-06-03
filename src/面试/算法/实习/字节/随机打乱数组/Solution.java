package 面试.算法.实习.字节.随机打乱数组;

import java.util.Arrays;
import java.util.Random;

public class Solution {

    private static Random rand = new Random();

    public static <T> void swap(T[] a, int i, int j){
        T temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

    public static <T> void shuffle(T[] arr) {
        int length = arr.length;
        for ( int i = length; i > 0; i-- ){
            int randInd = rand.nextInt(i);
            swap(arr, randInd, i - 1);
        }
    }

    public static void main(String[] args) {
        Integer[] arr = {1, 2, 3, 4, 5, 6, 7};
        for (int i = 0; i < 10; i++) {
            shuffle(arr);
            System.out.println(Arrays.toString(arr));
        }
    }
}
