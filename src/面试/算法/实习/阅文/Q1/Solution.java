package 面试.算法.实习.阅文.Q1;

import java.util.ArrayList;
import java.util.Stack;

public class Solution {
    /**
     *
     * @param ops string字符串ArrayList 操作步骤
     * @return string字符串
     */
    public String doQueue (ArrayList<String> ops) {
        // write code here
        ArrayList<String> res= new ArrayList<>();
        StringBuilder sb  = new StringBuilder();
        for (String op : ops) {
            String[] split = op.split(" ");
            if (split[0].equals("push")){
                push(Integer.valueOf(split[1]));
            }else {
                Integer pop = pop();
                if (pop==null){
                    res.add("null");
                }else {
                    res.add(String.valueOf(pop));
                }
            }
        }
        for (int i = 0; i < res.size(); i++) {
            if (i!=res.size()-1){
                sb.append(res.get(i)+",");
            }else {
                sb.append(res.get(i));
            }

        }
        return sb.toString();

    }
    Stack<Integer> s1 = new Stack<Integer>();
    Stack<Integer> s2 = new Stack<Integer>();

    public void push(int node) {
        s1.push(node);
    }

    public Integer pop() {
        if(s2.isEmpty()){
            while(!s1.isEmpty()){
                s2.push(s1.pop());
            }
        }
        if (!s2.isEmpty()){
            return s2.pop();
        }
        return null;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        String s1 ="push 1";
        String s2 ="push 2";
        String s3 ="pop";
        String s4 ="pop";
        String s5 ="pop";
        String s6 ="push 3";
        ArrayList<String> ops = new ArrayList<>();
        ops.add(s1);
        ops.add(s2);
        ops.add(s3);
        ops.add(s4);
        ops.add(s5);
        ops.add(s6);

        String s7 = s.doQueue(ops);
        System.out.println(s7);
    }
}
