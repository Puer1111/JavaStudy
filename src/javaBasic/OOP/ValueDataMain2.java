package javaBasic.OOP;

public class ValueDataMain2 {
    public static void main(String[] args) {
//      객체 안에 데이터와 기능을 다 넣어서 메소드도 같은 방식으로 호출한다.
        ValueData data = new ValueData();
        data.add();
        data.add();
        data.add();
        // 여기서 add는 만들어진 valueData 객체에 있는 자기 자신의 value를 증가 시킨다.
    }
}
