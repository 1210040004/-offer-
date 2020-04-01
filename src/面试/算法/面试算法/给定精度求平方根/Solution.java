package 面试.算法.面试算法.给定精度求平方根;

public class Solution {


    static public void main(String[] args) {
        System.out.println(sqrt(2, 2));
    }



    public static double sqrt(int t, int precise) {

        if (t < 0) {
            throw new RuntimeException("Negative number cannot have a sqrt root.");
        }

        //先确定当前数所处的最小整数区间
        int i = 0;
        for ( ; i <= t; i++) {
            if (i * i == t) {
                return i;
            }
            if(i * i > t){
                break;
            }
        }

        //再通过二分法来进行判断检测
        double low = i-1, high = i;
        double middle, squre;
        while (precise>0) {
            precise--;
            middle = (low + high) / 2;
            squre = middle * middle;

            if (squre > t) {
                high = middle;
            } else {
                low = middle;
            }
        }
        return (low + high) / 2;
    }
}



