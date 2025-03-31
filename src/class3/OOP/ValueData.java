package class3.OOP;

public class ValueData {
    int value;

     void add(){ // 메소드는 객체를 생성해야 호출할 수 있는데 static 이 붙으면 객체를 생성하지 않아도 호출 가능.
        value++;
        System.out.println("value="+value);
    }
}
