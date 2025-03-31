package class7.static1;

public class DataCountMain1 {
    public static void main(String[] args) {

        Data1 data1 = new Data1("A");
        System.out.println("A Count = " + data1.count);

        Data1 data2 = new Data1("B");
        System.out.println("B Count = " + data2.count);

        Data1 data3 = new Data1("C");
        System.out.println("C Count = " + data3.count);

        // 인스턴스에 사용되는 멤버 변수 Count 는 같은 인스턴스 끼리 공유하지 않는다. 그래서 Count가 3이 아니라 각자 1 1 1 인것이다.
    }

}
