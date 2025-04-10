package javaBasic.class5.pack;

import javaBasic.class5.pack.a.User;

public class PackageMain2 {
    public static void main(String[] args) {
        User user = new User();
        javaBasic.class5.pack.b.User user2 = new javaBasic.class5.pack.b.User(); // 같은 클래스 명 다른 패키지 경우 하나는 패키지 경로 적는다
    }
}
