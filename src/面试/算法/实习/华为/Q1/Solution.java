package 面试.算法.实习.华为.Q1;

import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        while(sc.hasNext()){
            String line = sc.next();
            if (line== null || line.length()==0){
                System.out.println("error.0001");
            }
            String[] s = line.split(",");
            HashMap<String,Integer>  map = new HashMap<>();
            for (int i = 0; i < s.length; i++) {
                if (!isTrue(s[i])){
                    System.out.println("error.0001");
                    return;
                }
                if (map.containsKey(s[i])){
                    map.put(s[i],map.get(s[i])+1);
                }else{
                    map.put(s[i],1);
                }
            }
            Set<Map.Entry<String, Integer>> entries = map.entrySet();
            Collection<Integer> values = map.values();
            int maxcount = 0;
            for (Integer value : values) {
                if (value>maxcount){
                    maxcount= value;
                }
            }

            ArrayList<String> res = new ArrayList<>();
            for (Map.Entry<String, Integer> entry : entries) {
                if (entry.getValue()==maxcount){
                    res.add(entry.getKey());
                }
            }
            Collections.sort(res);
            System.out.println(res.get(0));
            // 拿到了数量相同的数据
//            Collections.sort(res, new Comparator<String>() {
//                @Override
//                public int compare(String o1, String o2) {
//                    for (int i =0, j =0;i<o1.length() && j<o2.length();i++,j++){
//                        if (o1.charAt(i)>=o2.charAt(i));
//                    }
//                    return 0;
//                }
//            });
        }
    }

    private static boolean isTrue(String s) {
        if (s==null || s.length()==0){
            return false;
        }
        if (s.charAt(0)<'A' || s.charAt(0)>'Z'){
            return false;
        }
        for (int i = 1; i < s.length(); i++) {
            if (!Character.isLowerCase(s.charAt(i))){
                return false;
            }
        }
        return true;
    }
}
