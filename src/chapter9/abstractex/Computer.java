package chapter9.abstractex;

public abstract class Computer {
    // abstract 메소드를 가지고 있으면 class도 abstract 선언을 해줘야 한다.
    public abstract void display(); // 구현은 안하고 선언만

    public abstract void typing();

    public void turnOn() {
        System.out.println("전원을 켭니다.");
    }

    public void turnOff() {
        System.out.println("전원을 끕니다.");
    }

}
