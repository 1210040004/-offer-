package 面试.算法.牛客.字符流中第一个出现一次的字符串;


import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Solution {
    //Insert one char from stringstream
    HashMap<Character,Integer> map = new HashMap<>();
    public void Insert(char ch)
        {
        map.put(ch,map.containsKey(ch)?map.get(ch)+1:1);
    }
    //return the first appearence once char in current stringstream
    public char FirstAppearingOnce()
    {   char c='#';
        Set<Map.Entry<Character, Integer>> entries = map.entrySet();
        for (Map.Entry<Character, Integer> entry : entries) {
            if (entry.getValue()==1){
                c=entry.getKey();
                return c;
            }
        }
        return c;
    }

}