package chapter6.staticex;

public class StudentTest1 {
    public static void main(String[] args) {

        System.out.println(Student.getSerialNum());

        Student james = new Student();
        System.out.println(james.StudentId);

        Student tomas = new Student();
        System.out.println(tomas.StudentId);

        System.out.println(Student.getSerialNum());
        // static 변수를 참조할 때는 클래스 이름으로 참조하는 걸 추천한다.
        System.out.println(tomas.getSerialNum());

    }

}
