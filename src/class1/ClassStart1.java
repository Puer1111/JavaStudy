package class1;

public class ClassStart1 {
    public static void main(String[] args) {
//       배열 사용의 한계
//       사람마다 이름, 나이 , 점수를 기준으로 배열 생성 시 인덱스 순서가 맞아야 한다.
//       사람이 관리하기에 좋은 코드가 아님.

        String [] studentNames = {"학생1","학생2"};
        int [] studentAges = {15,16};
        int [] studentGrades = {90,80};
//
//        for(String Names:studentNames){
//            System.out.println(Names);
//        }
//        for(int Ages : studentAges){
//            System.out.println(Ages);
//        }
//        for(int Grades : studentGrades){
//            System.out.println(Grades);
//        }
        for(int i =0; i<studentNames.length; i++){
            System.out.println("이름: "+studentNames[i] + " 나이: "+studentAges[i] + " 점수: "+studentGrades[i]);
        }
    }
}
