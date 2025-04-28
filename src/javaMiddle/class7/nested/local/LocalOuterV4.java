package javaMiddle.class7.nested.local;

import java.lang.reflect.Field;

public class LocalOuterV4 {

    private int outInstanceVar = 3;

    public Printer process(int paramVar){
        int localVar =1;   // 지역 변수는 process 메서드 종료시 사라짐.

        class LocalPrinter implements Printer{    // 지역클래스도 인터페이스 구현 가능.
            // 지역 클래스는 접근 제어자 사용 불가능.
            int value =0;

            @Override
            public void print() {
                System.out.println("value = " +  value);
                // 인스턴스는 지역변수보다 더 오래 살아남음.
                System.out.println("localVar = " +  localVar);
                System.out.println("Param = " + paramVar);
                System.out.println("outInstanceVar = " +  outInstanceVar);
            }
        }
        Printer localPrinter = new LocalPrinter();
        // 만약 LocalVar 의 값을 변경한다면? 재 캡처?
//        localVar = 10;
//        paramVar = 20;
        return localPrinter;
    }

    public static void main(String[] args) {
        LocalOuterV4 v1 = new LocalOuterV4();
        Printer printer = v1.process(2);

        // printer.print()를 나중에 실행함. process() 스택 프레임 사라지고 실행.
        printer.print();

        // 추가
        System.out.println("필드 확인");
        Field[] fields = printer.getClass().getDeclaredFields();
        for(Field field : fields){
            System.out.println("fields" + field);
        }

    }

    // 캡처 변수의 값을 변경하지 못하는 이유:
    // 1. 지역 변수 Or 캡처한 지역 변수 둘중 하나가 바뀌었을때 나머지 하나를 바꿔야하는 변수 발생,
    // 2. 원하지 않은 범위까지 값이 변경 될 수 있음.
    // 3. 두 값을 동기화 해야하는데 멀티 쓰레드 상황에서 이런 동기화는 어렵고 성능에 악영향 미침.
}
