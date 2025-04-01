package class9.overRiding;


public class GasCar extends Car {
    // Car를 상속 받아 move 필요 없음.
    public void fillUp(){
        System.out.println("기름을 주유합니다.");
    }
}
