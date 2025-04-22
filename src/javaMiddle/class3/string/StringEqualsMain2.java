package javaMiddle.class3.string;

public class StringEqualsMain2 {
    public static void main(String[] args) {
        String str1 = new String("abc");
        String str2 = new String("abc");
        System.out.println("메소드 비교 1 : " + isSame(str1,str2));

        String str3 ="abc";
        String str4 ="abc";
        System.out.println("메소드 비교 2 : " + isSame(str3,str4));


    }
    private static boolean isSame(String x, String y) {
        return x == y;
    }

    // 무조건 String 은 equals 를 사용해야 하는 이유는 String 인스턴스가 new String() 으로 만들어지는지 리터럴로 만들어지는지 알 수 없다.
}
