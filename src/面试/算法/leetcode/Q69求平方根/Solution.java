package 面试.算法.leetcode.Q69求平方根;

public class Solution {
    public int mySqrt(int x) {
        if (x <= 1) {
            return x;
        }
        int l = 1, h = x;
        while (l <= h) {
            int mid = l + (h - l) / 2;
            int sqrt = x / mid;
            if (sqrt == mid) {
                return mid;
            } else if (mid > sqrt) {
                h = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        return h;
    }
    public  static int mySqrt2(int x) {
        if (x<=1){
            return x;
        }
        for (int i = 1; i < x; i++) {
            int pre = i * i;
            int next = (i+1)*(i+1);
            if (pre<=x && next>x){
                return i;
            }
        }
        throw  new RuntimeException("notfind");
    }

    public static void main(String[] args) {
        System.out.println(mySqrt2(2147395600));
    }
}
