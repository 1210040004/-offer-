package 面试.算法.实习.招行.Q2;
import java.util.Scanner;

public class Main2 {
    static int count = 0;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        int[] res = new int[T];
        for(int i=0; i<T; i++){
            String str = sc.next();
            int[] num = new int[str.length()];
            for(int j=0; j<str.length(); j++){
                num[j] = str.charAt(j)-'0';
            }
            int k = sc.nextInt();
            res[i] = signNum(num,k,0);
        }
        for(int i=0; i<T; i++){
            System.out.println(res[i]);
        }
    }

    public static int signNum(int[] num, int k, int index){
        if(index==num.length-1&&num[index]==k){
            count++;
        }
        if(index<num.length-1){
            int temp1 = signNum(num,k-num[index],index+1);
            int temp2 = signNum(num,k+num[index],index+1);
        }
        return count;
    }
}