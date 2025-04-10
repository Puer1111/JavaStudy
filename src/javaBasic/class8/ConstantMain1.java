package javaBasic.class8;

public class ConstantMain1 {
    public static void main(String[] args) {
//        System.out.println("프로그램 최대 참여자 수 : " + 1000);
        System.out.println("프로그램 최대 참여자 :" + Constant.MAX_USERS);
        int currentUserCount = 999;
        process(currentUserCount++);
        process(currentUserCount++);
        process(currentUserCount++);

    }
    private static void process(int currentUserCount) {
        System.out.println("참여자 수 :" + currentUserCount);
//        if(currentUserCount > 1000) {
        if(currentUserCount > Constant.MAX_USERS) {
            System.out.println("대기자로 등록 된다.");
        }
        else{
            System.out.println("게임에 참여합니다.");
        }
    }
//  코드 단점: 1. 최대 참여자 수를 동적으로 할 경우 조건문의 숫자도 같이 바뀌어야한다.
//  2, 직접 개발한 개발자가 아닌 다른 사람이 보았을때 동적인 숫자 1000의 의미를 알지 못한다.
//  따라서 이 동적의 숫자를 상수로 변경하고 변수를 통해 의미를 전달해야한다.
}
