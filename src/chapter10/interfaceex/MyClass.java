package chapter10.interfaceex;

public class MyClass implements MyInterface {

    @Override
    public void x() {
        System.out.println("x()");
    }

    @Override
    public void Y() {
        System.out.println("y()");
    }

    @Override
    public void myMethod() {
        System.out.println("myMethod()");
    }

    public static void main(String[] args) {
        MyClass myClass = new MyClass();

        // 어떤 타입에 적용됬냐에 따라서 호출할수있는 메소드가 다르다
        X xClass = myClass;
        xClass.x();

    }

}
