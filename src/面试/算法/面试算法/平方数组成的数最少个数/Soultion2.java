package 面试.算法.面试算法.平方数组成的数最少个数;

public class Soultion2 {
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            System.out.print(minT(i)+" ");
            if (i%10==0){
                System.out.println();
            }
        }
    }
    private static int minT(int n){
        if((int)Math.sqrt(n)*(int)Math.sqrt(n)==n){
//            System.out.println("平方数："+n);
            return 1;
        }
        //如果不是平方数，则说明需要拆分
        if(n==0)return 0;
        if(n==1)return 1;
        if(n==2)return 2;
        int[] dp=new int[n+1];//存储1-(n-1)所需的次数
        dp[0]=0;
        dp[1]=1;
        dp[2]=2;
        int min=0;
        for(int i=3;i<=n;i++){
            if((int)Math.sqrt(i)*(int)Math.sqrt(i)==i){
                dp[i]=1;
//                System.out.println("i是平方数："+i);
            }else{
                min=Integer.MAX_VALUE;
                for(int j=1;j<=i/2;j++){
                    min=Math.min(min,dp[j]+dp[i-j]);
                }
                dp[i]=min;
            }
        }
        return dp[n];
    }
}
