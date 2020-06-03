package 面试.算法.leetcode.LRU;

import java.util.Iterator;
import java.util.LinkedHashMap;

 class LRUCache12 {
    LinkedHashMap<Integer,Integer> map;
    int capacity;
    public LRUCache12(int capacity) {
        map = new LinkedHashMap<>(capacity+1,0.75f,true);
        this.capacity = capacity;
    }

    public int get(int key) {
        if(!map.containsKey(key)) return -1;
        return map.get(key);
    }

    public void put(int key, int value) {
        map.put(key,value);
        if(map.size()>capacity){
            Iterator it = map.keySet().iterator();
            map.remove(it.next());
        }
    }
}
