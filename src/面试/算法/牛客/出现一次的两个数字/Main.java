package 面试.算法.牛客.出现一次的两个数字;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Main {
    public static void FindNumsAppearOnce(int [] array,int num1[] , int num2[]) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < array.length; i++) {
            map.put(array[i],(map.containsKey(array[i])?map.get(array[i])+1:1));
        }
        Set<Map.Entry<Integer, Integer>> entries = map.entrySet();
        ArrayList<Integer> list = new ArrayList<>();
        for (Map.Entry<Integer, Integer> entry : entries) {
            if (entry.getValue()==1){
                list.add(entry.getKey());
            }
        }
        num1[0]=list.get(0);
        num2[0]= list.get(1);
    }

    public static void main(String[] args) {
        int[] a={1,2,2,3,3,4,4,5};
        int[] b=new int[1];
        int[] c = new int[1];
        FindNumsAppearOnce(a,b,c);
    }
}
