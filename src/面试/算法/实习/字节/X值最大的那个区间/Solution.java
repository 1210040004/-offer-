package 面试.算法.实习.字节.X值最大的那个区间;


public class Solution {
    public static int function(int[] arr) {
        int len = arr.length;
        int[] sum = new int[len];
        int ans = 0;
        for (int i = 0; i < len; i++) {
            //右边界
            sum[i] = arr[i];
            for (int j = i+1; j < len; j++) {
                if (arr[j] >= arr[i]) {
                    sum[i] += arr[j];
                } else {
                    break;
                }
            }
            //左边界
            for (int j = i-1; j >= 0;j--) {
                if (arr[j] >= arr[i]) {
                    sum[i] += arr[j];
                } else {
                    break;
                }
            }
            ans = Math.max(ans,sum[i]*arr[i]);
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] arr= {3,1,6,4,5,2};
        System.out.println(function(arr));
    }
}
