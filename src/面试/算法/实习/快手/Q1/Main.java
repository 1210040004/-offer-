package 面试.算法.实习.快手.Q1;

import java.lang.management.LockInfo;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        while (sc.hasNext()){
            String s = sc.next();
            if (s==null||s.length()==0){
                System.out.println(0+" "+0+" "+0);
            }
            solution(s);
        }
    }

    private static void solution(String s) {
        char[] c = s.toCharArray();
        int totalcount=0;
        int countpattern=0;
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < c.length; i++) {

           if (c[i]=='('||c[i]==')'){
               if (c[i]=='('){
                   stack.add('(');
               }
            if (!stack.isEmpty()&&c[i]==')'){
                stack.pop();
                countpattern++;
            }

            totalcount++;
        }
        }
        System.out.println(countpattern+" "+stack.size()+" "+(totalcount-countpattern*2-stack.size()));
    }
}
