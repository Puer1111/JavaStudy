package javaBasic.class2;

public class NullStart {
    public static void main(String[] args) {
        Data data = null;
        System.out.println("data: " + data);
        data = new Data(); // 새로운 객체 참조하면서 Data 안에있는 value는 0 으로 생성.
        System.out.println("data2: " + data);
        data = null; // 참조하던 객체를 더이상 참조 하지 않고 다시 null로 되면서 7line에 만들었던 객체는 GC 에 의해 삭제.
        System.out.println("data3: " + data);
    }
}
