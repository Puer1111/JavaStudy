package javaMiddle.class3.string.ex;

public class TestString4 {
    public static void main(String[] args) {
        String str = "hello.txt";
        String fileName = str.substring(0,5);
        String fileType = str.substring(5,9);
        System.out.println("fileName = " + fileName);
        System.out.println("fileType = " + fileType);

    }
}
