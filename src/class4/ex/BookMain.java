package class4.ex;

public class BookMain {
    public static void main(String[] args) {
        Book book1 = new Book("나무","베르나르",30);
        Book book2 = new Book("사과","뉴턴");

        book1.displayInfo();
        book2.displayInfo();
    }
}
