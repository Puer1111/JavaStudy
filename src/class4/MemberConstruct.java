package class4;

public class MemberConstruct {
    String name;
    int age;
    int grade;

    public MemberConstruct(String name, int age) {
//        this.name = name;
//        this.age = age;
//        this.grade = 50;
        this(name,age,50); // this.이 아래 생성자와 중복되니까 이런식으로 쓰면 아래 생성자를 호출함.
        // this()는 생성자 코드의 "첫 줄"에만 가능하다.
    }


    public MemberConstruct(String name, int age, int grade) { // 생성자 호출
        System.out.println("생성자 호출: " + name +" ,age= " + age +" ,grade= " + grade );
        this.name = name;
        this.age = age;
        this.grade = grade;
    }

}
