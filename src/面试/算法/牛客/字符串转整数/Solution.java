package 面试.算法.牛客.字符串转整数;

public class Solution {
/**
 * 将字符串转换成整数
 */
    public int StrToInt(String str) {
        try{
            Integer integer = Integer.valueOf(str);
            return integer;
        }catch (Exception e){
            return 0;
        }

    }
}
