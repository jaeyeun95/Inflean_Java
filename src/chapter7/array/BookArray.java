package chapter7.array;

import chapter7.array.Book;

public class BookArray {
    public static void main(String[] args) {

        Book[] library = new Book[5];

        for (int i = 0; i < library.length; i++) {
            System.out.println(library[i]);
        }

        library[0] = new Book("태백산맥1", "조정재");
        library[1] = new Book("태백산맥2", "조정재");
        library[2] = new Book("태백산맥3", "조정재");
        library[3] = new Book("태백산맥4", "조정재");
        library[4] = new Book("태백산맥5", "조정재");

        for (int i = 0; i < library.length; i++) {
            System.out.println(library[i]);
        }

        for (int i = 0; i < library.length; i++) {
            library[i].showBookInfo();
        }

    }

}
