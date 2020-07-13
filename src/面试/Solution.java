package 面试;

import com.sun.xml.internal.fastinfoset.tools.XML_SAX_StAX_FI;

import java.util.Scanner;

public class Solution {
    static int max = 0;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            String s1 = sc.next();
            String s2 = sc.next();
            int result = getLen(s1, s2);
            System.out.println(result);
        }
    }

    public static int getLen(String s1, String s2) {
        if (s1 == null || s2 == null || s1.length() < s2.length()) {
            return 0;
        }
        char[] c1 = s1.toCharArray();
        char[] c2 = s2.toCharArray();
        int left = 0;
        int right = 0;
        int match = c2.length;
        int res = Integer.MAX_VALUE;
        int[] map = new int[256];
        for (int i = 0; i < c2.length; i++) {
            map[c2[i]]++;
        }
        while (right < c1.length) {
            map[c1[right]]--;
            if (map[c1[right]] >= 0) {
                match--;
            }
            if (match == 0) {
                while (map[c1[left]] < 0) {
                    map[c1[left++]]++;
                }
                res = Math.min(res, right - left + 1);
                match++;
                map[c1[left++]]++;
            }
            right++;
        }
        if (res==Integer.MAX_VALUE){
            return 0;
        }else {
            return res;
        }
    }
}
