package javaMiddle.class4.wrapper.system;

import java.util.Arrays;

public class SystemMain {
    public static void main(String[] args) {
        // 현재 시간 (밀리초) 가져온다
        long currentTimeMillis = System.currentTimeMillis();
        System.out.println("currnet Millis: " + currentTimeMillis);

        // 현재 시간 (나노초)
        long currentTImeNano =  System.nanoTime();
        System.out.println("current Nano: " + currentTImeNano);

        // 환경 변수를 읽는다. 운영체재가 사용하는 시스템 환경 설정
        System.out.println("getEnv: " + System.getenv());

        // 시스템 속성을 읽는다. 자바가 사용하는 시스템 환경 설정
        System.out.println("Properties: " + System.getProperties());
        System.out.println("Java Version: " + System.getProperty("java.version"));

        // 배열을 고속으로 복사한다.
        char[] originalArray =  {'j','h','l','p','o'};
        char[] copiedArray = new char[5];
        System.arraycopy(originalArray, 0, copiedArray, 0, originalArray.length);

        // 배열 출력
        System.out.println("copied array: " + Arrays.toString(copiedArray));

        // 프로그램 종료
        System.exit(0);
        System.out.println("Hello");
    }
}
