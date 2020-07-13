package 面试.算法.实习.字节.剪绳;

public class Solution3 {
    public int cutRope(int target) {
        if (target<2){
            return 0;
        }
        if (target==2){
            return 1;
        }
        if (target ==3){
            return 2;
        }
        int[] f = new int[target+1];
        f[1] = 1;
        f[2] = 2;
        f[3] = 3;
        for (int i = 4; i <= target; i++) {
            int max = 0;
            for (int j = 1; j <=i/2 ; j++) {
                int num = f[j]*f[i-j];
                if (max<num){
                    max = num;
                    f[i] = max;
                }
            }
        }
        return f[target];
    }
}
