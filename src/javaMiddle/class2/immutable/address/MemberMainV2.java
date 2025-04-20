package javaMiddle.class2.immutable.address;

public class MemberMainV2 {
    public static void main(String[] args) {

        ImmutableAddress address = new ImmutableAddress("서울");

        MemberV2 mem1 = new MemberV2("회원A" , address);
        MemberV2 mem2 = new MemberV2("회원B" , address);
    
        // 회원 A,B 주소는 모두 서울
        System.out.println("MemberA = " + mem1);
        System.out.println("MemberB = " + mem2);

        // 회원 B 의 주소를 부산으로 변경 해야함.
//        mem2.getAddress().setValue("부산"); 이건 이제 안됨.
        mem2.setAddress(new ImmutableAddress("부산"));  // 표현에 주의.
        System.out.println("부산 -> memberB.address");
        System.out.println("memberA" + mem1);
        System.out.println("memberB" + mem2);

        // 아까랑 똑같이 객체의 참조값을 공유하기 때문에 B 바꿔도 A도 다 바뀜.
    }
}
