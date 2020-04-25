package 面试.算法.牛客.栈的压入弹出序列;

import java.util.Stack;

public class Main {
    public boolean IsPopOrder(int [] pushA,int [] popA) {
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
