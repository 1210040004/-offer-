package 面试.算法.实习.字节.上125台阶;

public class Solution {
    public int findPath(int n){
        // 1 2 5 上台接问题
       if (n<=0){
           throw new RuntimeException("不可能上的去");
       }
       if (n==1){
           return 1 ;
       }
       if (n==2){
           return 2;
       }
       int[] f = new int[n+1];
       return  1;
    }
}
