package chapter2;

public class ExplicitConversion {
    public static void main(String[] args) {

        int iNum = 1000;
        byte bNum = (byte) iNum;

        // 큰수에서 작은수로 대입을 하면 오류가 날 수도 있음
        System.out.println(iNum);
        System.out.println(bNum);

        double dNum = 3.14;
        iNum = (int) dNum;
        System.out.println("iNum :: " + iNum);
        float fNum = 0.9f;

        int num1 = (int) dNum + (int) fNum; // 각각 int형으로 바꾸고 계산
        int num2 = (int) (dNum + fNum); // 더하고 나서 int형으로

        System.out.println("num1 :: " + num1);
        System.out.println("num2 :: " + num2);

    }
}