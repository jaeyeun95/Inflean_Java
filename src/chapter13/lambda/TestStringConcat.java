package chapter13.lambda;

public class TestStringConcat {
    public static void main(String[] args) {
        // 객체지향 -> 여러번 사용할 경우
        StringConcatImpl sImpl = new StringConcatImpl();
        sImpl.makeString("hello", "java");

        // 람다식 -> 한번만 쓸경우
        StringConcat concat = (s1, s2) -> System.out.println(s1 + " " + s2);
        concat.makeString("hello", "java");

        // 익명 클래스 -> 한번만 쓸경우
        StringConcat concat2 = new StringConcat() {

            @Override
            public void makeString(String s1, String s2) {
                System.out.println(s1 + " " + s2);
            }

        };

        concat2.makeString("hello", "java");
    }

}
