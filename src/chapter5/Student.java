package chapter5;

public class Student {
    // 클래스 이름은 대문자로
    int studentID;
    String studentName; // jdk에서 제공하는 클래스
    int grade;
    String address;

    public Student() {
    }

    public Student(int id, String name) {
        // 객체가 생성될 떄 무조건 수행되어야 할 것들
        studentID = id;
        studentName = name;
    }
    // 기본 생성자, JVM이 알아서 넣어줌
    // 특징
    // 매개변수가 없음
    // 생성자가 하나도 없어야 생김

    public void showStudentInfor() {
        System.out.println(studentName + "," + address);
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String name) {
        studentName = name;
    }

    // public static void main(String[] args) {
    // Student st = new Student(); // 클래스 생성
    // st.address = "서울시 ";
    // st.studentName = "김재윤";
    // st.showStudentInfor();
    // }

    // public static void main(String[] args) {

    // int i = 10; // primitive data type

    // Student student = new Student();
    // student.studentName = "이순신";
    // student.studentID = 100;
    // student.address = "서울시 영등포구 여의도동";

    // Student studentKim = new Student();
    // studentKim.studentName = "김유신";
    // studentKim.studentID = 101;
    // studentKim.address = "미국 산호세";

    // student.showStudentInfor();
    // studentKim.showStudentInfor();
    // }

}
