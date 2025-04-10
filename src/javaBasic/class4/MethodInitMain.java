package javaBasic.class4;

public class MethodInitMain {
    public static void main(String[] args) {
        MemberInit member1 = new MemberInit(); // 기본 생성자.
        member1.age = 15;
        member1.name ="User1";
        member1.grade= 90;

        MemberInit member2 = new MemberInit();
        member2.name="User2";
        member2.age = 20;
        member2.grade = 80;

        MemberInit[] members = {member1,member2};

        for(MemberInit member : members){
            System.out.println("이름: " + member.name +" 나이:  " + member.age + " 점수: " + member.grade);
        }
    }
}
