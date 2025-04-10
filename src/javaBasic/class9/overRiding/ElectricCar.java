package javaBasic.class9.overRiding;


public class ElectricCar extends Car {
    // Car를 물려 받았기에 move 는 필요없다.
    public void charge(){
        System.out.println("차를 충전합니다.");
    }

    @Override
    public void move(){
        System.out.println("전기차를 빠르게 이동합니다.");
    }
}
