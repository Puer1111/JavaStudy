package javaBasic.OOP;

public class ValueDataMain {
    public static void main(String[] args) {
//      현재 데이터와 기능이 분리되어있는 상태.
        ValueData data = new ValueData();
        add(data);
        add(data);
        add(data);
    }
    static void add(ValueData data) {
        data.value++;
        System.out.println("Value added to the list: " + data.value);
    }
}
