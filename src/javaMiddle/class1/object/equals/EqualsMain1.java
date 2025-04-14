package javaMiddle.class1.object.equals;

public class EqualsMain1 {
    public static void main(String[] args) {
        UserV1  user1 = new UserV1("id-100");
        UserV1  user2 = new UserV1("id-100");

        System.out.println("Identity = "  + (user1 == user2));
        System.out.println("Equality = "  + (user1.equals(user2)));

        // 둘다 False 인 이유는 equals 에 들어가보면 매개변수와 비교를 == 으로 비교해서 Identity 와 똑같다.
        // 동등성의 개념은 클래스마다 다르기 때문에 equals 메서드를 재정의 해야한다. 그렇지 않으며 기본 Object 타입의 동일성 비교를 기준으로 제공한다.
    }
}
