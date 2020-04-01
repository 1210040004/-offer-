package 面试.算法.公司真题.vivo.跳盒子;
import java.io.*;

/**
 * Welcome to vivo !
 */
public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String inputStr = br.readLine();
        int input[] = parseInts(inputStr.split(" "));
        int output = solution(input);
        System.out.println(output);
    }

    private static int[] parseInts(String[] strArr) {
        if (strArr == null || strArr.length == 0) {
            return new int[0];
        }
        int[] intArr = new int[strArr.length];
        for (int i = 0; i < intArr.length; i++) {
            intArr[i] = Integer.parseInt(strArr[i]);
        }
        return intArr;
    }
    //现在小v从左边第一个盒子上开始体验游戏，请问最少需要移动几次能到最后一个盒子上？
    private static int solution(int[] input) {
        // TODO Write your code here
        int n = input.length;
        int[] f= new int[n];
        f[0]=0;
        for (int i = 1; i < n; i++) {
            f[i]=Integer.MAX_VALUE;
            for (int j = 0; j < i; j++) {
                if(j+input[j]>=i){
                    f[i]=Math.min(f[i],f[j]+1);
                }
            }
            if(f[i]==Integer.MAX_VALUE){
                return -1;
            }
        }
        return f[n-1];
    }
}