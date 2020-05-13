package 面试.算法.leetcode.Q455分发饼干;

import java.util.Arrays;

public class Solution {
    public static int findContentChildren(int[] g, int[] s) {
        // 尝试把最大的饼干去满足最贪心的小朋友
        // g表示小盆友的贪心指数，s表示饼干的大小
        Arrays.sort(g);
        Arrays.sort(s);
        int m = g.length-1;
        int n = s.length-1;
        int count =0;
        while(m>=0 && n>=0){
            while(m>=0 && n>=0 && s[n]>=g[m]){
                m--;
                n--;
                count++;
            }
            if (m>=0 && n>=0 && s[n]<g[m]){
                m--;
            }
        }
        return count;
    }
    public static int findContentChildren2(int[] g, int[] s) {
        // 尝试把最大的饼干去满足最贪心的小朋友
        // g表示小盆友的贪心指数，s表示饼干的大小
        Arrays.sort(g);
        Arrays.sort(s);
        int i = g.length-1;
        int j = s.length-1;
        int count = 0;
        while(i>=0 && j>=0){
            while(i>=0 && j>=0 && s[j]>=g[i]){
                i--;
                j--;
                count++;
            }
            if (i>=0 && j>=0 && s[j]< g[i]){
                i--;
            }
        }
        return count;
    }


    public static void main(String[] args) {
        int[] g= {10,9,8,7};
        int[] s={5,6,7,8};
        int contentChildren = findContentChildren(g, s);
        System.out.println(contentChildren);
    }
}
