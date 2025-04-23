package javaMiddle.class4.wrapper.clazz;

public class ClassCreateMain {
    public static void main(String[] args) throws Exception {
        Class hello = Hello.class;
        Class.forName("javaMiddle.class4.wrapper.clazz.Hello");

        Hello hello2 = (Hello)hello.getDeclaredConstructor().newInstance();     // getDeclaredConstructor : 생성자 선택, newInstance: 인스턴스 생성.
        String result =hello2.hello();
        System.out.println("result: " + result);

    }
}
