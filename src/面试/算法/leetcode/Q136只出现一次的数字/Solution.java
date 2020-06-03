package 面试.算法.leetcode.Q136只出现一次的数字;

import java.util.HashMap;
import java.util.Map;

/**
 * 给定一个非空整数数组，除了某个元素只出现一次以外，其余每个元素均出现两次。找出那个只出现了一次的元素。
 *
 * 说明：
 *
 * 你的算法应该具有线性时间复杂度。 你可以不使用额外空间来实现吗？
 *
 * 示例 1:
 *
 * 输入: [2,2,1]
 * 输出: 1
 * 示例 2:
 *
 * 输入: [4,1,2,1,2]
 * 输出: 4
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/single-number
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class Solution {

        public int singleNumber(int[] nums) {
            Map<Integer, Integer> map = new HashMap<>();
            for (Integer i : nums) {
                Integer count = map.get(i);
                count = count == null ? 1 : ++count;
                map.put(i, count);
            }
            for (Integer i : map.keySet()) {
                Integer count = map.get(i);
                if (count == 1) {
                    return i;
                }
            }
            return -1; // can't find it.
        }
}
