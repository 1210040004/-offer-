package 面试.jvm.单例;

public class Solution {
    private volatile static  Solution instance = null;

    private Solution() {
    }
    public Solution getInstance(){
        if (instance== null){
            synchronized (Solution.class){
                if (instance== null){
                    instance = new Solution();
                }
            }
        }
        return instance;
    }
}
