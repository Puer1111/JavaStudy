package javaBasic.class12.newCar;

public class CarMain1 {
    public static void main(String[] args) {
        Driver driver = new Driver();

        //차량 선택
        K3Car k3 = new K3Car();
        driver.setCar(k3);   // K3가 Car에 구현되어 있기 때문에 부모 => 자식 가질 수 있다.
        driver.drive();

        // K3-> model3

        Model3Car model3 = new Model3Car();
        driver.setCar(model3);   // Drive 클래스에 있던 Car 가 원래 K3를 참조 했으나 model3Car로 바뀜. *메소드 오버라이딩 되기 때문에 model3Car의 setCar가 실행됨.
        driver.drive();             // drive 에소드에 있는 모든 car에 대한 메소드도 전부 메소드 오버라이딩 되기 때문에 해당 자식 메소드 호출.

        //Model3 -> NewCar
        NewCar newCar = new NewCar();
        driver.setCar(newCar);
        driver.drive();
    }
}
