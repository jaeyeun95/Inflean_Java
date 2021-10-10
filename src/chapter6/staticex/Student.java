package chapter6.staticex;

public class Student {

    private static int serialNum = 10000;

    int StudentId;
    String studentName;

    public Student() {
        serialNum++;
        StudentId = serialNum;
    }

    public static int getSerialNum() {
        int i = 10; // 지역변수

        i++;
        System.out.println(i);

        // studentName = "홍길동"; // 멤버변수, 인스턴스 변수
        // 스태틱 메소드 안에서는 인스턴스 변수를 사용할 수없음

        return serialNum; // static 변수, 클래스 변수
    }

}
