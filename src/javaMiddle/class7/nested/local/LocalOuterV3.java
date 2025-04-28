package javaMiddle.class7.nested.local;

import java.lang.reflect.Field;

public class LocalOuterV3 {

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
//        localPrinter.print(); 를 여기서 실행하지 않고 Printer 인스턴스만 반환한다.
        return localPrinter;
    }

    public static void main(String[] args) {
        LocalOuterV3 v1 = new LocalOuterV3();
        Printer printer = v1.process(2);

        // printer.print()를 나중에 실행함. process() 스택 프레임 사라지고 실행.
        printer.print();

        // LocalPrinter 인스턴스 생성 직후 --> localPrinter에 stack 영역에는 process에 있는 지역변수 : paramVar,localVar 그리고 Printer의 참조값이 있고
        // 힙 영역에는 LocalOuter 인스턴스, LocalPrinter 인스턴스가 있다. LocalOuter에는 해당 인스턴스 변수 outInstanceVar가 있고 LocalPrinter에는 내부 클래스니까 LocalOuter의 참조값과 오버라이딩한
        // print()메서드가 있다.
        // 지역 클래스로 만든 (LocalPrinter) 객체도 인스턴스라 힙에 존재하고 GC전까지 생존한다.
        // process() 에서 LocalPrinter 인스턴스 생성 -> main()으로 process()에서 반환한 localPrinter 전달
        // 전달한 localPrinter를 Printer 타입의 printer 변수에 참조 보관. 따라서 LocalPrinter는 main()종료까지 생존.
        // paramVar ,localVar는 process() 메서드 종료시 제거.
        // BUT  ※ process() 메서드가 종료되도 LocalPrinter 인스턴스는 힙 영역에 생존한다.
        // 실행:
        // LocalOuter 인스턴스 생성 -> 해당 인스턴스의 process 실행 -> 마지막에 localPrinter 타입 반환 -> 반환 참조값 Printer 타입의 printer 변수에 보관.

        // 지역 변수가 사라졋는데 어떻게 값을 가져올 수 있었을까?
        // LocalPrinter안에 있는 print()실행 하게 되면 process()에 있는 localVar와 paramVar를 가져와야하는데 process가 종료되서 같이 사라졌다
        // 하지만 정상 출력됨. 이유는? 지역 변수 캡쳐. 자바는 지역클래스의 인스턴스를 생성할 때 지역 변수를 복사해서 해당 인스턴스에 값을 넣어 두는것을 지역 변수 캡처라 함.
        // 단 필요한 지역변수만 한다.
        // LocalPrinter 인스턴스 생성 -> 그 안에 필요한 paramVar,localVar 값 캡처 -> main()실행 시 process()사라져도 인스턴스의 캡처 값 출력.

        // 추가
        System.out.println("필드 확인");
        Field[] fields = printer.getClass().getDeclaredFields();
        for(Field field : fields){
            System.out.println("fields" + field);
        }
        // localVar, paramVar 있는거 확인할 수 있다.
        // 추가로 가장 바깥클래스를 참조하기 위한 필드도 있다는걸 볼수 있다.
        // 지역변수의 값이 바뀌면 어떻게 될까? --> ※ 바뀌면 안됨 사실상 Final 이여야함.
        // 왜? --> LocalOuterV4
    }
}
