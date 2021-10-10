package chapter3;

public class OperationEx3 {
    public static void main(String[] args) {

        int num1 = 10;
        int i = 2;

        // 앞에 항이 true 여도 뒤에것도 실행함
        boolean value = ((num1 = num1 + 10) < 10) || ((i = i + 2) > 10);
        System.out.println(value);
        System.out.println(num1);
        System.out.println(i);
    }

}
