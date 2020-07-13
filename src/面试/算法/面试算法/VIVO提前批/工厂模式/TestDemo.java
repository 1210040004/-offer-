package 面试.算法.面试算法.VIVO提前批.工厂模式;

class huawei extends  PhoneCakll{

    @Override
    public void call() {
        System.out.println("华为手机");
    }
}
class vivo extends  PhoneCakll{

    @Override
    public void call() {
        System.out.println("vivo手机");
    }
}
class oppo extends  PhoneCakll{

    @Override
    public void call() {
        System.out.println("oppo手机");
    }
}
public class TestDemo {
    public static void main(String[] args) {
        PhoneCakll phoneCakll = null;
        phoneCakll = new huawei();
        phoneCakll.call();
    }
}
