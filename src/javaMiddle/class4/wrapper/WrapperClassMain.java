package javaMiddle.class4.wrapper;

public class WrapperClassMain {

    public static void main(String[] args) {
        Integer newInteger = new Integer(10); // Integer 에러는 앞으로 사라질 거니 사용하지 말라는 에러. 대신 valueOf() 사용.
        System.out.println("newInteger = " + newInteger);

        Integer integerObj = Integer.valueOf(10); // valueOf에 들어가보면 결국 리턴을 new Integer 한다. Integer 범위는 -128 ~ 127 범위 숫자값 재사용. 불변 , 자바가 미리 해당 범위의 숫자를 만들어둔다.
        Long longObj = Long.valueOf(10);
        Double doubleObj = Double.valueOf(10);

        System.out.println("integerObj = " + integerObj);
        System.out.println("longObj = " + longObj);
        System.out.println("doubleObj = " + doubleObj);

        System.out.println("내부값 읽기");
        int intValue = integerObj.intValue();   // 해당 객체 값 꺼내 읽기.
        System.out.println("intValue = " + intValue);
        long longValue = longObj.longValue();
        System.out.println("longValue = " + longValue);

        System.out.println("비교");
        System.out.println("== : " + (newInteger == integerObj));
        System.out.println("equals : " + (newInteger.equals(integerObj)));
    }

}
