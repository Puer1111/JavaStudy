package class12.newCar;

public class Driver {

    private Car car;

    public void setCar(Car car) {
        System.out.println("자동차를 설정한다.");
        this.car = car;
    }

    public void drive() {
        System.out.println("자동차를 운전한다.");
        car.TurnOnEngine();   // Car인스턴스를 멤버변수로 가지고 있기 때문에 메소드를 쓸수 있다.
        car.pressAccelator();
        car.TurnoffEngine();
    }
}
