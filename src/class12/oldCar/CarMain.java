package class12.oldCar;

public class CarMain {
    public static void main(String[] args) {
        Driver driver = new Driver();    // 운전자를 만들고
        K3Car k3Car = new K3Car();      // 차도 만들고

        driver.setK3Car(k3Car);         // 운전자에 차를 넣고
        driver.drive();                 // 운전자가 그 차를 운전한다.

        Model3Car model3Car = new Model3Car();
        driver.setK3Car(null);       // null 넣어서 참조값 초기화 해주지 않으면 drive 메소드의 if 조건절이 true 라서 model3Car 실행 안됨.
        driver.setModel3Car(model3Car);
        driver.drive();
    }

    // Driver클래스에 K3Car 인스턴스변수를 가지고 있다가 k3Car를 생성하면서 해당 참조값을 받아서 setk3Car가 실행 되고 , drive 도 사용 가능하다.
}
