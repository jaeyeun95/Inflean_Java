package chapter4.loopExample;

public class WhileExample {
    public static void main(String[] args) {

        int num = 1;
        int sum = 0;

        do {

            sum += num; // sum을 초기화 안해서 에러가 뜨기 때문에 초기화를 해줘야 함
            num += 1; // num++; 와 같음
        } while (num < 1);

        System.out.println("1부터 10까지의 합은 " + sum + "입니다.");
    }

}
