package javaBasic.class2;

public class MethodReference {
    public static void main(String[] args) {
//      메소드를 통한 참조
        Student student1 = new Student();
        Student student2 = new Student();
//        객체마다 반복되는 필드값 부여를 메소드를 통해 최적화
//        student1.name = "김씨";
//        student1.age = 18;
//        student1.grade = 20;
        initStudent(student1,"학생1" , 20 , 90); // 메소드에 값을 부여해서 호출
        initStudent(student2 , "학생2" , 30, 60);
        ChangeValueFromMethod(student1);
        ChangeValueFromMethod(student2);
    }
    static void initStudent(Student student , String name, int age, int grade) { // Student 참조값과 부여할 변수 값들 전달받음.
        student.name = name;
        student.age = age;
        student.grade = grade;
    }


    static void ChangeValueFromMethod(Student student){ // 참조값 호출 특징에 따라 student 객체 값이 변경 됌
        System.out.println("이름: " +   student.name + " 나이: "  + student.age + " 성적:  "  + student.grade);
    }
}
