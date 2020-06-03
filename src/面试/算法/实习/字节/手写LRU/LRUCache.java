package 面试.算法.实习.字节.手写LRU;

import javax.sound.sampled.Line;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

public class LRUCache  {
    //Least Recently Used
    LinkedHashMap<Integer,Integer> map;
    private int capacity;
    public LRUCache( int capacity) {
        map = new LinkedHashMap<>(capacity, 0.75F, true);
        this.capacity = capacity;
    }

    public int get(int key) {
        if (!map.containsKey(key)){
            return -1;
        }
        return map.get(key);
    }

    public void put(int key, int value) {
        map.put(key,value);
        if (map.size()>capacity){
            Iterator<Integer> iterator = map.keySet().iterator();
            map.remove(iterator.next());
        }
    }
}
