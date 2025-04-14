package javaMiddle.class1.object.toString;

public class ToStringMain1 {
    public static void main(String[] args) {
        Object object = new Object();
        String string =  object.toString();

        // String 반환값 출력
        System.out.println(string);

        // Object 직접 출력
        System.out.println(object);

        // 둘다 결과가 같음을 알수 있으나 toString 의 경우 문자열 형태로 만든다.
        //getClass().getName() + "@" + Integer.toHexString(hashCode()); 이게 toString 출력 법이다.
        // 둘이 결과가 같은 이유는 println 에서도 사실 toString 을 가지고 있다.
        // 따라서 toString 쓸 필요 없이 그냥 객체를 바로 전달해서 println 하면 된다.
    }
}
