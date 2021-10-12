package chapter9.abstractex;

public class DeskTop extends Computer {
    // abstract 로 추상 클래스가 되거나 상속받아서 메소드를 선언해라

    @Override
    public void display() {
        System.out.println("DeskTop display()");
    }

    @Override
    public void typing() {
        System.out.println("DeskTop typing()");
    }

    // public void turnOn(){
    // System.out.println("DestTop turnOn()");
    // }

}
