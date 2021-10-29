package chapter13.innerclass;

class Outer {

    int outNum = 100;
    static int sNum = 200;

    Runnable runnable = new Runnable() {

        @Override
        public void run() {
            System.out.println("runnable");
        }
    };

    public Runnable getRunnable(int i) {
        // 지역 내부 클래스
        int localNum = 100;
        // class MyRunnable implements Runnable {
        return new Runnable() {

            @Override
            public void run() {

                outNum += 10;

                System.out.println(outNum);
                System.out.println(sNum);
                System.out.println(localNum);
                System.out.println(i);
            }

        };

        // return new MyRunnable();

    }
}

public class LocalInnerTest {
    public static void main(String[] args) {

        Outer outer = new Outer();
        // outer.getRunnable(20).run();
        Runnable runnable = outer.getRunnable(20);
        runnable.run();

        outer.runnable.run();
    }

}
