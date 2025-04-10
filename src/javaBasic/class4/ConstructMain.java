package javaBasic.class4;


public class ConstructMain {
    public static void main(String[] args) {
        // 생성자 장점: 중복 호출 제거 , 생성과 동시에 호출로 인한 편리함. 실수로 깜빡하면 에러로 인해 실행 안됌.
        // 메소듣를 한번 더 호출하지 않아도 됌.
    MemberConstruct member1 = new MemberConstruct("user1" , 20, 90); // 객체를 생성함과 동시에 바로 호출.
    MemberConstruct member2 = new MemberConstruct("user2" , 30, 100);

    MemberConstruct[] members = {member1, member2};
    for(MemberConstruct s : members) {
        System.out.println("이름: " +  s.name + " ,age= " + s.age + " ,grade= " + s.grade );
    }
    }
}
