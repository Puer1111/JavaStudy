package javaMiddle.class7.nested.test.ex3;

public class OuterClass3 {

    public void myMethod(){
        class LocalClass{
            public void hello(){
                System.out.println("OuterClass3.hello");
            }
        }
        LocalClass localClass = new LocalClass();
        localClass.hello();
    }
}
