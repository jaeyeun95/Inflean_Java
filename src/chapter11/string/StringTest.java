package chapter11.string;

public class StringTest {
    public static void main(String[] args) {

        String str1 = new String("java");
        String str2 = new String("android");

        System.out.println(System.identityHashCode(str1));
        str1 = str1.concat(str2);

        System.out.println(str1);
        System.out.println(System.identityHashCode(str1));
        // String str1 = new String("abc");
        // String str2 = new String("abc");

        // // == 주소값이 같은지
        // System.out.println(str1 == str2);

        // // 문자열 상수로 선언하면 두개는 동일한 메모리를 갖는다.
        // String str3 = "abc";
        // String str4 = "abc";
        // System.out.println(str3 == str4);
    }

}
