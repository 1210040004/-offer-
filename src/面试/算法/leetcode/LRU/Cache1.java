package 面试.算法.leetcode.LRU;

import java.util.HashMap;

class LRUCache {
    class Node{
        Node next ;
        Node pre;
        int key ;
        int value;
        Node(int k, int v){
            next = this;
            pre = this;
            key = k;
            value = v;
        }
    }
    HashMap<Integer,Integer> map = new HashMap<>();
    int capacity;
    Node head;
    public LRUCache(int capacity) {
        this.capacity  =capacity;
        head = new Node(-1,-1);
    }

    public int get(int key) {
        if (!map.containsKey(key)) return -1;
        Integer node = map.get(key);
        return node;
    }

    public void put(int key, int value) {

    }
}
