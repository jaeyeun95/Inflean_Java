package chapter6.singleton;

public class Company {
    // 여러개가 있으면 안되고 변하면 안되는 값이기 때문에
    private static Company instance = new Company();

    private Company() {
    }

    public static Company getInstance() {
        return instance;
        // 메소드로 해서 밖에서 호출할수 있다.
        // static으로 선언해야 다른곳에서 생성하고 호출 가능
    }
    // 외부에서 호출 못하게 하겠다.
}
