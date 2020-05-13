package 面试.算法.leetcode.Q914;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;

/**
 * 给定一副牌，每张牌上都写着一个整数。
 *
 * 此时，你需要选定一个数字 X，使我们可以将整副牌按下述规则分成 1 组或更多组：
 *
 * 每组都有 X 张牌。
 * 组内所有的牌上都写着相同的整数。
 * 仅当你可选的 X >= 2 时返回 true。
 *
 */
public class Solution {
    public static boolean hasGroupsSizeX(int[] a) {
        if(a.length<2){
            return false;
        }
        Arrays.sort(a);
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < a.length; i++) {
            if (!map.containsKey(a[i])){
                map.put(a[i],1);
            }else {
                map.put(a[i],map.get(a[i])+1);
            }
        }
        Collection<Integer> values = map.values();
        Object[] val = values.toArray();
        int temp=0;
        temp=gcd((int) val[0],(int) val[1]);
        for (int i = 2; i < val.length; i++) {
           temp=gcd(temp,(int)val[i]);
        }
        return temp>=2;
    }
    private static int gcd(int a, int b) {
        return b == 0 ? a : gcd(b, a % b);
    }

    public static void main(String[] args) {
      int[] arr= {1,2,3,4,4,3,2,1};
      hasGroupsSizeX(arr);
    }
}
