package chapter9.abstractex;

public class ComputerTest {
    public static void main(String[] args) {

        // 추상 클래스는 인스턴스화 할 수 없어서 에러
        // Computer c1 = new Computer();

        Computer c2 = new DeskTop();
        // Computer c3 = new NoteBook();

        NoteBook c4 = new MyNoteBook();
        c2.display();
        c4.display();

    }
}
