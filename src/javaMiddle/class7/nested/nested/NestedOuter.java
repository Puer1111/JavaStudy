package javaMiddle.class7.nested.nested;

public class NestedOuter {
    private static int outClassValue =  3;
    private int outInstanceValue = 2;

    static class Nested{  // 정적 중첩 클래스
        private int nestedInstanceValue = 1;

        public void print(){
            // 자신의 멤버에 접근
            System.out.println(nestedInstanceValue);
            // 바깥 클래스 인스턴스 멤버 접근
            // 바깥 클래스 인스턴스 멤버에 접근 할 수 없다. 클래스가 static 붙어서 안됨.
            // System.out.println(outInstanceValue);

            // 바깥 클래스의 클래스 멤버에는 접근 가능 **private 도 가능.
            System.out.println(NestedOuter.outClassValue);

        }

    }
}
