package javaBasic.class12.newCar;

public class NewCar implements Car{
    @Override
    public void TurnOnEngine() {
        System.out.println( "new car turn on");
    }

    @Override
    public void TurnoffEngine() {
        System.out.println("> new car turn off");
    }

    @Override
    public void pressAccelator() {
        System.out.println( "new car press accelator");
    }
}
