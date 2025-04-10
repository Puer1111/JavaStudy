package javaBasic.class4;

public class ConstructMain2 {
    public static void main(String[] args) {
    MemberConstruct member1 = new MemberConstruct("user1" ,15 ,90);
    MemberConstruct member2 = new MemberConstruct("user2" ,15);

    MemberConstruct[] members = {member1, member2};

    for(MemberConstruct s : members){
        System.out.println("이름:" + s.name + " 나이: " + s.age + " 점수: " + s.grade);
    }
    }
}
