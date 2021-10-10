package chapter5;

public class StudentTest {
    public static void main(String[] args) {

        Student student = new Student(100, "이순신");
        // student.studentName = "이순신";
        // student.studentID = 100;
        student.address = "서울시 영등포구 여의도동";

        Student studentKim = new Student();
        studentKim.studentName = "김유신";
        studentKim.studentID = 101;
        studentKim.address = "미국 산호세";

        student.showStudentInfor();
        studentKim.showStudentInfor();

        System.out.println(student);
        System.out.println(studentKim);
    }

}
