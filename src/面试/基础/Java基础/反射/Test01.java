package 面试.基础.Java基础.反射;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class Test01 extends  Object{
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException {
        Class<?> c1 = Class.forName("面试.基础.Java基础.反射.User");
        Class<?> c2 = Class.forName("面试.基础.Java基础.反射.User");
        Class<?> c3 = Class.forName("面试.基础.Java基础.反射.User");
        Class<?> c4 = Class.forName("面试.基础.Java基础.反射.User");
        Class<?> c5 = Class.forName("面试.基础.Java基础.反射.User");
        System.out.println(c1.hashCode());
        System.out.println(c2.hashCode());
        System.out.println(c3.hashCode());
        System.out.println(c4.hashCode());
        System.out.println(c5.hashCode());
    }
}
// 实体类 pojo ,entity
class User{
    private  String name;
    private int id;

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", age=" + age +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public User(String name, int id, int age) {
        this.name = name;
        this.id = id;
        this.age = age;
    }

    private int age;
}
