package javaMiddle.class1.object.equals;

public class EqualsMain2 {
    public static void main(String[] args) {
        UserV2 user1 = new UserV2("id-100");
        UserV2 user2 = new UserV2("id-100");

        System.out.println("Identity = "  + (user1 == user2));
        System.out.println("Equality = "  + (user1.equals(user2)));

        // EqualsMain1 에서 했던것 과 다르게 동일성과 동등성의 분류를 완료했다.
        // equals() 메서드 재정의를 통해 분류.
    }
}
