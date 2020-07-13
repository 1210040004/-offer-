package 面试.其他.枚举;

public class Student {
    public Student(){} // 私有化构造器
    static enum Studenttype{
        Instance;
        private Student student;
        private Studenttype(){
             student= new Student();
        }
        private Student getStudent(){
            return student;
        }
    }
    public static Student getInstance(){
        return Studenttype.Instance.getStudent();
    }

    public static void main(String[] args) {
        System.out.println(Student.getInstance());
        System.out.println(Student.getInstance());
        System.out.println(Student.getInstance());
        System.out.println(Student.getInstance());
    }
}
