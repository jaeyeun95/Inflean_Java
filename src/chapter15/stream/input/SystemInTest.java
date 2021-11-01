package chapter15.stream.input;

import java.io.IOException;

public class SystemInTest {
    public static void main(String[] args) {
        System.out.println("알파벳 여러개를 쓰고 엔터를 누르세요");
        int i =0;
        try {
            while((i = System.in.read()) != '\n')
                System.out.println((char)i);
            // i = System.in.read();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(i);
    }
}
