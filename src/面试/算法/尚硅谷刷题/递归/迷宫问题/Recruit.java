package 面试.算法.尚硅谷刷题.递归.迷宫问题;

public class Recruit {
    public static void main(String[] args) {
            test(4);
    }
    public static void test(int n){
        if(n>2){
            test(n-1);
        }
        System.out.println("n="+n);
    }
    /**
     * 递归需要遵守的重要规则
     * 1 执行一个干法创建一个新的受保护的独立空间
     * 2 方法的局部变量是独立的，不会相互影响
     * 3 如果方法中使用的是引用类型变量，就会共享这个应用了类型的数组
     * 4 递归必须向推出递归的条件逼近，否则会出现无线递归，向着StackOverflow的方
     * 5 当一个方法执行完毕，或者遇到return 就会返回谁调用返回给谁，同时方法执行完毕或者返回的时候这个方法也就执行完毕
     */
}
