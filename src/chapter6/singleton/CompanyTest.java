package chapter6.singleton;

public class CompanyTest {
    public static void main(String[] args) {

        Company c1 = Company.getInstance();
        Company c2 = Company.getInstance();

        System.out.println(c1);
        System.out.println(c2);

        // 실행 시켜보면 같은 주소값을 가지고 있다.
    }
}
