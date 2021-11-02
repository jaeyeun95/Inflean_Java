package chapter15.stream.decorator;

import java.io.FileInputStream;
import java.io.IOException;

import chapter15.stream.outputstream.FileOutputStream;

public class FileCopyTest {
    public static void main(String[] args) {
        try (FileInputStream fis = new FileInputStream("a.exe"); FileOutputStream fos = new FileOutputStream("b.exe")) {
        } catch (IOException e) {
            System.out.println(e);
        }
    }

}
