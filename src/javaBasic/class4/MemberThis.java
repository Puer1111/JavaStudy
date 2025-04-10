package javaBasic.class4;

public class MemberThis {
    String nameField;

    void initMember(String nameParameter){
        nameField = nameParameter;  // 이 경우 자동으로 위에 있는 멤버 변수 찾음.
    }
}
