package javaMiddle.class2.immutable.address;

public class MemberMainV1 {
    public static void main(String[] args) {

        Address address = new Address("서울");

        MemberV1 mem1 = new MemberV1("회원A" , address);
        MemberV1 mem2 = new MemberV1("회원B" , address);
    
        // 회원 A,B 주소는 모두 서울
        System.out.println("MemberA = " + mem1);
        System.out.println("MemberB = " + mem2);

        // 회원 B 의 주소를 부산으로 변경 해야함.
        mem2.getAddress().setValue("부산");
        System.out.println("부산 -> memberB.address");
        System.out.println("memberA" + mem1);
        System.out.println("memberB" + mem2);

        // 아까랑 똑같이 객체의 참조값을 공유하기 때문에 B 바꿔도 A도 다 바뀜.
    }
}
