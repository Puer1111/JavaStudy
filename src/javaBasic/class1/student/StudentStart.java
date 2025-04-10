package javaBasic.class1.student;

public class StudentStart {
    public static void main(String[] args) {
//      클래스를 통한 객체 생성
//      학생이라는 클래스에 존재하는 필드 ( 이름 , 나이 , 점수 )
//      필드에 값을 부여 함으로써 객체 생성 완료
//      참조값 예시 : 집(객체)을 구매하였는데 집 주소(참조값)를 모르면 집에 접근이 불가능함.
//      따라서 해당 주소를 변수에 반환해서 저장.
        Student student1 = new Student(); // 객체 생성 시 new Student 를 통해 참조값 주소 생성 후 student1에 반환
        student1.name="학생1";
        student1.age=10;
        student1.grade=90;

//      System.out.println("참조값: " + student1);

        Student student2 = new Student();
        student2.name="학생2";
        student2.age=20;
        student2.grade=80;

//       System.out.println("참조값: " + student2);

        Student[] students = {student1,student2}; // 배열 크기값을 지정해서 생성
//        students[0] = student1; // 배열에 객체가 들어가는게 아니라 객체의 참조값만 복사해서 들어간다.
//        students[1] = student2;

//        System.out.println(students[0].name +" " + students[0].age+" " + students[0].grade+" ");
//        System.out.println(students[1].name +" " + students[1].age+" " + students[1].grade+" ");

        for(Student student : students){ // 간편하게 여러개의 학생 객체에 대한 정보를 반복문을 통한 출력
            System.out.println("이름: " + student.name + " 나이: "  + student.age + " 점수: " +   student.grade);
        }
    }
}
