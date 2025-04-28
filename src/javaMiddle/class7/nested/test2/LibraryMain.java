package javaMiddle.class7.nested.test2;

public class LibraryMain {
    public static void main(String[] args) {
        Library lib = new  Library(4);
        lib.addBook("책1" , "저자1");
        lib.addBook("책2" , "저자2");
        lib.addBook("책3" , "저자3");
        lib.addBook("책4" , "저자4");
        lib.addBook("책5" , "저자5");
        lib.addBook("책6" , "저자6");
        lib.showBooks();
    }
}
