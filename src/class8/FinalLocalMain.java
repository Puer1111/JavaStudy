package class8;

public class FinalLocalMain {
    public static void main(String[] args) {
//      final 변수
        final int data1;
        data1  = 10;  // final 변수에는 최초 한번 만 값 할당 가능.

//      final 변수2
        final int data2 = 20;
//      data2 = 20;
        method(20);

    }
    static void method(final int parameter){
//        parameter = 20; 이 할당도 불가능 메소드 호출하면서 값 넣을때 최초 값 한번 가능
    }
}
