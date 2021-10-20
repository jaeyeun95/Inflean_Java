package chapter10.interfaceex;

public class CalculatorTest {
    public static void main(String[] args) {

        int num1 = 10;
        int num2 = 2;

        Calc calc = new CompleteCalc(); // <<-- client code라고 할 수 있음
        // Calculator calc = new CompleteCalc();

        // 인스턴스와 추상클래스는 인스턴스화 할 수 없음.
        // Clac cal1 = new Calc();
        // Clac cal12 = new Calculator();
        System.out.println(calc.add(num1, num2));

        calc.description();

        // static 메소드이기 때문에 인스턴화할 필요없이 바로 사용가능하다.
        int[] arr = { 1, 2, 3, 4, 5 };
        int sum = Calc.total(arr);
        System.out.println(sum);

    }

}
