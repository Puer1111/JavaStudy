package javaMiddle.class1.object;

public class ObjectMain {
    public static void main(String[] args) {
        Child child = new Child();
        child.childMethod();
        child.parentMethod();

        //toString -- > Object 클래스의 메소드. 객체에 대한 정보를 반환.
        String string = child.toString();
        System.out.println(string);
//        System.out.println(child); 둘다 같음.

    }
}
