package chapter7.array;

public class ArrayTest {
    public static void main(String[] args) {

        int[] number = new int[10];
        // int number[] = new int[10];

        number[0] = 1;
        number[1] = 2;
        number[2] = 3;

        // 배열 초기화
        int[] number2 = new int[] { 0, 1, 2 };

        for (int i = 0; i < number2.length; i++) {
            System.out.println("number2 : " + number[i]);
        }
        // System.out.println(number2.length);

        double[] studentIDs = new double[5];

        for (int i = 0; i < studentIDs.length; i++) {
            System.out.println(studentIDs[i]);
        }

    }

}
