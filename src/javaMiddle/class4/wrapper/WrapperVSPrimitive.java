package javaMiddle.class4.wrapper;

public class WrapperVSPrimitive {
    public static void main(String[] args) {
        int iterations = 1_000_000_000;
        long startTime,endTime;

        // 기본형 long
        long sumPrimitive = 0;
        startTime = System.currentTimeMillis();
        for(int i=0;i<iterations;i++){
            sumPrimitive += i;
        }
        endTime = System.currentTimeMillis();
        System.out.println("sum primitive: " + sumPrimitive);
        System.out.println("기본형 long : " + (endTime - startTime)+ "ms");

        // 래퍼 클래스 Long
        Long sumWrapper = 0L;
        startTime = System.currentTimeMillis();
        for(int i=0;i<iterations;i++){
            sumWrapper += i;
        }
        endTime = System.currentTimeMillis();
        System.out.println("sumWrapper: " + sumWrapper);
        System.out.println("래퍼 클래스 long : " + (endTime - startTime)+ "ms");
    }

    // 결과 : 기본형이 압도적으로 빠름.
    // 기본형은 그 크기 만큼 메모리를 차지 하지만 래퍼의 경우 객체 자체를 다루기 위한 추가적인 메모리를 사용하기 떄문에 오래걸림
    // 기본형 : 4Byte  래퍼 : 8~16Byte
}
