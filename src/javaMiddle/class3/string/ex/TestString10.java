package javaMiddle.class3.string.ex;

public class TestString10 {
    public static void main(String[] args) {
        String fruits = "apple,banana,Orange";
        String[] fruitsArray = fruits.split(",");

        for(String fruit : fruitsArray){
            System.out.println(fruit);
        }
        System.out.print("Join: " + String.join("->", fruitsArray));
    }
}
