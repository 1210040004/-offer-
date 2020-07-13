package 面试.算法.leetcode.Q763划分字母区间;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * 字符串 S 由小写字母组成。我们要把这个字符串划分为尽可能多的片段，同一个字母只会出现在其中的一个片段。返回一个表示每个字符串片段的长度的列表。
 *
 * 示例 1:
 *
 * 输入: S = "ababcbacadefegdehijhklij"
 * 输出: [9,7,8]
 * 解释:
 * 划分结果为 "ababcbaca", "defegde", "hijhklij"。
 * 每个字母最多出现在一个片段中。
 * 像 "ababcbacadefegde", "hijhklij" 的划分是错误的，因为划分的片段数较少。
 *
 */
public class Solution {
    public static List<Integer> partitionLabels(String S) {
        if (null == S || 0 == S.length()) {
            return null;
        }
        List<Integer> ans = new ArrayList<>();
        int len = S.length();
        int[] map = new int[26];
        char[] c = S.toCharArray();
        for (int i = 0; i < len; i++) {
            // 更新最后一个位置
            map[c[i] - 'a'] = i;
        }
        int left = 0;
        while (left < len) {
            int right = map[c[left]-'a'];
            for (int i = left; i <right ; i++) {
                 if ((map[c[i]-'a'])>right){
                     right = map[c[i]-'a'];
                 }
            }
            ans.add(right-left+1);
            left = right+1;
        }
        return ans;
    }

    public static void main(String[] args) {
        while(true) {
            int nextInt = new Random().nextInt(10);

        }
    }
}

