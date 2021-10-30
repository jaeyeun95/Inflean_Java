package chapter13.stream;

import java.util.Arrays;
import java.util.stream.IntStream;

public class IntArrayTest {
    public static void main(String[] args) {

        int[] arr = { 1, 2, 3, 4, 5 };

        // stream은 재사용 할 수 없다.
        IntStream stream = Arrays.stream(arr);
        // int sum = Arrays.stream(arr).sum();
        int sum = stream.sum();
        System.out.println(sum);

        int count = (int) Arrays.stream(arr).count();
        System.out.println(count);
    }

}
