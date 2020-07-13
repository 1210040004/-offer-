package 面试.算法.leetcode.Q846一手顺子;

import java.util.Arrays;
import java.util.TreeMap;

/**
 * @author wcx
 */
public class Solution {
    /**
     * 爱丽丝有一手（hand）由整数数组给定的牌。 
     *
     * 现在她想把牌重新排列成组，使得每个组的大小都是 W，且由 W 张连续的牌组成。
     *
     * 如果她可以完成分组就返回 true，否则返回 false。
     *
     *  
     *
     * 示例 1：
     *
     * 输入：hand = [1,2,3,6,2,3,4,7,8], W = 3
     * 输出：true
     * 解释：爱丽丝的手牌可以被重新排列为 [1,2,3]，[2,3,4]，[6,7,8]。
     * 示例 2：
     *
     * 输入：hand = [1,2,3,4,5], W = 4
     * 输出：false
     * 解释：爱丽丝的手牌无法被重新排列成几个大小为 4 的组。
     *  
     *
     * 提示：
     *
     * 1 <= hand.length <= 10000
     * 0 <= hand[i] <= 10^9
     * 1 <= W <= hand.length
     *
     * @param hand
     * @param W
     * @return
     */
    public static boolean isNStraightHand(int[] hand, int W) {
        TreeMap<Integer,Integer> count = new TreeMap<>();
        for (int i : hand) {
            if (!count.containsKey(i)){
                count.put(i,1);
            }else{
                count.put(i,count.get(i)+1);
            }
        }
        while(count.size()>0){
            int first = count.firstKey();
            for (int i = first; i < first+W; ++i) {
                if (!count.containsKey(i)) {
                    return false;
                }
                int c = count.get(i);
                if (c==1){
                    count.remove(i);
                } else {
                    count.replace(i,c-1);
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[] arr ={1,2,3,6,2,3,4,7,8};
        System.out.println(isNStraightHand(arr, 3));
    }
}
