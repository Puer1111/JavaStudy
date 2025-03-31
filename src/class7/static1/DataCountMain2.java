package class7.static1;

public class DataCountMain2 {
    public static void main(String[] args) {

        Counter counter = new Counter();

        Data2 data = new Data2("A",counter);
        System.out.println("A Count = " + counter.count);

        Data2 data2 = new Data2("B",counter);
        System.out.println("B Count = " + counter.count);

        // counter 인스턴스를 "공용"으로 사용하기에 값이 제대로 증가함.
        // A의 count , B의 count 변수가 아닌 Counter 객체에 count로 Data2의 객체가 생성될 때마다 같이 속한 Counter의 count 가 증가하는 것.
        // 단점 : Data2 에 관련 된 일이지만 Counter 라는 새 클래스를 생성해야 함. + 생성자에 계속 추가해야함.
        // 해결: 그걸 위한 "Static" 변수가 존재 한다.
    }
}
