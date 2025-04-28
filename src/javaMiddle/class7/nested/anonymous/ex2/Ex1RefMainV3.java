package javaMiddle.class7.nested.anonymous.ex2;

import java.util.Random;

public class Ex1RefMainV3 {

    public static void hello(Process process) {
        System.out.println("프로그램 시작");

        process.run();

        System.out.println("프로그램 종료");
    }

    public static void main(String[] args) {

         Process dice = new Process() {

            @Override
            public void run() {
                // 코드 조각
                int rand = new Random().nextInt(6)+1;
                System.out.println("주사위 = " + rand);
                // 종료
            }
        };

         Process sum = new Process() {


            @Override
            public void run() {
                // 코드 조각
                for (int i = 1; i <= 3; i++) {
                    System.out.println("i =" + i);
                }
                // 종료
            }
        };

        hello(dice); // Dice dice = new Dice(); hello(dice);
        hello(sum);  // Sum sum = new Sum(); hello(sum);
    }
    // 변수에 참조값 넣지 말고 바로 호출 해보자.
}
