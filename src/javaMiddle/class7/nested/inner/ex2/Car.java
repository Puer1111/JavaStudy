package javaMiddle.class7.nested.inner.ex2;

public class Car {

    private String model;
    private int chargeLevel;
    private Engine engine;

    public Car(int chargeLevel, String model) {
        this.model = model;
        this.chargeLevel = chargeLevel;
        this.engine = new Engine();

    }
    public void start(){
        engine.start();
        System.out.println(model + "시작 완료");
    }

    private class Engine {
    // 이제 Car 에 속했기 떄문에 Car를 알 필요 없다.
    // Engine 을 위한 getter 메서드들도 그냥 바로 접근하면 된다.
        public void start(){
            System.out.println("충전 레벨 확인 : " + chargeLevel);
            System.out.println(model + "의 엔진을 구동합니다.");
        }
    }
}
