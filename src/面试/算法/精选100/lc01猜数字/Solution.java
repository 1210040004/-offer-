package 面试.算法.精选100.lc01猜数字;

public class Solution {
    public int game(int[] guess, int[] answer) {
        int res = 0;
        for (int i = 0; i < 3; i++) {
            if (guess[i]==answer[i]){
                res++;
            }
        }
        return res;
    }
}
