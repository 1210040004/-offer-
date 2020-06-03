package 面试.算法.leetcode.是否是丑数;

public class Solution {
    public boolean isUgly(int num) {
    // 只包含质因数2，3，5的数
        if (num<=0){
            return false;
        }
        int[] arr ={2,3,5};
        for (int i : arr) {
            while(num%i==0){
                num/=i;
            }
        }
        if (num==1){
            return true;
        }
        return false;
    }
}
