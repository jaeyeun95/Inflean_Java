package chpater14.exception;

public class AutoCloseTest {
    public static void main(String[] args) {
        try (AutoCloseObj obj = new AutoCloseObj()) {
            throw new Exception(); // 의도적으로 예외를 부르는 경우
        } catch (Exception e) {
            System.out.println("exception");
        }

    }

}
