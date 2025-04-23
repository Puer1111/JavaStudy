package javaMiddle.class4.wrapper.ex;

public class Test1 {
    public static void main(String[] args) {
        String str1 = "10";
        String str2 = "20";

        Integer intStr1 = Integer.parseInt(str1);
        Integer intStr2 = Integer.parseInt(str2);

        Integer answer =  intStr1 + intStr2;
        System.out.println(answer);



    }
}
