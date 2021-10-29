package chapter13.lambda;

@FunctionalInterface
public interface MyNumber {
    // 함수형 인터페이스인 경우는 메서드를 하나만 선언해야한다.
    int getMaxNumber(int num, int num2);

}
