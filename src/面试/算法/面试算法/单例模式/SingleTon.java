package 面试.算法.面试算法.单例模式;

public class SingleTon {
    public SingleTon() {
    }
    private static class SingleTonHolder{
        private  static SingleTon getInstance = new SingleTon();
    }
    private static  SingleTon getInstance(){
        return SingleTonHolder.getInstance;
    }
}
/**静态内部类的优点是：外部类加载时并不需要立即加载内部类，
 * 内部类不被加载则不去初始化INSTANCE，故而不占内存。即当SingleTon第一次被加载时，并不需要去加载SingleTonHoler，只有当getInstance()方法第一次被调用时，才会去初始化INSTANCE,第一次调用getInstance()方法会导致虚拟机加载SingleTonHoler类，
 * 这种方法不仅能确保线程安全，也能保证单例的唯一性，同时也延迟了单例的实例化。
 */

