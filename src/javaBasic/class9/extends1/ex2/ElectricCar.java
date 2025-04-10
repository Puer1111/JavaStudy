package javaBasic.class9.extends1.ex2;

public class ElectricCar extends Car{
    // Car를 물려 받았기에 move 는 필요없다.
    public void charge(){
        System.out.println("차를 충전합니다.");
    }

}
