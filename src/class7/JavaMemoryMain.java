package class7;

public class JavaMemoryMain {
    public static void main(String[] args) {
        System.out.println("main start");
        method1(10);
        System.out.println("main end");
    }
    static void method1(int m1){
        System.out.println("method1 start");
        int cal = m1 *2;
        method2(cal);
        System.out.println("method1 end");
    }
    static void method2(int m2){
        System.out.println("method2 start");
        System.out.println("method2 end");
    }
    // main 실행 -> method1 실행 -> method2 실행 -> method2 종료 -> method1 종료 -> main 종료
    // Stack 구조(LIFO)의 예시.
    // Java는 Stack영역을 사용해 메소드 호출과 지역변수 관리.
    // 메소드를 계속 호출하면 스택 프레임이 쌓임. -> 지역변수는 스택영역에서 관리. -> 스택프레임이 종료되면 지역변수도 제거. 스택프레임이 모두 제거되면 프로그램도 종료.
}
