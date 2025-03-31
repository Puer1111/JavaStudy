package class7;

public class JavaMemoryMain2 {
    public static void main(String[] args) {
        System.out.println("main start");
        method1();
        System.out.println("main end");

    }
    static void method1(){
        System.out.println("method1 start");
        Data data1 = new Data(10);
        method2(data1);
        System.out.println("method1 end");
    }
    static void method2(Data data1){
        System.out.println("method2 start");
        System.out.println("data.value= " + data1.getValue());
        System.out.println("method2 end");
    }
    // main 실행 -> method1 실행(method1 스택 프레임 생성, 이 프레임에는 Data data1 을 생성해서 가지고 있다.) ->
    // method1에서 method2 호출 및 data1 참조값 넘김-> method2 실행 및 종료와 함께 method2의 스택 프레임 제거 ->
    // method1도 나머지 실행 후 종료 및 프레임 & 지역변수(data1) 제거-> 더 이상 Data1 을 아무도 참조하지 않기에 GC에 의해 제거.
}
