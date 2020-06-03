package 面试.算法.实习.字节.字符串转数字;

/**
 * 将一个字符串转换成一个整数，要求不能使用字符串转换整数的库函数。 数值为0或者字符串不是一个合法的数值则返回0
 * 输入描述:
 * 输入一个字符串,包括数字字母符号,可以为空
 * 输出描述:
 * 如果是合法的数值表达则返回该数字，否则返回0
 *
 */
public class Solution {


    public  static int StrToInt(String str) {
        if (str.length() == 0 ||str == null){
            return 0;
        }
        long result = 0;

        for(int i=0;i < str.length();i ++){
            char c=str.charAt(i);
            if(c >= '0' && c <= '9'){
                result = result*10 + c-'0';
            }else if(result != 0){
                return 0;
            }
        }
        result=str.charAt(0)=='-'? -result:result;
        if(result > Integer.MAX_VALUE || result < Integer.MIN_VALUE){
            return 0;
        }
        return (int)result;
    }

    public static void main(String[] args) {
        System.out.println(Integer.MIN_VALUE);
        System.out.println(StrToInt("-2147483649"));
    }
}
