package javaBasic.class12.newCar;

public class Model3Car implements Car {
    @Override
    public void TurnOnEngine() {
        System.out.println( "model3 car turn on");
    }

    @Override
    public void TurnoffEngine() {
        System.out.println( "model3 car turn off");
    }

    @Override
    public void pressAccelator() {
        System.out.println( "model3 car press accelator");
    }
}
