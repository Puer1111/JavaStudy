package javaBasic.class10.overriding;

public class Child extends Parent{
    public String value = "Child";

    @Override
    public void parentMethod() {
        System.out.println("Child Method");
    }
}
