package 面试.算法.实习.字节.拥有糖果最多的孩子;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    public  static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max = 0;
        for (int candy : candies) {
            if (candy > max) {
                max =candy;
            }
        }
        Boolean[] f=  new Boolean[candies.length];
        int temp = 0;
        for (int candy : candies) {
            if (candy+extraCandies>=max){
                f[temp++]=true;
            }else {
                f[temp++] = false;
            }
        }

        List<Boolean> res = Arrays.asList(f);
        return res;
    }

    public static void main(String[] args) {
        int[] arr ={2,3,5,1,3};
        kidsWithCandies(arr,3   );
    }
}
