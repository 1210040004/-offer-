package 面试.算法.leetcode.字节;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

public class Solution {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int groups = sc.nextInt();
            sc.nextLine();
            ArrayList<Boolean> res = new ArrayList<>();
            for(int i= 0;i<groups;i++){
                String s = sc.nextLine();
                String t = sc.nextLine();
                String[] s1 = s.split(" ");
                String[] s2 = t.split(" ");
                int[] int1 = getS1Int(s1);
                int[] int2 = getS1Int(s2);
                boolean b = IsPopOrder(int1, int2);
                res.add(b);
            }
        for (Boolean re : res) {
            if (re==true){
                System.out.println("Y");
            }else {
                System.out.println("N");
            }
        }
    }

    private static int[] getS1Int(String[] s) {
        int[] f = new int[s.length];
        for (int i = 0; i < f.length; i++) {
            f[i] = Integer.parseInt(s[i]);
        }
        return f;
    }

    public static  boolean IsPopOrder(int [] pushA,int [] popA) {
        if (pushA.length==0 || popA.length==0){
            return false;
        }
        Stack<Integer> s = new Stack<>();
        int  index =0;
        for (int i = 0; i < pushA.length; i++) {
            s.add(pushA[i]);
            while(!s.isEmpty() && s.peek()==popA[index]){
                index++;
                s.pop();
            }
        }
        return s.isEmpty();
    }
}
