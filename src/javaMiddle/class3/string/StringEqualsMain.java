package javaMiddle.class3.string;

public class StringEqualsMain {
    public static void main(String[] args) {
        String str1 = new String("abc");
        String str2 = new String("abc");
        System.out.println("new String() == 비교 : " + (str1 == str2) ); // 동일성에 따라 참조값이 다르므로 False
        System.out.println("new String() equals 비교 : " + (str1.equals(str2))); // 동등성에 따라 유사하게 같으므로 True


        String str3 = "def";
        String str4 = "def";
        System.out.println("리터럴 == 비교 : " + (str3 == str4) ); // 자바의 편의에 의한 true
        System.out.println("리터럴 equals 비교 : " + (str3.equals(str4))); // 동등성에 따라 유사하게 같으므로 True

        // 리터럴이 true 인 이유?
        // 자바가 메모리 효율과 성능을 위해 문자열 풀을 사용. 리터럴이 있다면 String 인스턴스를 미리 생성.
        // 같은 문자열이 있으면 인스턴스를 더 만들지 않음. 따라서 str3 인스턴스를 만들고 str4의 문자열풀은 str3랑 같으니 인스턴스를 생성하지 않는다.
        // 풀이란?
        // 수영장 풀과 같은 뜻으로 공용자원을 모아둔 곳을 뜬한다.
        // ※ 그래도 문자열 비교는 equals를 써야한다 Main2 확인.
    }
}
