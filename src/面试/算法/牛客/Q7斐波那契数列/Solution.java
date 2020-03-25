package 面试.算法.牛客.Q7斐波那契数列;

public class Solution {
    public int Fibonacci(int n) {
        if(n==0||n==1){
            return n;
        }
        if (n==2){
            return 1;
        }
        int[] res= new int[n+1];
        res[1]=1;
        res[2]=1;
        if(n>=3){
            for (int i = 3; i <=n ; i++) {
                res[i]=res[i-1]+res[i-2];
            }
        }
        return res[n];
    }

}
