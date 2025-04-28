package javaMiddle.class7.nested.test.ex4;

public class AnonymousMain {
    public static void hello(Hello hello){
        hello.hello();
    }

    public static void main(String[] args) {
        hello(new Hello() {
            @Override
            public void hello() {
                System.out.println("Hello.hello");
            }
        });
    }
}
