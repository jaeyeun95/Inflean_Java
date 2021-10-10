package chapter8.inheritance;

public class Circle {

    Point point; // has - a

    private int radius;

    // 이것은 합성
    public Circle() {
        point = new Point();
    }

}
