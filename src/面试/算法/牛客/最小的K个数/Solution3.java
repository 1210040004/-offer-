package 面试.算法.牛客.最小的K个数;

import java.util.ArrayList;

public class Solution3 {
    public ArrayList<Integer> GetLeastNumbers_Solution(int [] input, int k) {
        ArrayList<Integer> res = new ArrayList<>();
        if (input.length==0 || input==null || k<=0 || k>input.length){
            return res;
        }
        for (int i = 0; i < k; i++) {
            for (int j = 0; j < input.length-i-1; j++) {
                if (input[j]<input[j+1]){
                    swap(input,j+1,j);
                }
            }
            res.add(input[input.length-i-1]);
        }
        return res;
    }
    public void swap(int[] arr, int i , int j ){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
