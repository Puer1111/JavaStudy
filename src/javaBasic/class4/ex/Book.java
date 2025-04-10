package javaBasic.class4.ex;

public class Book {
    String title;
    String author;
    int page;

    Book(){
        this.title="";
        this.author="";
    }

    public Book (String title, String author, int page) {
        this.title = title;
        this.author = author;
        this.page = page;
    }

    public Book (String title, String author) {
        this(title, author, 0);
    }
    void displayInfo() {
        System.out.println("제목: " + title + ", 저자: " + author +", 페이지 수 : " + page);
    }
}
