package class12.newCar;

public class K3Car implements Car {
    @Override
    public void TurnOnEngine() {
        System.out.println("k3 car turn on");
    }

    @Override
    public void TurnoffEngine() {
        System.out.println("k3 car turn off");
    }

    @Override
    public void pressAccelator() {
        System.out.println( "k3 car press accelator");
    }
}
