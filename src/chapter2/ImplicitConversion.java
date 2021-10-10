package chapter2;

public class ImplicitConversion {
    public static void main(String[] args) {
        // 묵시적 형변환
        byte bNum = 10; // byte 는 3
        int num = bNum; // int 는 4

        System.out.println(num);

        long lNum = 10; // 4바이트 가 8바이트인 long형으로 저장되어있음
        float fNum = lNum;

        System.out.println(fNum);

        double dNum = fNum + num;
        System.out.println(dNum); // double형으로 형변환 됨
        // 적은 수에서 큰수로는 자연스럽게 된다.

        // 명시적 형변환

    }

}
