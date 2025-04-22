package javaMiddle.class3.string.builder;

public class LoopStringMain {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
//        String result ="";
        StringBuilder sb = new StringBuilder();
        for(int i =0; i<100000;i++) {
//            result += "Hello Java";
            sb.append("Hello Java");
        }
        long endTime = System.currentTimeMillis();
        String result = sb.toString();
        System.out.println("result = " + result);
        System.out.println("time = " + (endTime - startTime)+"ms");
    }
    // 반복문에서는 String이 최적화가 몇번이나 반복될지 모르기에 어렵다.
    // for 반복횟수 만큼 String 객체를 생성했을 것이다.
    // 이런 반복문에선 StringBuilder가 더 좋다.
}
