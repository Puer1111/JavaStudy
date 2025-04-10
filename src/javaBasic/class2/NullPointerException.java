package javaBasic.class2;

public class NullPointerException {
    public static void main(String[] args) {
        Data data = null;
        data.value= 10;  // nullpointerException 발생. // 참조할 객체가 없기 떄문에 발생한다.
        System.out.println("data: " + data);
    }
}
