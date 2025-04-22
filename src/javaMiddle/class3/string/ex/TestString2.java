package javaMiddle.class3.string.ex;

import java.util.Arrays;

public class TestString2 {
    public static void main(String[] args) {
        String[] arr = {"hello","java","jvm","spring","jpa"};
        int num = 0;
        for(String str:arr){
            System.out.println("length Of Each array = " + str.length());
            num += str.length();
        }
            System.out.println("array length = " + num);
    }
}
