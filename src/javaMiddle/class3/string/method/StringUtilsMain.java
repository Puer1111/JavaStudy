package javaMiddle.class3.string.method;

import java.util.Arrays;

public class StringUtilsMain {
    public static void main(String[] args) {
        int num = 100;
        boolean bool = true;
        Object obj = new Object();
        String str = "Hello Java";

        // valueOf
        String numString = String.valueOf(num);
        System.out.println("숫자의 문자열 값: " + numString);
        String boolString = String.valueOf(bool); // "true"가 된다.
        System.out.println("불리언의 문자열 값 : " + boolString);
        String objString = String.valueOf(obj);
        System.out.println("객체의 문자열 값 :  " + objString);

        String numString2 = "" + num; // "100"
        System.out.println("문자 + 숫자 = 문자 :  " + numString2);

        // toCharArray
        char[] strArray = str.toCharArray();
        System.out.println("문자열을 문자 배열로 변환: " + strArray); // 이건 참조값이 나옴
        for(char c : strArray){
            System.out.print(c);
        }
    }
}
