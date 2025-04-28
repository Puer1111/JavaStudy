package javaMiddle.class7.nested.anonymous;

public class AnonymousOuterV2 {

    private int outInstanceVar = 3;

    public void process(int paramVar){
        int localVar =1;
        // 클래스 선언과 생성을 동시에 한다.  // new 다음에 구현할 부모 타입 입력. 인터페이스를 생성한게 아니라 부모 타입의 인터페이스를 구현한것.
        Printer printer = new Printer(){
            int value = 0;
            @Override
            public void print() {
                System.out.println("value = " +  value);
                System.out.println("localVar = " +  localVar);
                System.out.println("Param = " + paramVar);
                System.out.println("outInstanceVar = " +  outInstanceVar);
            }
        };

        printer.print();
        System.out.println("printer.class = " + printer.getClass());
    }

    public static void main(String[] args) {
        AnonymousOuterV2 v1 = new AnonymousOuterV2();
        v1.process(2);
    }
}
