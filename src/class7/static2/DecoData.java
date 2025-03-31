package class7.static2;

public class DecoData {

    private int instanceValue;
    private static int staticValue;

    public static void staticCall(){
//        instanceValue++; // 인스턴스 변수 접근 , compile error
//        instanceMethod(); // 인스턴스 메소드 접근 , compile error

        // 인스턴스는 객체를 생성하고 참조값에 따라 실행해야됨. 따라서 static 에서는 접근 불가.

        staticValue++; // 정적 변수에 접근.
        staticMethod(); // 정적 메소드 접근.

        // 둘다 같은 클래스 안에 있기에 호출 가능.
    }
    public void instanceCall(){
        instanceValue++;
        instatnceMethod();
        // 이건 이제 DecoData 객체 생성하고 호출해서 실행 하면 됨.
        staticValue++;
        staticMethod();

        // static의 경우 "공용"이기에 접근가능. 본래 Data data1 = new Data(); System.out.println(data1.count); ---> System.out.println(Data.count); 랑 같은 원리.
    }


    private void instatnceMethod(){
        System.out.println("instanceValue = " + instanceValue);
    }

    private static void staticMethod(){
        System.out.println("staticValue = " + staticValue);
    }

    public static void instanceCallinStatic(DecoData data){ // DecoData 객체를 "생성"해서 외부에서 넘어오기에 가능.
        data.instanceValue++;
        data.instatnceMethod();
    }
}
