package 面试.算法.leetcode.Q540有序数组中的单一元素;

import java.util.HashMap;

/**
 * 给定一个只包含整数的有序数组，每个元素都会出现两次，唯有一个数只会出现一次，找出这个数。
 *
 * 示例 1:
 *
 * 输入: [1,1,2,3,3,4,4,8,8]
 * 输出: 2
 * 示例 2:
 *
 * 输入: [3,3,7,7,10,11,11]
 * 输出: 10
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/single-element-in-a-sorted-array
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class Solution {
    public int singleNonDuplicate(int[] nums) {

        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            if (!map.containsKey(num)){
                map.put(num,1);
            }else {
                map.put(num, map.get(num)+1);
            }
        }
        for (Integer i : map.keySet()) {
            if (map.get(i)==1){
                return i;
            }
        }
        return  -1;
    }
    public  static int singleNonDuplicate2(int[] nums) {
        //用二分的方法去查找
        int l = 0, r =nums.length-1;
        while(l<r){
            int m =(l+r)/2;
            if (m%2 ==1 ){
                m--; // 保证1 /h/m 都在偶数位，查找区间大小一致都是奇数
            }
            if (nums[m ]== nums[m+1]){
                l = m+2;
            }else {
                r = m;
            }
        }
        return nums[l];
    }
    public static void main(String[] args) {
        int[] arr= {1,1,2,3,3,4,4,8,8};
        System.out.println(singleNonDuplicate2(arr));
    }

}
