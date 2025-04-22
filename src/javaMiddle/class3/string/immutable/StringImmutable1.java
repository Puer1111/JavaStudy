package javaMiddle.class3.string.immutable;

public class StringImmutable1 {
    public static void main(String[] args) {
        String str = "hello";
        str.concat("Java");
        System.out.println(str);   // 문자가 합쳐지지 않는걸 볼 수 있다.  이유? 불변에 의한 인스턴스 추가 생성 반환값을 받지 않음.

        String str2 = "hello";
        String str3 = str2.concat(" Java");
        System.out.println(str3);

    }
}
