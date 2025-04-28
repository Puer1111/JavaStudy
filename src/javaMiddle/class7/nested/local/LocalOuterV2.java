package javaMiddle.class7.nested.local;

public class LocalOuterV2 {

    private int outInstanceVar = 3;

    public void process(int paramVar){
        int localVar =1;

        class LocalPrinter implements Printer{    // 지역클래스도 인터페이스 구현 가능.
            // 지역 클래스는 접근 제어자 사용 불가능.
            int value =0;

            @Override
            public void print() {
                System.out.println("value = " +  value);
                System.out.println("localVar = " +  localVar);
                System.out.println("Param = " + paramVar);
                System.out.println("outInstanceVar = " +  outInstanceVar);
            }
        }
        Printer localPrinter = new LocalPrinter();
        localPrinter.print();
    }

    public static void main(String[] args) {
        LocalOuterV2 v1 = new LocalOuterV2();
        v1.process(2);
    }
}
