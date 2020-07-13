package 面试.设计模式.工厂模式;

public class AudiCarFactory  implements  carFactory{
    @Override
    public car getCar() {
        return  new audi();
    }
}
