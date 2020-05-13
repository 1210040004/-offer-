package 面试.算法.leetcode.一次编辑;

public class Solution {
    public  static boolean oneEditAway(String first, String second) {
        int l1 = first.length();
        int l2 = second.length();
        if (Math.abs(l1-l2)>1){
            return false;
        }
        else if (l1==l2){
            int count =0;
            for (int i = 0; i < l1; i++) {

                if (first.charAt(i)!=second.charAt(i)){
                    count++;
                    if (count>=2){
                        return false;
                    }

                }
            }
        }
        else {
            int different = 0;
            int i = 0;
            int j = 0;
            while (i < first.length() && j < second.length()) {
                if (first.charAt(i) != second.charAt(j)) {
                    different++;
                    if (different > 1) {
                        return false;
                    } else {
                        if (first.length() > second.length()) {
                            j--;
                        } else {
                            i--;
                        }
                    }
                }
                i++;
                j++;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        oneEditAway("islander","slander");
    }
}
