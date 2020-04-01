package 面试.算法.尚硅谷刷题.贪心算法;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class Solution {
    public static void main(String[] args) {
        //创建广播电台和集合,放入到一个HashMap里面去管理
        HashMap<String, HashSet<String>> broadcast = new HashMap<>();
        // 将各个电台放入broadcast里面去
        HashSet<String> hashset1 = new HashSet<>();
        hashset1.add("北京");
        hashset1.add("上海");
        hashset1.add("天津");
        HashSet<String> hashset2 = new HashSet<>();
        hashset2.add("广州");
        hashset2.add("北京");
        hashset2.add("深圳");
        HashSet<String> hashset3 = new HashSet<>();
        hashset3.add("成都");
        hashset3.add("上海");
        hashset3.add("杭州");
        HashSet<String> hashset4 = new HashSet<>();
        hashset4.add("上海");
        hashset4.add("天津");
        HashSet<String> hashset5 = new HashSet<>();
        hashset5.add("杭州");
        hashset5.add("大连");

        broadcast.put("k1",hashset1);
        broadcast.put("k2",hashset2);
        broadcast.put("k3",hashset3);
        broadcast.put("k4",hashset4);
        broadcast.put("k5",hashset5);
         HashSet<String> allAreas = new HashSet<>();
         allAreas.add("北京");
         allAreas.add("上海");
         allAreas.add("天津");
         allAreas.add("深圳");
         allAreas.add("杭州");
         allAreas.add("成都");
         allAreas.add("大连");
         allAreas.add("广州");
         // 存放电台集合
        ArrayList<String> selects = new ArrayList<>();
        // 定义一个临时的集合，保存在遍历过程中，存放遍历过程中的电台覆盖的地区和当前还没有覆盖的地区的交集
        HashSet<String> tempSet = new HashSet<>();
        // 定义Maxkey， 保存在一次遍历过程中，能够覆盖最大未覆盖地区对应的电台的key
        // 如果max 不为空。 那么会加入selects  里面
        String maxKey=null;
        while (allAreas.size()!=0){ // 如果allAreas 不为0 则表示还没有覆盖到所有的地区
            //
            maxKey=null;
            // 遍历broadcasts,取出对应的key
            for (String key : broadcast.keySet()) {
                tempSet.clear();
                // 当前key 能够覆盖的地区
                HashSet<String> areas = broadcast.get(key);
                tempSet.addAll(areas);
                // 求tempset 和 allAreas 集合的交集,交集会赋给tempset
                tempSet.retainAll(allAreas);
                // 当前集合的未覆盖地区的数量比maxkey指向的未覆盖的地区的集合还要多，
                // maxkey 就需要重置
                // 贪心算法的特点，每次都选最优的解
                if(tempSet.size()>0 && (maxKey==null || tempSet.size()>broadcast.get(maxKey).size())){
                    maxKey=key;
                }
            }
            // maxkey 不为null 就把
            if(maxKey!=null){
                selects.add(maxKey);
                // 将maxkey 指向的广播电台覆盖的地区从allareas 里面清除掉
                allAreas.removeAll(broadcast.get(maxKey));
            }
        }
        System.out.println("得到的选择结果是"+selects);
    }
}
