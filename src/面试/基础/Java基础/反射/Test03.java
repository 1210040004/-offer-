package 面试.基础.Java基础.反射;

import 面试.其他.枚举.Student;

// class类的创建方式
public class Test03 {
    public static void main(String[] args) throws ClassNotFoundException {
        Person person = new student();
        System.out.println("这个人是"+person.name);
        // 1 通过对象获取
        Class<? extends Person> c1 = person.getClass();
        // 2 forname
        Class<?> c2 = Class.forName("面试.基础.Java基础.反射.student");
        System.out.println(c1.hashCode());
        System.out.println(c2.hashCode());
        // 3 类名.class
        Class<student> studentClass = student.class;
        System.out.println(studentClass.hashCode());
        // 4 基本内置类型的包装类 Type
        Class<Integer> c4 = Integer.TYPE;
        System.out.println(c4);
        // 5 获得父类类型
        Class<?> c5 = c1.getSuperclass();
        System.out.println(c5.hashCode());
        Class<?> c6 = Class.forName("面试.基础.Java基础.反射.Person");
        System.out.println(c6.hashCode());

    }
}
class Person{
    String name;

    public Person() {
    }

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
class student extends  Person{
    public student() {
        this.name = "学生";
    }
}
class  Teacher extends  Person{
    public  Teacher(){
        this.name = "老师";
    }
}