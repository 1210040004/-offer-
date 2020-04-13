package 面试.算法.leetcode.Q20有效的括号;

import java.util.Stack;

public class Solution2 {

        public boolean isValid(String s) {
            if(s==null || s.length()==0){
                return true;
            }
            int n = s.length();
            if(n%2==1){ return false;}
            Stack<Character> t = new Stack<>();
            for(int i =0;i<n;i++){
                char c = s.charAt(i);
                if(c=='(' || c=='{' ||c=='['){
                    t.add(c);
                }else{
                    if(c==')'){
                        if(t.isEmpty() || t.pop()!='(') return false;
                    }
                    if(c=='}'){
                        if(t.isEmpty() || t.pop()!='{') return false;
                    }
                    if(c==']'){
                        if(t.isEmpty() || t.pop()!='[') return false;
                    }
                }

            }
            return t.isEmpty();
        }

}
