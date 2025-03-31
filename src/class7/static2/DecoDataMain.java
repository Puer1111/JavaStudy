package class7.static2;

public class DecoDataMain {
    public static void main(String[] args) {
        System.out.println("1. 정적 호출");
        DecoData.staticCall();

        System.out.println("2. 인스턴스 호출1");
        DecoData deco = new DecoData();
        deco.instanceCall();

        System.out.println("3. 인스턴스 호출2");
        DecoData deco2 = new DecoData();
        deco2.instanceCall();

        System.out.println("static에서도 인스턴스 호출");
        DecoData data1 = new DecoData();
        DecoData.instanceCallinStatic(data1);

        //정적 메소드 호출

        // 인스턴스 생성 해서 정적 메소드 호출
        DecoData data3 = new DecoData();
        data3.staticCall();

        // 클래스에서 직접 정적 메소드 호출
        DecoData.staticCall();

        // static의 경우 static 영역에 있는 value 가 올라가기에 계속 증가 됨.
        // instance 의 경우 "새로" 생성 되기 때문에 각자의 value 가 0 -> 1 로 증가함.
        // instance 에서는 static을 호출 할 수 있다. 객체에서 클래스 자체를 호출하기 때문에 가능.
        // static에서 instance 를 호출 할 수 없는것은 "참조값" 을 모르기에 일반적으로 호출 불가능함.
        // 그러나 객체의 "참조값"을 "직접" 전달하면 정적 메소드도 인스턴스 변수 or 메소드 호출할 수 있다.
        
        // 정적 메소드를 여러 번 호출해야 될 경우 static import 활용
        // import static static2.DecoData.staticCall; 이렇게 import 가능하다.
        // import 하면 클래스 명 없이 메소드명만 적을 수 있다.
    }
}
