package 面试.算法.实习.远景智能.Q1.Q2;

import java.sql.Struct;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc =new Scanner( System.in);
        int n = sc.nextInt();
        ArrayList<Student> list= new ArrayList<Student>();
        for (int i = 0; i < n; i++) {
            Student s= new Student(sc.nextInt(),sc.nextInt());
            list.add(s);
        }
        Collections.sort(list, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                if(o1.score>o2.score){
                    return 1;
                }
                if(o1.score==o2.score && o1.num>o2.num){
                    return 1;
                }
                return -1;
            }
        });
        for (Student student : list) {
            System.out.println(student.num+" "+student.score);
        }
    }
    static class Student{
        int num;
        int score;
        Student(int num, int score){
            this.num=num;
            this.score=score;
        }
    }
}
