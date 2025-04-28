package javaMiddle.class7.nested.anonymous.ex2;

import java.util.Random;

public class Ex1RefMain {

    static class Dice implements Process {
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

    static class Sum implements Process {
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

    public static void hello(Process process) {
        System.out.println("프로그램 시작");

        process.run();

        System.out.println("프로그램 종료");
    }

    public static void main(String[] args) {
        hello(new Dice(6)); // Dice dice = new Dice(); hello(dice);
        hello(new Sum(3));  // Sum sum = new Sum(); hello(sum);
    }

    // 인터페이스를 통해 메소드를 전달하고 클래스를 만들어 입맛에 맞게 메서드 내용을 변경한다.
    // 코드 조각을 전달할때는 인스턴스를 전달하고 해당 인스턴스의 메서드를 호출하면 됨.
}
