package javaMiddle.class7.nested.anonymous.ex2;

import java.util.Random;

public class Ex1RefMainV4 {

    public static void hello(Process process) {
        System.out.println("프로그램 시작");

        process.run();

        System.out.println("프로그램 종료");
    }

    public static void main(String[] args) {

        hello(new Process() {
            @Override
            public void run() {
                // 코드 조각
                int rand = new Random().nextInt(6) + 1;
                System.out.println("주사위 = " + rand);
                // 종료
            }
        });

        hello(new Process() {
            @Override
            public void run() {
                // 코드 조각
                for (int i = 1; i <= 3; i++) {
                    System.out.println("i =" + i);
                }
                // 종료
            }
        });
        // 변수에 참조값 넣지 말고 바로 호출 해보자.
    }
    // 이렇게 코드 조각전달하기 위해 클래스 만들고 메서드 만들고 인스턴스 생성하고 하는걸 간단하게 하고 싶고 메서드만 전달하고 싶을떄 람다(Lambda)를 쓴다.
}
