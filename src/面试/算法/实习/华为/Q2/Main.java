package 面试.算法.实习.华为.Q2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String keyS=sc.next();//读取关键字字符串
        String allS=sc.next();//读取匹配的字符串
        String[] strings=allS.split("]");
        int allFail=0;
        for(int i=0;i<strings.length;i++){
            if(strings[i].charAt(0)==','){
                strings[i]=strings[i].substring(1);
            }
            if(strings[i].startsWith(keyS) && (strings[i].charAt(keyS.length())=='[')){
                allFail=1;
                if(strings[i].indexOf("addr")>0){
                    String[] subS=strings[i].split(",");
                    String ret="";
                    for(int j=0;j<subS.length;j++){
                        int indexOfEqual=subS[j].indexOf("=");
                        if(j<subS.length-1){
                            System.out.print(subS[j].substring(indexOfEqual+1)+" ");
                        }else{

                            System.out.print(subS[j].substring(indexOfEqual+1));
                        }

                    }
                    System.out.println();//换行
                }

            }
        }
        if(allFail==0) {//一个关键字都匹配不上
            System.out.println("FAIL");
            return;
        }
        sc.close();
    }
}
