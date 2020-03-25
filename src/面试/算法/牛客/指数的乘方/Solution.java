package 面试.算法.牛客.指数的乘方;

public class Solution {
    public double Power(double base, int exponent) {
        double res =1;
        if(base == 0 && exponent <0){
            throw new RuntimeException("底数为0的情况指数不能为0");
        }
        else if(base == 0 && exponent ==0){
            throw new RuntimeException("无定义");
        }
        else if (base == 0 && exponent >0) {
            return 0;
        }
        else if(exponent == 0){
            return 1;
        }
        else if(exponent >0 ){
            while (exponent > 0){
                res*=base;
                exponent--;
            }
        }
        else if(exponent < 0){
            exponent =exponent*-1;
            while (exponent > 0){
                res*=base;
                exponent--;
            }
            res = 1/res;
        }
        return res;
    }
}