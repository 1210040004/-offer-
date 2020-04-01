package 面试.算法.公司真题.vivo.报数;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Welcome to vivo !
 */

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String inputStr = br.readLine();
        int input[] = parseInts(inputStr.split(" "));
        String output = solution(input);
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

    private static String solution(int[] input) {
        // TODO Write your code here
        // 报数
        int count = 0;//存储上一个分配到学号的位置
        int input1 = input[1];//
        int input0 = input[0];//
        List<Integer> list = new ArrayList<>();
        StringBuilder result = new StringBuilder();
        //List<Integer> keyList = new ArrayList<>();
        for(int e=1;e<=input0;e++){
            list.add(e);
        }
        for(int i=1;list.size()>0;i++){
            if(i%input1==0){
                result.append(list.remove(count)+" ");
            }else {
                count++;
            }
            if(count>=list.size()){
                count-=list.size();
            }
        }
        //String result = keyList.toString();
        /*result=result.replaceAll("\\[","").replaceAll("\\[","");
        result=result.replaceAll("]","").replaceAll("]","");
        result=result.replaceAll(",","").replaceAll(",","");*/
        return result.toString();
    }
}