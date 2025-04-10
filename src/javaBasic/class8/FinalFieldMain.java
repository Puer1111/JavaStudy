package javaBasic.class8;

public class FinalFieldMain {
    public static void main(String[] args) {
//        final 필드 - 생성자 초기화
        System.out.println("생성자 초기화");

        Constructorinit c1 = new Constructorinit(10);
        Constructorinit c2 = new Constructorinit(20);

        System.out.println("constructor init value: " + c1.value);
        System.out.println("constructor init value: " + c2.value);

        // 필드 초기화  --> 이 방법은 모든 인스턴스마다 무조건 다 value 값이 10으로 들어가서 좋지 않다. 메모리적으로도 안좋음.

        System.out.println("필드 초기화");

        FieldInit f1 = new FieldInit();
        FieldInit f2 = new FieldInit();

        System.out.println("FieldInit value = " + f1.value);
        System.out.println("FieldInit value = " + f2.value);

        // static final 상수 접근.
        System.out.println(FieldInit.constValue);


    }
}
