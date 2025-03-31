package class2;

public class NullPointerException2 {
    public static void main(String[] args) {
        BigData bigData = new BigData();
        System.out.println("bigData: " + bigData.count); // count 는 멤버 변수기 때문에 0으로 초기화
        System.out.println("bigData2: " + bigData.data); // data는 Data 객체 참조하기 때문에 null
        bigData.data = new Data();  // bigData가 참조하는 Data를 객체 생성 시 null이 아니기에 오류 해결
        System.out.println("bigData3: " + bigData.data.value); // data가 null로 초기화 되버렸기 때문에 value 참조 불가능. nullExceptionPointer 발생.
    }
}
