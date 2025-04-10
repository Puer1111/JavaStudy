package javaBasic.class9.access.parent;

public class Parent {
    public int publicValue;
    protected int protectedValue;
    private int privateValue;
    int defaultValue;

    public void publicMethod(){
        System.out.println("Parent , publicMethod");
    }
    protected void protectedMethod(){
        System.out.println("Parent , protectedMethod");
    }
    private void privateMethod(){
        System.out.println("Parent , privateMethod");
    }
    void defaultMethod(){
        System.out.println("Parent , defaultMethod");
    }
    public void printParent(){
        System.out.println("Parent 메소드 완 ");
        System.out.println("publicValue : " + publicValue);
        System.out.println("protectedValue : " + protectedValue);
        System.out.println("privateValue : " + privateValue);
        System.out.println("defaultValue : " + defaultValue);

        // 부모 메소드 안에서 접근 가능.
        defaultMethod();
        privateMethod();
    }
}
