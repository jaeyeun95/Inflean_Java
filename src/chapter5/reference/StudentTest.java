package chapter5.reference;

public class StudentTest {
    public static void main(String[] args) {

        Student studentJames = new Student(100, "James");
        studentJames.setKorea("국어", 100);
        studentJames.setMath("수학", 200);

        Student studentThomas = new Student(101, "Thomas");
        studentThomas.setKorea("국어", 80);
        studentThomas.setMath("수학", 60);

        studentJames.showStudentInfo();
        studentThomas.showStudentInfo();

    }
}