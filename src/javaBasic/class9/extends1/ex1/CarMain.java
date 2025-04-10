package javaBasic.class9.extends1.ex1;

public class CarMain {
    public static void main(String[] args) {
        ElectricCar electricCar = new ElectricCar();
        electricCar.move();
        electricCar.charge();

        GasCar gasCar = new GasCar();
        gasCar.move();
        gasCar.fillUp();

        // move 라는 공통된 행위가 있다. 이런 경우 상속을 사용하는게 효과적.
        // 따라서 Car를 만들어서 상속 시킨다.
    }
}
