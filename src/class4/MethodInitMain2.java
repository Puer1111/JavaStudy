package class4;

import java.lang.reflect.Member;

public class MethodInitMain2 {
    public static void main(String[] args) {
        MemberInit member1 = new MemberInit();
        member1.initMember("User1", 15, 90);

        MemberInit member2 = new MemberInit();
        member2.initMember("User2", 20, 90);
    }
}
