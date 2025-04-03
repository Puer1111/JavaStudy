package class11.polyEx6;

public class Bird extends AbstractAnimal implements Fly {  // 상속의 경우 한개 구현의 경우 여러개니까 상속이 먼저 나와야함.
    @Override
    public void sound() {
        System.out.println("끼룩끼룩");
    }

    @Override
    public void fly() {
        System.out.println("새 난다요");
    }
}
