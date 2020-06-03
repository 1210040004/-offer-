package 面试.算法.实习.字节.求平方根指定精确度;

public class Solution {
    public double method(double target, double m) {
        double min,max,mid,newMid;
        min = 1;
        max = target;
        mid = (min+max) / 2;

        do {
            if (mid*mid<target) {
                min = mid;
            } else {
                max = mid;
            }
            newMid = mid;
            mid = (max+min)/2;
        } while (abs(mid,newMid)>m);
        return mid;
    }

    public double abs(double a, double b) {
        if (a>b) return a-b;
        else return b-a;
    }

    public static void main(String[] args) {
        System.out.println(new Solution().method(20,1));
        System.out.println(Math.sqrt(20));
    }
}
