package javaMiddle.class4.wrapper;

public class MyIntegerNullMain1 {
    public static void main(String[] args) {
        MyInteger[] intarr = {new MyInteger(-1), new MyInteger(0), new MyInteger(1), new MyInteger(999)};
        System.out.println(findValue(intarr,-1));
        System.out.println(findValue(intarr,0));
        System.out.println(findValue(intarr,1));
        System.out.println(findValue(intarr,100));
    }
    private static MyInteger findValue(MyInteger[] intarr , int target){
        for(MyInteger myInteger: intarr){
            if(myInteger.getValue() == target){
                return myInteger;
            }
        }
        return null;
    }
    // 참조형인 객체는 없다는 표현인 Null을 사용할 수 있다.
    // 기본형을 그대로 사용하지 않고 클래스를 통해서 객체를 생성하여 클래스 타입으로 null을 표현한다.
}
