package 面试.算法.leetcode.Q120三角形的最小路径和;

import java.util.Collections;
import java.util.List;

/**
 * 给定一个三角形，找出自顶向下的最小路径和。每一步只能移动到下一行中相邻的结点上。
 *
 * 相邻的结点 在这里指的是 下标 与 上一层结点下标 相同或者等于 上一层结点下标 + 1 的两个结点。
 *
 *  
 *
 * 例如，给定三角形：
 *
 * [
 *      [2],
 *     [3,4],
 *    [6,5,7],
 *   [4,1,8,3]
 * ]
 * 自顶向下的最小路径和为 11（即，2 + 3 + 5 + 1 = 11）
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/triangle
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class Solution {
    public int minimumTotal(List<List<Integer>> t) {
        if (t == null || t.size()==0){
            return  0;
        }
        int size = t.size();
        List<Integer> last = t.get(size - 1);
        int n = last.size();
        int[] f = new int[n];
        for (int i = 0; i < t.size(); i++) {
            List<Integer> tmp = t.get(i);

        }
        return 1;
    }
}
