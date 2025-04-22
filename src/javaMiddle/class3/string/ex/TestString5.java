package javaMiddle.class3.string.ex;

public class TestString5 {
    public static void main(String[] args) {
        String str = "hello.txt";
        String ext = ".txt";

        int extIndex = str.indexOf(ext);
        String fileName = str.substring(0,extIndex);
        String fileType = str.substring(extIndex);
        System.out.println("fileName = " + fileName);
        System.out.println("fileType = " + fileType);
    }
}
