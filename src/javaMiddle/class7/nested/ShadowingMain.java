package javaMiddle.class7.nested;

public class ShadowingMain {
    // 바깥 클래스와 내부 클래스의 인스턴스 명이 같으면 어떻게 될까?

    // 더 구체적인것이 우선순위를 가짐. go()에는 지역변수 value 가 가까움. this.value는 클래스의 value에 접근함. 명확하게 하는것이 좋다.
    public int value =1;

    class Inner{
        public int value = 2;

        void go(){
            int value = 3;
            System.out.println("value is " + value);
            System.out.println("this.value = " + this.value);
            System.out.println("ShadowingMain.this.value = " + ShadowingMain.this.value);
        }
    }

    public static void main(String[] args) {
        ShadowingMain obj = new ShadowingMain();
        Inner inner =  obj.new Inner();
        inner.go();
    }

}
