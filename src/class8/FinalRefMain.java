package class8;

public class FinalRefMain {
    public static void main(String[] args) {
        final Data data = new Data();   // 객체에 final 부여 - Data 라는 참조형에 final 을 부여한다.

        // 참조값 주소는 변경이 불가능하나, 참조 대상의 객체 값은 변경이 가능하다.
        data.value = 10;
        System.out.println("First data value = " + data.value);
        data.value = 20;
        System.out.println("Second data value = " + data.value);
        data.value = 30;
        System.out.println("Third data value = " + data.value);

        // Data 객체의 data에게만 final 을 걸었고 data안에 있는 value는 final 이 아니기 때문에 변경이 가능하다.
    }
}
