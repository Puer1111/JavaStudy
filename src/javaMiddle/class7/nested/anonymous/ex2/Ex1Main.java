package javaMiddle.class7.nested.anonymous.ex2;

import java.util.Random;

public class Ex1Main {
    public static void helloDice(){
        System.out.println("프로그램 시작");

        // 코드 조각
        int rand = new Random().nextInt(6)+1;
        System.out.println("주사위 = " + rand);
        // 종료

        System.out.println("프로그램 종료");
    }
    public static void helloSum(){
        System.out.println("프로그램 시작");

        // 코드 조각
        for (int i = 1; i <= 3; i++) {
            System.out.println("i =" + i);
        }
        // 종료

        System.out.println("프로그램 종료");
    }

    public static void main(String[] args) {
        helloDice();
        helloSum();
    }
}
