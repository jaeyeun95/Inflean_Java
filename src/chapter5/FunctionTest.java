package chapter5;

public class FunctionTest {
    public static void main(String[] args) {
        int num1 = 5;
        int num2 = 20;

        int sum = addNumber(num1, num2);

        if (sum < 30)
            System.out.println("30 미만입니다." + sum);
        else
            System.out.println("30 초과입니다." + sum);

    }

    public static int addNumber(int n1, int n2) {
        int result = n1 + n2;
        return result;
    }

}
