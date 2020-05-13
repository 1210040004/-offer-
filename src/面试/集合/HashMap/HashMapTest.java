package 面试.集合.HashMap;

import java.util.ArrayList;
import java.util.HashMap;

public class HashMapTest {
    public static void main(String[] args) {

        HashMap<String, String> hashmap = new HashMap<>(); // 用到了数组，需要一个下标，put 方法没有指定下标。

        hashmap.put("123","123"); // key -> hashcode()

        hashmap.get("123");  // 对大数取余的方式去算出数组的下标。 hashcode % table.length 这个下标的特点。 index --0-7 0,1,2,3,4....

        ArrayList<Integer>  arrayList = new ArrayList<>();
        //可以add 进去，带下标的，和不带下标的。
        // 不带下标就是index+1；
        // element[index++] = value; 通过这样的方法去确定下标。
        // 一开始没有初始化。
        // 插入很快，带来的问题。
        //get效率会低，需要遍历数组中的元素去找到key
        
    }
}
