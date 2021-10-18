package chapter10.interfaceex;

public abstract class Calculator implements Calc {
    // 메소드를 전체 구현을 하지 않기 때문에 abstract

    @Override
    public int add(int num1, int num2) {
        return num1 + num2;
    }

    @Override
    public int substract(int num1, int num2) {
        return num1 - num2;
    }

}
