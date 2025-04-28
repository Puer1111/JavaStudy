package javaMiddle.class7.nested.test2;

public class Library {
    private int libCount;
    private Book[] books;

    public Library(int libCount) {
        this.libCount = 0;
        this.books = new Book[libCount];
    }

    private static class Book {
        private String title;
        private String author;

        public Book(String title, String author) {
            this.title = title;
            this.author = author;
        }
    }

    public void addBook(String title, String author) {
        if(books.length <= libCount) {
            System.out.println("도서 보관이 불가능합니다. : " + title);
            return;
        }
            books[libCount++] = new Book(title, author);
    }

    public void showBooks() {

        System.out.println("== 책 목록 출력 ==");
        for(Book book : books) {
            System.out.println("제목:" + book.title + " 저지: " + book.author);
        }
    }

}
