package chapter10.interfaceex;

public class CalculatorTest {
    public static void main(String[] args) {

        int num1 = 10;
        int num2 = 2;

        Calculator calc = new CompleteCalc();
        // Calc calc = new CompleteCalc();
        // 인스턴스와 추상클래스는 인스턴스화 할 수 없음.
        // Clac cal1 = new Calc();
        // Clac cal12 = new Calculator();
        System.out.println(calc.add(num1, num2));
    }

}
