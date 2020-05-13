package 面试.算法.leetcode.Q744比目标字母大的最小字母;

public class Solution {
    public char nextGreatestLetter(char[] letters, char target) {

         int l = 0 ;
         int r = letters.length-1;
         while(l<=r){
             int mid = l+(r-l)/2;
             if (letters[mid] <= target){
                 l = mid+1;
             }else {
                 r = mid -1;
             }
         }
         return l<r ? letters[l] : letters[0];
    }
    public char nextGreatestLetter2(char[] letters, char target) {
        if (letters[letters.length-1]<=target){
            return letters[0];
        } else {
            for (int i = 0; i < letters.length; i++) {
                if (letters[i]>target){
                    return letters[i];
                }
            }
            return letters[0];
        }
    }
}
