package chapter4.loopExample;

public class ForExample {
    public static void main(String[] args) {

        // int num = 1;
        // int sum = 0;

        // while (num <= 10) {

        // sum += num;
        // num++;
        // }
        // System.out.println(sum);
        // System.out.println(num);

        // while문을 for문으로
        // for (num = 1; num <= 10; num++) {

        // sum += num;
        // }
        // System.out.println(sum);
        // System.out.println(num);

        // 구구단
        // int dan;
        // int times;

        // for (dan = 2; dan <= 9; dan++) {

        // for (times = 1; times <= 9; times++) {
        // System.out.println(dan + "X" + times + "=" + dan * times);
        // }
        // System.out.println();
        // }

        // while 구구단
        int dan = 2;
        int times = 1;

        while (dan <= 9) {
            if ((dan % 2) != 0) {
                dan++;
                continue;
            }
            times = 1;
            while (times <= 9) {
                System.out.println(dan + "X" + times + "=" + dan * times);
                times++;
            }
            dan++;
            System.out.println();
        }

    }

}
