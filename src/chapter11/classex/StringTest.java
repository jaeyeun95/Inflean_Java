package chapter11.classex;

import java.io.File;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class StringTest {
    public static void main(String[] args) throws ClassNotFoundException {

        Class strClass = Class.forName("java.lang.String");

        // 해당 클래스의 기본 생성자들을 알수 있음
        Constructor[] cons = strClass.getConstructors();

        for (Constructor c : cons) {
            System.out.println(c);
        }

        Field[] fields = strClass.getFields();

        for (Field f : fields) {
            System.out.println(f);
        }

        Method[] methods = strClass.getMethods();

        for (Method m : methods) {
            System.out.println("method :  " + m);
        }

    }

}
