package chapter12.collection.arraylist;

import java.util.ArrayList;

class MyQueue {
    private ArrayList<String> arrayQ = new ArrayList<>();

    public void enQueue(String data) {
        arrayQ.add(data);
    }

    public String deQueue() {
        int len = arrayQ.size();

        if (len == 0) {
            System.out.println("큐가 비었습니다.");
            return null;
        }

        return arrayQ.remove(len - 1);
    }

    public String peek() {
        int len = arrayQ.size();

        if (len == 0) {
            System.out.println("큐가 비었습니다.");
            return null;
        }

        return arrayQ.get(len - 1);

    }

}

public class QueueTest {
    public static void main(String[] args) {

    }

}
