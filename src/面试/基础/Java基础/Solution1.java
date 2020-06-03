package 面试.基础.Java基础;

import java.util.Objects;

public class Solution1 {


    public static void main(String[] args) {
        Cat cat1 = new Cat("cat");
        Cat dog = new Cat("cat");
        System.out.println(cat1.equals(dog));
    }
}
class Cat{
    String name;

    public Cat(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cat cat = (Cat) o;
        return Objects.equals(name, cat.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}