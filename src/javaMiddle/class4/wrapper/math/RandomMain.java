package javaMiddle.class4.wrapper.math;

import java.util.Random;

public class RandomMain {
    public static void main(String[] args) {
        Random random = new Random();
//        Random random = new Random(1);  // seed 가 같으면 Random의 결과가 같다.


        int randomInt = random.nextInt();
        System.out.println("randomInt: " + randomInt);

        double randomDouble = random.nextDouble(); // 0.0d ~~ 1.0d
        System.out.println("randomDouble: " + randomDouble);

        boolean randomBoolean = random.nextBoolean();
        System.out.println("randomBoolean: " + randomBoolean);

        // 범위로 조회
        int RandomRange1 = random.nextInt(10); // 0~9 까지 출력
        System.out.println("randomInt 0-9: " + RandomRange1);

        int RandomRange2 = random.nextInt(10)+1; // 1~ 10 까지 출력
        System.out.println("randomInt 1-10: " + RandomRange2);


    }
}
