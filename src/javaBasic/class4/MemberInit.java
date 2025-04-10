package javaBasic.class4;

public class MemberInit {
    String name;
    int age;
    int grade;


    void initMember(String name, int age, int grade) {
        //멤버 변수와 매개변수의 이름이 같으면 우선순위가 어떻게 되는가? - 매개변수가 우선
        //따라서 name = name 시 매개변수 두개를 뜻함. 그래서 값이 변경 되지 않음.
        //this.를 통해 "자신"의 참조값 표현.
        //this 는 생략 가능 -> 가장 가까운 짖역 변수를 찾고 그 다음 멤버 변수 찾음.
        this.name = name;
        this.age = age;
        this.grade = grade;
        System.out.println("이름: " + name + "나이: " + name + "점수: " + age);
    }
}
