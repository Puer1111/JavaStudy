package javaMiddle.class3.string.ex;

public class TestString9 {
    public static void main(String[] args) {
        String email = "hello@answer.com";

        String[] parts = email.split("@");
        String idPart = parts[0];
        String namePart = parts[1];

        System.out.println("ID: " + idPart);
        System.out.println("Name: " + namePart);

    }
}
