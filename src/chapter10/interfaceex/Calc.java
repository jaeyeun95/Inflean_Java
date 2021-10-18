package chapter10.interfaceex;

public interface Calc {
    // final이 생략됨
    double PI = 3.14;
    int ERROR = -9999999;

    // 인터페이스 안에 선언되면 다 추상메소드
    int add(int num1, int num2);

    int substract(int num1, int num2);

    int tiems(int num1, int num2);

    int devide(int num1, int num2);

}
