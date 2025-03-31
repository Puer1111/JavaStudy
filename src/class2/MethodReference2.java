package class2;

public class MethodReference2 {
    public static void main(String[] args) {
//      객체 생성 과정과 메소드 호출을 통한 객체 정보 기입 과정 한차례 최적화
        Student student1 = createStudent("학생1" , 15 , 90);
        Student student2 = createStudent("학생2" , 15 , 90);
        printStudent(student1);
        printStudent(student2);
    }
    static Student createStudent(String name, int age, int grade) {
        Student student = new Student();
        student.name = name;
        student.age = age;
        student.grade = grade;
        return student;
    }

    static void printStudent(Student student){ // 참조값 호출 특징에 따라 student 객체 값이 변경 됌
        System.out.println("이름: " +student.name + " 나이: "  + student.age +" 성적:  "+ student.grade);
    }
}
