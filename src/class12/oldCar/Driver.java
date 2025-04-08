package class12.oldCar;

public class Driver {
    private K3Car k3Car;   // 참조형의 경우 기본 값은 null
    private Model3Car model3Car;

    public void setK3Car(K3Car k3Car){    // 차를 세팅한다.
        this.k3Car = k3Car;
    }
    public void setModel3Car(Model3Car model3Car){
        this.model3Car = model3Car;
    }

    // 여러 차를 동시에 쓰진 않지만 차를 사용하여야 하는데 타입이 달라서 여러번 세팅해야 하는 상황.

    public void drive(){
        System.out.println("자동차를 운전합니다.");
        if(k3Car != null) {
            k3Car.startEngine();
            k3Car.pressAccelerator();
            k3Car.offEngine();
        }else if(model3Car != null){
            model3Car.startEngine();
            model3Car.pressAccelerator();
            model3Car.offEngine();
        }
    }
}
