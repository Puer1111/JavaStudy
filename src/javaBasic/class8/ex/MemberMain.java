package javaBasic.class8.ex;

public class MemberMain {
    public static void main(String[] args) {
        Member member = new Member("myId" , "Kim");
        member.print();
        member.changeData("JO");
        member.print();
    }
}
