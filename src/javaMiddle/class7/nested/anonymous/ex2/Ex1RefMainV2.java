package javaMiddle.class7.nested.anonymous.ex2;

import java.util.Random;

public class Ex1RefMainV2 {

    public static void hello(Process process) {
        System.out.println("프로그램 시작");

        process.run();

        System.out.println("프로그램 종료");
    }

    public static void main(String[] args) {

         class Dice implements Process {
            private int value;

            public Dice(int value) {
                this.value = value;
            }

            @Override
            public void run() {
                // 코드 조각
                int rand = new Random().nextInt(value)+1;
                System.out.println("주사위 = " + rand);
                // 종료
            }
        }

         class Sum implements Process {

            private int startValue;

            public Sum(int startValue) {
                this.startValue = startValue;
            }

            @Override
            public void run() {
                // 코드 조각
                for (int i = 1; i <= startValue; i++) {
                    System.out.println("i =" + i);
                }
                // 종료
            }
        }

        hello(new Dice(6)); // Dice dice = new Dice(); hello(dice);
        hello(new Sum(3));  // Sum sum = new Sum(); hello(sum);
    }
    // 지역 클래스로 만듦.
    // 한번만 쓰니까 익명으로 만들어보자.

}
