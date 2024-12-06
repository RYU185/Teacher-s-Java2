package CodingTest_2;

import java.util.ArrayList;
import java.util.List;

public class Library {
    private String name;
    private List<Book> books;

    public Library(String name) {
        this.name = name;
        this.books = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
        System.out.println("책 등록: " + book.getTitle());
    }

    public void displayBooks() {
        System.out.println("도서관: " + name);
        for (Book book : books) {
            book.displayDetails();
        }
    }

    public void lendBook(String title) {
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                if (book instanceof PrintedBook) {
                    ((PrintedBook) book).lend();
                } else if (book instanceof EBook) {
                    ((EBook) book).access();
                }
                return;
            }
        }
    }

    public void returnBook(String title) {
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title) && book instanceof PrintedBook) {
                ((PrintedBook) book).returnBook();
                return;
            }
        }
    }
}
