package 面试.基础.Java基础;

public class Solution2 {
    public static void main(String[] args) {
        String str1 ="童话";
        String str2 = "重地";
        System.out.println(String.format("str1: %d | str2: %d",str1.hashCode(),str2.hashCode()));
        System.out.println(str1.equals(str2));
    }
}
