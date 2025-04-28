package javaMiddle.class7.nested.inner;

public class InnerOuter {
    private static int outClassValue = 3;
    private int outInstanceValue = 2;

    class Inner{
        private int innerInstanceValue = 1;
        public void print(){
            // 자기 자신 접근
            System.out.println("innerInstnceValue = " + innerInstanceValue);

            // 외부 클래스의 인스턴스 멤버에 접근 가능, private 도 접근 가능  --> 참조값을 알기 때문!
            System.out.println("outInstanceValue = " + outInstanceValue);

            // 외부 클래스의 클래스 멤버에도 접근 가능 , private 도 가능
            System.out.println("outClassValue = " + outClassValue);
        }
    }
}
