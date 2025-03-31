package class2;

public class MethodChange {
    public static void main(String[] args) {
        int a = 10;
        System.out.println("메소드 호출 전 : " + a );
        changePrimitive(a);
        System.out.println("메소드 호출 후 : " + a);
    }
    static void changePrimitive(int x){
//      x에 a의 값을 전달하기 떄문에 int x = a;의 형태가 된다.
        x = 20;
        System.out.println("Method x : " + x );
//      메소드 안에 있던 원래 int x = 10 의 값이 20 으로 바뀐다.
//      메소드 종료 시 x 제거됨.

    }
}
