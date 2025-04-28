package javaMiddle.class7.nested.anonymous.ex1;

public class Ex0RefMain {

    public static void hello(String str){
        System.out.println("프로그램 시작");
        System.out.println(str); //hello 어쩌구만 변경 됨.
        System.out.println("프로그램 종료 ");
    }

    public static void main(String[] args) {
        hello("Hello Java");
        hello("Hello Spring");
    }
}
