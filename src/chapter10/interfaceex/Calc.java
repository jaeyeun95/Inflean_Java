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

    // 구현 코드를 가질 수 없기 때문에 default 선언이 필요
    default void description() {
        System.out.println("정수 계산기를 구현합니다.");
    }

    // static 을 가진 메소드는 인스턴스 생성과 상관없이 사용할수 있다.
    static int total(int[] arr) {
        int total = 0;

        for (int i : arr) {
            total += i;
        }
        return total;
    }

}
