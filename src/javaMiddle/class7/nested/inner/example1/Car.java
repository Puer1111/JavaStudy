package javaMiddle.class7.nested.inner.example1;

public class Car {

    private String model;
    private int chargeLevel;
    private Engine engine;

    public Car(int chargeLevel, String model) {
        this.model = model;
        this.chargeLevel = chargeLevel;
        this.engine = new Engine(this);
    }

    // 엔진 에서만 사용
    public int getChargeLevel() {
        return chargeLevel;
    }
    // 엔진 에서만 사용
    public String getModel() {
        return model;
    }
    public void start(){
        engine.start();
        System.out.println(model + "시작 완료");
    }
}
