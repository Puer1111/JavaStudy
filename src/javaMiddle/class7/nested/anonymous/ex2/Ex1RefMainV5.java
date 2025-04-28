package javaMiddle.class7.nested.anonymous.ex2;

import java.util.Random;

public class Ex1RefMainV5 {
        // LambDa 로 바꿔보자.

    public static void hello(Process process) {
        System.out.println("프로그램 시작");

        process.run();

        System.out.println("프로그램 종료");
    }

    public static void main(String[] args) {

        hello(() -> {
                // 코드 조각
                int rand = new Random().nextInt(6) + 1;
                System.out.println("주사위 = " + rand);
                // 종료
        });

        hello(() -> {
                // 코드 조각
                for (int i = 1; i <= 3; i++) {
                    System.out.println("i =" + i);
                }
                // 종료
        });
        // 에로우 함수처럼 메서드만 전달한다.
    }
}
