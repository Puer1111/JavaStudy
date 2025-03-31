package class9.extends1.ex3;


public class CarMain {
    public static void main(String[] args) {
        ElectricCar electricCar = new ElectricCar();
        electricCar.move();
        electricCar.charge();
        electricCar.openDoor();

        GasCar gasCar = new GasCar();
        gasCar.move();
        gasCar.fillUp();
        gasCar.openDoor();

        HydrogenCar hydrogenCar = new HydrogenCar();
        hydrogenCar.move();
        hydrogenCar.fillHydrogen();
        hydrogenCar.openDoor();
    }
    // ex1 과 다르게 ElctricCar와 GasCar에 move 를 하지 않아도 Car에 move 가 있기 때문에 메소드를 사용할 수 있다.
    // 상속의 그림을 보면 "자식" ----> "부모" 의 형태로 화살표가 되어있다. 자식 코드에서 extends 부모 로 되어있기 떄문.
}
