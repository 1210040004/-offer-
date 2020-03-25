package 面试.算法.真题.vivo2020.第三题;

import java.io.*;

/**
 * Welcome to vivo !
 */

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String inputStr = br.readLine();
        int output = solution(inputStr );
        System.out.println(output);
    }

    private static int solution(String str) {
        // 总括号减掉右括号
        int totalNum=0;
        int countleft=0;
        int countright=0;
        for (int i = 0; i < str.length() && str.charAt(i)!='0'; i++) {
           totalNum++;
           if(str.charAt(i)=='('){
               countleft++;
           }else {
               countright++;
           }
        }
        return countleft-countright;
    }
}