package javaMiddle.class7.nested.local;

public class LocalOuterV1 {

    private int outInstanceVar = 3;

    public void process(int paramVar){
        int localVar =1;

        class LocalPrinter{
            // 지역 클래스는 접근 제어자 사용 불가능.
            int value =0;

            public void printdata(){
                System.out.println("value = " +  value);
                System.out.println("localVar = " +  localVar);
                System.out.println("Param = " + paramVar);
                System.out.println("outInstanceVar = " +  outInstanceVar);
            }
        }
        LocalPrinter localPrinter = new LocalPrinter();
        localPrinter.printdata();
    }

    public static void main(String[] args) {
        LocalOuterV1 v1 = new LocalOuterV1();
        v1.process(2);
    }
}
