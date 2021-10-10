package chapter7.array.arraylist;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StudentTest {
    public static void main(String[] args) {

        Student a = new Student(1001, "Lee");
        a.addSubject("국어", 100);
        a.addSubject("수학", 90);

        a.showStudentInfo();

        System.out.println("-------------------------");

        Student b = new Student(1002, "Kim");
        b.addSubject("국어", 100);
        b.addSubject("수학", 90);
        b.addSubject("영어", 80);

        b.showStudentInfo();

        Map test = new HashMap<>();

    }

}
